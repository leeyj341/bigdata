package mapred.exam.air.option;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
//하둡을 실행할 때 사용자가 입력하는 옵션을 Mapper내부에서 사용할 수 있도록
//옵션이 어떤 값으로 입력되었냐에 따라 다른 작업을 할 수 있도록 처리
public class AirOptionMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private String jobType; // 사용자가 입력하는 옵션값을 저장하기 위한 변수
	private static final IntWritable outputVal = new IntWritable(1);
	private Text outputKey = new Text();
	
	//Mapper실행될 때 한 번만 실행되는 메서드
	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		/*		
		 * -D 옵션과 함께 사용자가 입력하는 jobType이라는 옵션의 지정한 값을 추출해서 Mapper에 선언된 변수에 저장
		 */		
		jobType = context.getConfiguration().get("jobType");
	}
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// value는 한 줄을 읽어온 값 즉, 한 줄 당 map메서드 한 번 실행
		if(key.get() > 0) {
			String[] line = value.toString().split(",");
			if(line != null & line.length > 0) {
				if(jobType.equals("departure")) {
					//출발 지연
					String delay = line[15];
					if(!delay.equals("NA") && Integer.parseInt(delay) > 0) {
						outputKey.set(line[1]);
						context.write(outputKey, outputVal);
					}
				} else if(jobType.equals("arrival")) {
					//도착 지연
					String delay = line[14];
					if(!delay.equals("NA") && Integer.parseInt(delay) > 0) {
						outputKey.set(line[1]);
						context.write(outputKey, outputVal);
					}
				}
			}
		}
	}
}
