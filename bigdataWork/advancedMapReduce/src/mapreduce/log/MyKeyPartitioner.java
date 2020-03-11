package mapreduce.log;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MyKeyPartitioner extends Partitioner<MyKey, Text> {
	@Override
	public int getPartition(MyKey key, Text value, int numPartitions) {
		return key.getProductId().hashCode() % numPartitions;
	}
}
