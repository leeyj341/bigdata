package mapreduce.log;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class PageViewMapper_ver2 extends Mapper<LongWritable, Text, MyKey, Text> {
	private MyKey outputKey = new MyKey();
	private Text outputVal = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, MyKey, Text>.Context context)
			throws IOException, InterruptedException {
		String[] line = value.toString().split("\t");
		outputKey.setProductId(line[2]);
		outputKey.setUserId(line[9]);
		outputVal.set(outputKey.getUserId());
		
		context.write(outputKey, outputVal);
	}
}
