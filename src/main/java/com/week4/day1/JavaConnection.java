package com.week4.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("connect method");
		
	}

	public void disconnect() {
		System.out.println("disconnect method");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate method");
		
	}

	public static void main(String[] args)	{
		JavaConnection javaconnection = new JavaConnection();
		javaconnection.connect();
		javaconnection.disconnect();
		javaconnection.executeUpdate();
		javaconnection.executeQuery();
	}

}
