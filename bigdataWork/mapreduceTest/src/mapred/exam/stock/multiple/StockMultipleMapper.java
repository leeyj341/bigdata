package mapred.exam.stock.multiple;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StockMultipleMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private static final IntWritable outputVal = new IntWritable(1);
	private Text outputKey = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if(key.get() > 0) {
			String[] line = value.toString().split(",");
			if(line != null & line.length > 0) {
				String year = line[2].substring(0, 4);
				float result = Float.parseFloat(line[6]) - Float.parseFloat(line[3]);
				if(result > 0.0f) {
					outputKey.set("up," + year);
					context.write(outputKey, outputVal);
				} else if(result < 0.0f) {
					outputKey.set("down," + year);
					context.write(outputKey, outputVal);
				} else if(result == 0.0f) {
					outputKey.set("equal," + year);
					context.write(outputKey, outputVal);
				}
			}
		}
	}
}
