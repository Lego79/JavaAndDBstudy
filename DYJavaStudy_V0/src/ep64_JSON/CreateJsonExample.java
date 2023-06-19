package ep64_JSON;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {

	public static void main(String[] args) throws Exception {
		
		JSONObject root = new JSONObject();
		
		root.put("id", "winter");
		root.put("name", "겨울");
		root.put("age", 25);
		root.put("student", true);
		
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel);
		
		JSONArray skill = new JSONArray();
		skill.put("Java");
		skill.put("C");
		skill.put("C#");
		root.put("skill", skill);
		
		//json 얻기
		String json = root.toString();
		
		System.out.println(json);
		
		Writer writer = new FileWriter("c:/Temp/member.json", Charset.forName("UTF-8"));
		
		writer.write(json);
		writer.flush();
		writer.close();
		
	}

}
