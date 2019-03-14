package com.twitter.configuration;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

//Twitter����

public class GetConfiguration {
	//ʹ�ö��Keys and tokens
    public Twitter getNewInstance(int arg){
    	GetKeys key = new GetKeys();
    	String[] keys = key.getKeys(arg);
    	//����TwitterAPI���ڷ������ƣ������Keys and tokens��������10����arg����ʹ�õڼ���Keys and tokens
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    		.setOAuthConsumerKey(keys[0])
    		.setOAuthConsumerSecret(keys[1])
    		.setOAuthAccessToken(keys[2])
    		.setOAuthAccessTokenSecret(keys[3])
    		//���ĸ�key���õĲ���Ҫ�������twitterAPP�е�Keys and tokens
    		.setHttpProxyHost("127.0.0.1")
    		.setHttpProxyPort(8787);
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	//Twitter twitter = tf.getSingleton();
    	Twitter twitter = tf.getInstance();
    	return twitter;
    }
    //��ʹ��1��Keys and tokens
    /*public Twitter getNewInstance(){
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    		.setOAuthConsumerKey("ConsumerKey")
    		.setOAuthConsumerSecret("ConsumerSecret")
    		.setOAuthAccessToken("AccessToken")
    		.setOAuthAccessTokenSecret("AccessTokenSecret")
    		//���ĸ�key���õĲ���Ҫ�������twitterAPP�е�Keys and tokens
    		.setHttpProxyHost("127.0.0.1")
    		.setHttpProxyPort(8787);
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	//Twitter twitter = tf.getSingleton();
    	Twitter twitter = tf.getInstance();
    	return twitter;
    }*/

}