package mapreduce.air.sort;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

//Partitional클래스에는 Mapper의 key와 value타입을 generic으로 명시
//year를 기준으로 해시코드를 구해서 같은 year를 갖고 잇는 데이터룰 같은 리듀서에세 작업할 수 있도록 분배
//==> 같은 것끼리 메모리버퍼에 쌓았다가 한꺼번에 전송
public class AirSortPartitioner extends Partitioner<CustomKey, IntWritable>{
	//numPartitions는 파티션의 갯수 = 리듀수태스크의 갯수
	@Override
	public int getPartition(CustomKey key, IntWritable value, int numPartitions) {
		return key.getYear().hashCode() % numPartitions;
	}

}
