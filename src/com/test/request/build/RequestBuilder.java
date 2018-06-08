package com.test.request.build;

public class RequestBuilder {
	static String givenStr1 = "path search and param query=ipod and param format=json and param apikey= ";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String givenRqest = givenRequestBuilder(givenStr1);
		System.out.println(givenRqest);
	}

	private static String givenRequestBuilder(String queryString) throws Exception {
		StringBuilder buildQuery = new StringBuilder();
		String urlReqMakerStr = urlRequestMaker(queryString);
		// Break the query for all possible key worlds like URL,path, and, param
		// Build each possible key frame
		
		return buildQuery.append(urlReqMakerStr).toString();
	}

	private static String urlRequestMaker(String queryString) throws Exception {
		StringBuilder urlStr = new StringBuilder();
		int keyCounter = getCountOfKey(queryString , "path");
		if (keyCounter == Integer.valueOf(1)) {
			//TODO if exist then get path value from string
			getVaueOfItem("path");
			urlStr = urlStr.append(".").append("path").append("(").append("search").append(")").append(".");
		} else {
			throw new Exception("Only one URL key allowed into query string");
		}
		return urlStr.toString();
	}

	private static void getVaueOfItem(String string) {
		
	}

	private static int getCountOfKey(String queryString, String key) {
		int countofKey = 0;
		if (key != null && key != "") {
			countofKey = queryString.split(key).length;
		}
		return countofKey-1;
	}

}
