package com.twitter.configuration;

//Keys and tokens
//TwitterAPI ���ڷ������ƣ����https://developer.twitter.com/en/docs/basics/rate-limits
//����ĳ��API�ķ����������https://developer.twitter.com/en/docs/api-reference-index
//��Ϊ�������ƵĴ��ڣ����Ҫ��ȡ�������ݣ���ö����뼸��Keys and tokens
//����TwitterAPP�����벻��֮ǰ��ô�򵥣������ҪKeys and tokens����Email���ң�37sang2013@gmail.com
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
