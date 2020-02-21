package mapred.exam.stock.option;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StockOptionMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private String resultType;
	private static final IntWritable outputVal = new IntWritable(1);
	private Text outputKey = new Text();

	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		resultType = context.getConfiguration().get("resultType");
	}
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if(key.get() > 0) {
			String[] line = value.toString().split(",");
			if(line != null & line.length > 0) {
				float result = Float.parseFloat(line[6]) - Float.parseFloat(line[3]);
				if(resultType.equals("increase")) {
					if(result > 0.0f) {
						outputKey.set(line[2].substring(0, 4));
						context.write(outputKey, outputVal);
					}
				} else if(resultType.equals("decrease")) {
					if(result < 0.0f) {
						outputKey.set(line[2].substring(0, 4));
						context.write(outputKey, outputVal);
					}
				} else if(resultType.equals("equal")) {
					if(result == 0.0f) {
						outputKey.set(line[2].substring(0, 4));
						context.write(outputKey, outputVal);
					}
				}
			}
		}
	}
}
