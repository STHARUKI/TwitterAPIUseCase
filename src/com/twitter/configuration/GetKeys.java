package com.twitter.configuration;

//Keys and tokens
//TwitterAPI 存在访问限制，详见https://developer.twitter.com/en/docs/basics/rate-limits
//具体某个API的访问限制详见https://developer.twitter.com/en/docs/api-reference-index
//因为访问限制的存在，如果要获取大量数据，最好多申请几个Keys and tokens
//现在TwitterAPP的申请不像之前那么简单，如果需要Keys and tokens可以Email给我：37sang2013@gmail.com
public class GetKeys {
	public String[] getKeys(int arg) {
		String[] consumerKey = new String[10];
		String[] consumerSecret = new String[10];
		String[] accessToken = new String[10];
		String[] accessTokenSecret = new String[10];
		
		
		
		
		String[] re = new String[4];
		re[0] = consumerKey[arg];
		re[1] = consumerSecret[arg];
		re[2] = accessToken[arg];
		re[3] = accessTokenSecret[arg];
		return re;
	}
}
