package mapreduce.air.combiner;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class AirCombinerDriver extends Configured implements Tool {
	
	@Override
	public int run(String[] optionList) throws Exception {
		GenericOptionsParser parser = new GenericOptionsParser(getConf(), optionList);
		String[] otherArgs = parser.getRemainingArgs();

		Job job = new Job(getConf(), "aircombiner");	// job이름은 그냥 표시되는 이름이지만 어떤 job인지 구분하기 위한 이름이기 때문에 바꾸는 게 좋음
		
		job.setMapperClass(AirCombinerMapper.class);	// 어떤 클래스를 먼저 정의하든지 순서는 상관없음
		job.setCombinerClass(AirCombinerReducer.class); 
		job.setReducerClass(AirCombinerReducer.class);
		job.setJarByClass(AirCombinerDriver.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
		FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
		
		job.waitForCompletion(true);
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		ToolRunner.run(new Configuration(), new AirCombinerDriver(), args);
	}
}
