import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RequestParser {
	public static Request parse(List<String>request){
		String[] firstLine = request.remove(0).split(" ");
		Map<String,String> headersMap = new HashMap<String,String>();
		for (String string : request) {
			
			String[] temp = string.split(":");
			headersMap.put(temp[0],temp[1]);
			
			
		}
		Request req = new Request(firstLine[0], firstLine[1],firstLine[2],null,headersMap);
		
		return req;
		
	}
}
