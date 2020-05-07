package mapreduce.log;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;

public class MyKey implements WritableComparable<MyKey> {
	private String productId;
	private String userId;
	
	public MyKey() {
		// TODO Auto-generated constructor stub
	}

	public MyKey(String productId, String userId) {
		super();
		this.productId = productId;
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		productId = WritableUtils.readString(in);
		userId = WritableUtils.readString(in);
	}

	@Override
	public void write(DataOutput out) throws IOException {
		WritableUtils.writeString(out, productId);
		WritableUtils.writeString(out, userId);
	}

	@Override
	public int compareTo(MyKey obj) {
		int result = productId.compareTo(obj.productId);
		if(result == 0) {
			result = userId.compareTo(obj.userId);
		}
		return result;
	}

	@Override
	public String toString() {
		return (new StringBuffer().append(productId).append("\t")).toString();
	}
	
	
	
	
}
