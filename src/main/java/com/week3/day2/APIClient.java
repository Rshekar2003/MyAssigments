package com.week3.day2;

public class APIClient {

	public static void main(String[] args) {
	
		APIClient apiclient = new APIClient();
		apiclient.sendRequest("endpoint");
		apiclient.sendRequest("endpointoverload", "requestbodyoverload", "requeststatusoverload");

	}
	
	public void sendRequest(String endPoint) {
		System.out.println(endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, String requestStatus) {
		
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}

}
