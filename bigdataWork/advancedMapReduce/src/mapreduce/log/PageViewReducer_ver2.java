package mapreduce.log;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class PageViewReducer_ver2 extends Reducer<MyKey, Text, Text, Text> {
	private Text resultKey = new Text();
	private Text resultVal = new Text();
	
	@Override
	protected void reduce(MyKey key, Iterable<Text> values, Reducer<MyKey, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		int clickSum = 0;
		int userSum = 0;
		
		String beforeUser = "";
		
		for (Text userId : values) {
			String currentUser = userId.toString();

			if(!beforeUser.equals(currentUser)) {
				userSum++;							// 사용자가 다른 경우
			}
			clickSum++;								// 하나의 상품에 접속한 모든 횟수
			
			beforeUser = currentUser;
		}
		//상품코드가 바뀔때마다 출력
		
		resultKey.set(key.getProductId());
		resultVal.set((new StringBuffer().append(userSum).append("\t").append(clickSum)).toString());
		context.write(resultKey, resultVal);
	}
}
