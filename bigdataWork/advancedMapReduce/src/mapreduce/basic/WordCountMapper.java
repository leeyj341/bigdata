package mapreduce.basic;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
			
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	static final IntWritable outputVal = new IntWritable(1);
	Text outputKey = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {

		StringTokenizer strtok = new StringTokenizer(value.toString()," ");
		while (strtok.hasMoreTokens()) {
			String token = strtok.nextToken();
			outputKey.set(token);					
			context.write(outputKey, outputVal);	
		}
	}
}
