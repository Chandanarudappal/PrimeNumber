package assignment.Assignment;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class WriteDataInJSon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//creating json object
		
		JSONObject obj=new JSONObject();
		//creating key value pairs
		obj.put("Employee id", "1234");
		obj.put("first name", "abc");
		obj.put("last name", "xyz");
		obj.put("city","Hubli");
		
		FileWriter file = new FileWriter(".\\JSonFiles\\WrittenData.json");
		file.write(obj.toJSONString());
		file.close();
		
		System.out.println("Data is written");
		
		

	}

}
