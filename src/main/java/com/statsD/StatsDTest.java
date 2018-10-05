package com.statsD;

import java.io.IOException;
import java.net.UnknownHostException;

public class StatsDTest {
 public static void main(String[] args){
	  StatsdClient client = null;
	try {
		client = new StatsdClient("127.0.0.1", 8125);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      client.increment("statsd.login.error");
      client.gauge("statsd.user", 100);
 }
}
