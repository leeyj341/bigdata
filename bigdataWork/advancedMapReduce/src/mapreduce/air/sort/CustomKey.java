package mapreduce.air.sort;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;
//복합키를 정의 - 사용자정의 키 (정렬할 기준을 컬럼으로 갖고 있는 객체)
//맵리듀스 프레임워크 내부에서 key와 value는 네트워크에서 주고받는 값이므로
//네트워크 전송을 하기 위해 제공되는 Writable타입이어야 한다.
//따라서 WritableComparable을 상속받아 작성한다.
public class CustomKey implements WritableComparable<CustomKey>{

	private String year;
	private	Integer month;
	private Long mapkey;
	
	public CustomKey() {
		// TODO Auto-generated constructor stub
	}
	public CustomKey(String year, Integer month) {
		super();
		this.year = year;
		this.month = month;
	}
	public CustomKey(String year, Integer month, Long mapkey) {
		super();
		this.year = year;
		this.month = month;
		this.mapkey = mapkey;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}
	
	public Long getMapkey() {
		return mapkey;
	}
	
	public void setMapkey(Long mapkey) {
		this.mapkey = mapkey;
	}
	
	@Override
	public String toString() {
		return (new StringBuffer().append(year).append(",").append(month)).toString();
	}
	//데이터를 쓰고 읽는 작업을 처리
	//데이터를 쓰기 - 직렬화
	//데이터를 읽기 - 역직렬화
	//하둡의 맵리듀스 내부에서 이런 작업을 처리할 수 있도록 구현된 메서드를 호출해서 처리한다.
	
	@Override
	public void write(DataOutput out) throws IOException {
		WritableUtils.writeString(out, year);
		out.writeInt(month);
		out.writeLong(mapkey);
	}
	//역직렬화 될 때 호출
	@Override
	public void readFields(DataInput in) throws IOException {
		year = WritableUtils.readString(in);
		month = in.readInt();
		mapkey = in.readLong();
	}
	
	//사용자가 만들어놓은 키를 기준으로 정렬하기 위해서 비교하게 할 메서드
	//year로 비교 year가 같으면 month로 비교
	@Override
	public int compareTo(CustomKey obj) {
		int result = year.compareTo(obj.year);
		if(result == 0) {//year가 같다.
			result = month.compareTo(obj.month);
		}
		return result;
	}
}
