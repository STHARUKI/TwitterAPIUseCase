package com.twitter.configuration;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

//Twitter配置

public class GetConfiguration {
	//使用多个Keys and tokens
    public Twitter getNewInstance(int arg){
    	GetKeys key = new GetKeys();
    	String[] keys = key.getKeys(arg);
    	//由于TwitterAPI存在访问限制，这里的Keys and tokens我申请了10个，arg代表使用第几个Keys and tokens
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    		.setOAuthConsumerKey(keys[0])
    		.setOAuthConsumerSecret(keys[1])
    		.setOAuthAccessToken(keys[2])
    		.setOAuthAccessTokenSecret(keys[3])
    		//这四个key设置的参数要看申请的twitterAPP中的Keys and tokens
    		.setHttpProxyHost("127.0.0.1")
    		.setHttpProxyPort(8787);
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	//Twitter twitter = tf.getSingleton();
    	Twitter twitter = tf.getInstance();
    	return twitter;
    }
    //仅使用1个Keys and tokens
    /*public Twitter getNewInstance(){
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    		.setOAuthConsumerKey("ConsumerKey")
    		.setOAuthConsumerSecret("ConsumerSecret")
    		.setOAuthAccessToken("AccessToken")
    		.setOAuthAccessTokenSecret("AccessTokenSecret")
    		//这四个key设置的参数要看申请的twitterAPP中的Keys and tokens
    		.setHttpProxyHost("127.0.0.1")
    		.setHttpProxyPort(8787);
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	//Twitter twitter = tf.getSingleton();
    	Twitter twitter = tf.getInstance();
    	return twitter;
    }*/

}