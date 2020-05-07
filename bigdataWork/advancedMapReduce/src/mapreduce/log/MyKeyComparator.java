package mapreduce.log;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class MyKeyComparator extends WritableComparator {
	public MyKeyComparator() {
		super(MyKey.class, true);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public int compare(WritableComparable obj1, WritableComparable obj2) {
		MyKey key1 = (MyKey)obj1;
		MyKey key2 = (MyKey)obj2;
		
		return key1.compareTo(key2);
	}
}
