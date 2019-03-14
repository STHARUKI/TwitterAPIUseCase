package com.twitter.mysql;

import twitter4j.User;

import java.sql.*;
import java.util.Date;
public class PushBasicInfo {

	
	
	public boolean pushBasicInfo(User user, Connection conn) {

		Statement sta = null;
		long userID = user.getId();
		String userName = user.getScreenName();
		int friendsNumber = user.getFriendsCount();
		int followersNumber = user.getFollowersCount();
		int favouriteNumber = user.getFavouritesCount();
		String useLanguage = user.getLang();
		String checkTime = new Date().toString();
		
		try {
			sta = conn.createStatement();
			String insertSqlComm = "INSERT INTO twi_user_basicinfo(userID,userName,friendsNumber,followersNumber,favouriteNumber,useLanguage,checkTime) "
									+ "VALUES(" + String.valueOf(userID) + ",'" 
					+ userName + "'," + String.valueOf(friendsNumber) + "," + String.valueOf(followersNumber) + ","
					+ String.valueOf(favouriteNumber) + ",'" + useLanguage + "'" + ",'" + checkTime + "');";
			//非常普通的SQL语句
			sta.execute(insertSqlComm);
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
