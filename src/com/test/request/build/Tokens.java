package com.test.request.build;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tokens {
	public static void main(String[] args) {
		String givenStr1 = "path search and param query=ipod and param format=json and param apikey";
		String andRemovedQuery = givenStr1.replaceAll("and", "");
		System.out.println("andRemovedQuery " + andRemovedQuery);
		String spaceRemoved = andRemovedQuery.replaceAll("  "," ");
		System.out.println("spaceRemoved " + spaceRemoved);
		String[] tokensArrays = spaceRemoved.split(" ");
		Map<String, String> tokenMapping = new LinkedHashMap<>();
		for (int i=0 ; i<= tokensArrays.length-1 ; i++) {
			tokenMapping.put(tokensArrays[i], tokensArrays[i+1]);
			i++;
		}
		System.out.println(tokenMapping.toString());
	}

}
