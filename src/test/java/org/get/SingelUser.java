package org.get;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
	
public class SingelUser {


	public static void main(String[] args) throws IOException, ParseException {
		
			FileReader fileReader = new FileReader("D:\\eclipse-workspace\\APITesting\\src\\test\\resources\\SimpleUser.json");
			JSONParser jsonParser = new JSONParser();
			Object parse = jsonParser.parse(fileReader);
			
			JSONObject jsonObject = (JSONObject)parse;
			Object object = jsonObject.get("data");
			
			
			Object object2 = jsonObject.get("data");
			JSONObject jsonObject2 = (JSONObject) object2;
			Object jobject = jsonObject2.get("id");
			System.out.println(jobject);
			
			Object object3 = jsonObject.get("data");
			JSONObject jsonObject3 = (JSONObject) object3;
			Object jobject1 = jsonObject3.get("email");
			System.out.println(jobject1);
			
			Object object4 = jsonObject.get("data");
			JSONObject jsonObject4 = (JSONObject) object4;
			Object jobject2 = jsonObject4.get("first_name");
			System.out.println(jobject2);
			
			Object object5 = jsonObject.get("data");
			JSONObject jsonObject5 = (JSONObject) object5;
			Object jobject3 = jsonObject5.get("last_name");
			System.out.println(jobject3);
			
			Object object6 = jsonObject.get("data");
			JSONObject jsonObject6 = (JSONObject) object6;
			Object jobject4 = jsonObject6.get("avatar");
			System.out.println(jobject4);
			
			JSONObject a = (JSONObject)parse;
			Object object7 = a.get("support");
			
			
			Object object8 = jsonObject.get("support");
			JSONObject jsonObject8 = (JSONObject) object8;
			Object jobject6 = jsonObject8.get("url");
			System.out.println(jobject6);
			
			Object object9 = jsonObject.get("support");
			JSONObject jsonObject9 = (JSONObject) object9;
			Object jobject9 = jsonObject9.get("text");
			System.out.println(jobject9);
			
			
			
			
			
		}

}


