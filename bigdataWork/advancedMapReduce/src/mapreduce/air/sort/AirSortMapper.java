package mapreduce.air.sort;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirSortMapper extends Mapper<LongWritable, Text, CustomKey, IntWritable> {
	private static final IntWritable outputVal = new IntWritable(1);
	private CustomKey outputKey = new CustomKey();
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, CustomKey, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// value는 한 줄을 읽어온 값 즉, 한 줄 당 map 메서드 한 개가 실행된다.
		if(key.get() > 0) {
			String[] line = value.toString().split(",");
			
			String delay = line[15];
			
			if(!delay.equals("NA") && Integer.parseInt(delay) > 0) {
				outputKey.setYear(line[0]);
				outputKey.setMonth(new Integer(line[1]));
				outputKey.setMapkey(key.get());
				context.write(outputKey, outputVal);
			}
		}
	}
}
