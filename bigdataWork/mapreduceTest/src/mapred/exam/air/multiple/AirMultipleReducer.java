package mapred.exam.air.multiple;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class AirMultipleReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	private IntWritable resultVal = new IntWritable();
	private Text resultKey = new Text();
	private MultipleOutputs<Text, IntWritable> multiOut;
	
	@Override
	protected void setup(Reducer<Text, IntWritable, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		multiOut = new MultipleOutputs<Text, IntWritable>(context);
	}
	
	@Override
	protected void cleanup(Reducer<Text, IntWritable, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		multiOut.close();
	}
	
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		String[] data = key.toString().split(",");
		resultKey.set(data[1]);
		AirMultipleReducer.setSumResult(values, resultVal);
		
		if(data[0].equals("departure")) {
			multiOut.write("departure", resultKey, resultVal);
		} else if(data[0].equals("arrival")) {
			multiOut.write("arrival", resultKey, resultVal);
		} else if(data[0].equals("departureNA")) {
			multiOut.write("departureNA", resultKey, resultVal);
		} else if(data[0].equals("arrivalNA")) {
			multiOut.write("arrivalNA", resultKey, resultVal);
		}
	}
	
	public static void setSumResult(Iterable<IntWritable> values, IntWritable resultValue) {
		int sum = 0; 
		for (IntWritable value : values) {
			sum += value.get();
		}
		resultValue.set(sum);
	}
}
