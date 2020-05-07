package mapred.exam01;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapperExam extends Mapper<LongWritable, Text, Text, IntWritable> {
	private static final IntWritable outputVal = new IntWritable(1);
	private Text outputKey = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		StringTokenizer strtok = new StringTokenizer(value.toString());
		
		while (strtok.hasMoreTokens()) {
			String token = strtok.nextToken();
			if(token.length() > 5) {
				outputKey.set(token);
				context.write(outputKey, outputVal);
			}	
		}
	}
}
