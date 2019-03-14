package com.twitter.networktest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class Main {

	public static void main(String[] args) throws IOException {
      //ÍøÂç¼à²â
	  URL url = new URL("http://www.google.com");
      URLConnection connection = url.openConnection();
      connection.connect();
      InputStream inputStream = connection.getInputStream();
      byte[] bytes = new byte[1024];
      while (inputStream.read(bytes) >= 0) {
          System.out.println(new String(bytes));
      }
	}
}
