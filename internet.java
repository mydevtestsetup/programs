package javabeat.net.core;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

public class internet {
	public static void main(String args[]){
				URL url = new URL("https://www.google.com");
				System.out.println(url.getHost());
				HttpURLConnection con = (HttpURLConnection) url
						.openConnection();
				con.connect();
				if (con.getResponseCode() == 200){
					System.out.println("Connection established!!");
				}
			} catch (Exception exception) {
				System.out.println("No Connection");
			}
		} catch (Exception e) {
			e.printStackTrace();
}
