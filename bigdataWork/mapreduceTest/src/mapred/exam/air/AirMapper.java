package mapred.exam.air;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private static final IntWritable outputVal = new IntWritable(1);
	private Text outputKey = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		if(key.get() > 0) {
			String[] line = value.toString().split(",");
			
			outputKey.set(line[1]);
			String delay = line[15];
			
			if(!delay.equals("NA")) {
				if(Integer.parseInt(delay) > 0) {
					context.write(outputKey, outputVal);
				}
			}
		}
	}
}
