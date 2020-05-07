package mapreduce.log;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class PageViewReducer extends Reducer<MyKey, Text, MyKey, Text> {
	private MyKey resultKey = new MyKey();
	private Text resultVal = new Text();
	
	@Override
	protected void reduce(MyKey key, Iterable<Text> values, Reducer<MyKey, Text, MyKey, Text>.Context context)
			throws IOException, InterruptedException {
		int clickSum = 0;
		int userSum = 0;
		
		String beforeUser = "";
		
		for (Text userId : values) {
			clickSum++;
			userSum++;

			if(beforeUser.equals(userId.toString())) {
				userSum--;
			}
			
			beforeUser = userId.toString();
		}
		
		resultKey.setProductId(key.getProductId());
		resultVal.set(Integer.toString(userSum) + "\t" + Integer.toString(clickSum));
		context.write(resultKey, resultVal);
	}
}
