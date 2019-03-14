package com.twitter.main;

import java.sql.Connection;

import com.twitter.configuration.GetConfiguration;
import com.twitter.mysql.GetConn;
import com.twitter.mysql.PushBasicInfo;

import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

public class Main {
	
	private static GetConfiguration conf = new GetConfiguration();
	private static String username = "mimori_suzuko";
	private static Twitter twitter = conf.getNewInstance(1);
	private static Connection conn = GetConn.getConnection();
	
	public static void main(String[] args) throws TwitterException {
		User user = twitter.showUser(username);
		long userID = user.getId();
		PushBasicInfo pushBasicInfo = new PushBasicInfo();
		PagableResponseList<User> followersList = twitter.getFollowersList(userID, -1);
		do {
			for(int i = 0; i < followersList.size(); ++i) {
				pushBasicInfo.pushBasicInfo(followersList.get(i), conn);
			}
			followersList = twitter.getFollowersList(userID, followersList.getNextCursor());
		} while(followersList.hasNext());
	}
	
}
