package shop.bigdata.comment;

import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CommentWordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private Text outputKey = new Text();
	private static final IntWritable outputVal = new IntWritable(1);
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		String[] line = value.toString().split(",");
		StringTokenizer stk = new StringTokenizer(line[2]);
		String patternStr = "은$||는$||이$||가$||의$||에$";
		
		while (stk.hasMoreTokens()) {
			String newWord = equalsPattern(stk.nextToken(), patternStr);
			outputKey.set(newWord);
			context.write(outputKey, outputVal);
		}
	}
	
	public static String equalsPattern(String str, String patternStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher m = pattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "");
		}
		m.appendTail(sb);
		return sb.toString();
	}
}
