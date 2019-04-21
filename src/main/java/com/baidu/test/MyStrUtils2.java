package com.baidu.test;

public class MyStrUtils2 {
/*
 *1.周考练习题:
 要求:封装一个工具类,传入一个参数,要求校验该参数是否为数字型,如果是则返回true,否则返回false
//示例:
public Boolean getValue(String str1){
 
 return  
}
 * */
	
	public static boolean isNumber(String validString) {
		if(validString==null && validString.trim().length()==0) {
			return false;
		}
		
		byte[] tempbyte = validString.getBytes();
		for (int i = 0; i < validString.length(); i++) {
			if((tempbyte[i]==45) && (i==0)) {
				continue;
			}
			if((tempbyte[i]<48) || (tempbyte[i]>57)) {
				return false;
			}
		}
		return true;
	}
	
}
