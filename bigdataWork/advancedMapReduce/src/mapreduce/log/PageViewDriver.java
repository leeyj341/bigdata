package mapreduce.log;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class PageViewDriver extends Configured implements Tool {
	@Override
	public int run(String[] optionList) throws Exception {
		GenericOptionsParser parser = new GenericOptionsParser(getConf(), optionList);
		String[] otherArgs = parser.getRemainingArgs();

		Job job = new Job(getConf(), "page_view");	// job이름은 그냥 표시되는 이름이지만 어떤 job인지 구분하기 위한 이름이기 때문에 바꾸는 게 좋음
		
		job.setMapperClass(PageViewMapper_ver2.class);	// 어떤 클래스를 먼저 정의하든지 순서는 상관없음
		job.setReducerClass(PageViewReducer_ver2.class);
		job.setJarByClass(PageViewDriver.class);
		
		//Shuffle할때 사용할 클래스를 사용자정의 클래스가 실행되도록 등록
		job.setPartitionerClass(MyKeyPartitioner.class);
		job.setGroupingComparatorClass(GroupKeyComparator.class);
		job.setSortComparatorClass(MyKeyComparator.class);
		job.setMapOutputKeyClass(MyKey.class);
		job.setMapOutputValueClass(Text.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		
		FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
		FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
		
		job.waitForCompletion(true);
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		ToolRunner.run(new Configuration(), new PageViewDriver(), args);
	}

}
