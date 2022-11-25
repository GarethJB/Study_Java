package common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class PublicAPI {
	private String key
	= "FPgj2NXbJw46TcGkmAfZEiYFDbxilys7KLjk3KaB7AfeJE00ZhPNM0M8unwbsI69fSmT8SNfVEimE6ZZ2U14hA%3D%3D";

	public String getKey() {//key 값을 알려줄 메소드
		return key;
	}
	
	//JSON library
	/*
	 	mvnrepository.com > json 검색 > JSON in java 클릭
	 	> 20220924 클릭 > FIles : View All 클릭
	 	> json-20220924.jar 클릭하여 다운로드 후 lib에 붙여넣기
	 	
	 	프로젝트 우클릭 > buildplass > configure build path
	 	> 
	 	
	  
	 */
	
	public JSONArray covidAPItoJSON (StringBuffer url) {
		JSONObject json = new JSONObject(requestAPI(url));
		JSONArray array = json.getJSONArray("data");
		return array;
	}

	//공공데이터 요청 메소드
	public String requestAPI(StringBuffer url) {
		String response = null;
		try {
			HttpURLConnection conn =
			(HttpURLConnection)new URL(url.toString()).openConnection();			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			BufferedReader reader; 
			if(conn.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			}else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "utf-8"));
			}
			
			String line;
			url = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				url.append(line);
			}
			response = url.toString();
			conn.disconnect();
			reader.close();
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//try catch
		return response;
	}//url()
	
}//class
