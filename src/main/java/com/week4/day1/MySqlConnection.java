package com.week4.day1;

public abstract class MySqlConnection implements DatabaseConnection{

	@Override
	public void connect() {
	//	System.out.println("Connect method");
		
	}

	@Override
	public void disconnect() {
	//	System.out.println("Disconnect method");
		
	}

	@Override
	public void executeUpdate() {
	//	System.out.println("Executeupdate method");
		
	}
	public void executeQuery() {
		System.out.println("Execute Query");
	}

}
