package mapred.exam.stock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StockMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private static final IntWritable outputVal = new IntWritable(1);
	private Text outputKey = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		if(key.get() > 0) {
			/*String[] line = value.toString().split(",");
			if(line != null & line.length > 0) {
				String year = line[2].substring(0,4);
				float open = Float.parseFloat(line[3]);
				float close = Float.parseFloat(line[6]);
				
				if(close - open > 0.0f) {
					outputKey.set(year);
					context.write(outputKey, outputVal);
				}
			}*/
			
			StringTokenizer strtok = new StringTokenizer(value.toString(), ",");
			ArrayList<String> keys = new ArrayList<String>();
			while (strtok.hasMoreTokens()) {
				keys.add(strtok.nextToken());
			}
			
			outputKey.set(keys.get(2).substring(0, 4));
			if(Float.parseFloat(keys.get(6)) - Float.parseFloat(keys.get(3)) > 0.0f) {
				context.write(outputKey, outputVal);
			}
		}
	}
}
