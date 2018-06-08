package com.test.request.build;

public class RequestBuilder {
	String givenStr1 = "path search and param query=ipod and param format=json and param apikey= ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenRqest = givenRequestBuilder("givenStr1");
		System.out.println(givenRqest);
	}

	private static String givenRequestBuilder(String queryString) {
		StringBuilder buildQuery = new StringBuilder();
		// Break the query for all possible key worlds like URL,path, and, param
		// Build each possible key frame
		
		return buildQuery.toString();
	}

}
