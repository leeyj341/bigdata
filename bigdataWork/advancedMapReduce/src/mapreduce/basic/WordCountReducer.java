package mapreduce.basic;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	private IntWritable resultVal = new IntWritable();
	private Text appenddata = new Text();
	private String data = "";
	private Text resultKey = new Text();
		
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		int sum = 0;
		data = data + "reduce 호출";
		appenddata.set(data);
		for (IntWritable value : values) {	
			sum += value.get();
		}
		resultVal.set(sum);
		resultKey.set(key + ":" + appenddata);
		context.write(resultKey, resultVal);		
	}
}
