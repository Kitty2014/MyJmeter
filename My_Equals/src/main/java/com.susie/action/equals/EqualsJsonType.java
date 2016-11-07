package com.susie.action.equals;

//import org.apache.jmeter.assertions.AssertionResult;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Iterator;

public class EqualsJsonType {
	private static String log1;
	private String message;
	private static Logger log = (Logger) LoggerFactory.getLogger(EqualsJsonType.class);

	public EqualsJsonType() {
		// TODO Auto-generated constructor stub
		System.out.println("init!");
	}
    private String fatherName = "";
	private String equalsJsonType(JSONObject standardJson, JSONObject responseJson) {//输入两个json，判断第一个里面的所有字段在第二个中的类型是否相同
		String err_message = ""; 
		Iterator it = standardJson.keys(); // 储存所有要验证的Key
	     while (it.hasNext()) {
	          String key = (String) it.next();
	          String thisKeyType = standardJson.get(key).getClass().getName(); //获取当前Key的标准type

	          if(!responseJson.has(key)){ //判断response中有无当前Key
	             log1 = "------ExistError: " + fatherName + key + " Not found.";
	             err_message = (err_message + "\n" + log1);
	          }

			  else if(standardJson.isNull(key)) { // 标准类型为NULL：判断响应字段是否也为NULL
				  if(!responseJson.isNull(key)){
					  log1 = "------TypeError : "  + fatherName + key + " should be NULL!";
					  err_message = (err_message + "\n" + log1);
				  }
			  }
	          else{  //response中找到Key了，再判断type
	               String respKeyType = responseJson.get(key).getClass().getName(); // 获取响应的字段类型

	               if(respKeyType.equals(thisKeyType)){
	                    if(thisKeyType.equals("org.json.JSONObject")){ // object类型的字段继续往内层判断
							fatherName += key +"->";
	                        err_message += equalsJsonType(standardJson.getJSONObject(key), responseJson.getJSONObject(key)); // !!进入递归时，保存当前错误信息
							fatherName = fatherName.replace(key+"->","");
	                    }
	                }
	                else {
	                	String log1 = "------TypeError : "  + fatherName + key + " is " + respKeyType + " (should be " + thisKeyType + ")";
	                    err_message = (err_message + "\n" + log1);
	                }
	            }
	        }
	     return err_message;
	}
	public Boolean respTypeAssertion(String standardData, String resData) { //输入标准响应，转为json并调用比较函数，得到断言结果
	    log.info("res: " + resData);
	    JSONObject standardJson = new JSONObject(standardData);
	    JSONObject jo = new JSONObject(resData);
		JSONObject responseJson = jo.getJSONObject("data");
		message = equalsJsonType(standardJson, responseJson);
	    log.info("------------------------ResultMessage--------------------" + message);
		if(message.replaceAll(" ","").equals("")){    //如果错误信息是空，说明断言结果通过
	    	return true;
	    }
	    return false;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
