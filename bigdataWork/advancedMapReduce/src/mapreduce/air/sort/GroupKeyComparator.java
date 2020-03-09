package mapreduce.air.sort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class GroupKeyComparator extends WritableComparator{
	public GroupKeyComparator() {
		super(CustomKey.class, true);
	}
	
	//WritableComparable의 타입이 불분명하기 때문에 발생하는 warning을
	//무시하고 타입 체크를 하지 않고 처리하겠다는 의미
	@SuppressWarnings("rawtypes")
	@Override
	public int compare(WritableComparable obj1, WritableComparable obj2) {
		CustomKey key1 = (CustomKey)obj1;
		CustomKey key2 = (CustomKey)obj2;
		
		return key1.getYear().compareTo(key2.getYear());
	}
	
	
}
