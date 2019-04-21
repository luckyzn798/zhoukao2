package com.baidu.test;

public class MyStrUtils {
/*
 * 1.周考练习题:
 要求:封装一个工具类,传入两个参数,要求返回该字符串从start长度开始,以后的字符以*代替.如:
传入 八维教育学院 经过处理后,返回 八维****
//示例:
public String getValue(String str1,int start){
 
 return  
}
 * */
	
	public static String hidden(String src,int start) {
		if(src==null) {
			return null;
		}
		char[] cs = src.toCharArray();
		StringBuilder reBuilder=new StringBuilder();
		for (int i = 0; i < cs.length; i++) {
			reBuilder.append(i>=start?'*':cs[i]);
		}
		return reBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(hidden("八维教育学院", -2));
	}
	
	
}
