package collection;

import java.util.HashMap;

public class Ex08 {
	public static void main(String[] args) throws Exception {
		String url = "https://search.naver.com/search.naver";
		url += "?";
		
		HashMap<String, String> param = new HashMap<>();
		param.put("query", "뉴진스 하니");	// key : value
		param.put("where", "image");		// key : value
		
		// 띄어쓰기를 인식하여 적용하고 싶을때
		param.put("query",param.get("query").replace(" ", "%20"));
		// 띄어쓰기의 아스키코드 : 32   --16진수로 변환-->   20
		
		for(String key : param.keySet()) {	// keySet = query, where
			String value = param.get(key);
			url += key + "=" + value + "&";
		}
		
		Runtime rt = Runtime.getRuntime();
		String chromePath = "C:\\program Files\\Google\\Chrome\\Application\\chrome.exe";
		rt.exec(chromePath + " " + url);
	}

}
