package com.practise.java.interview;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UrlHit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hit = { 35, 40, 35, 75, 40, 45, 65, 75 };
		String[] url = { "facebook@xyz.com", "gooogle@xyz.com", "yaaahoo@xyz.com", "minda@xyz.com", "whatsapp@xyz.com",
				"instagram@xyz.com", "gmail@xyz.com", "amazon@xyx.com" };
		int max = hit[0], index = 0;
		for (int i = 1; i < hit.length; i++) {
			if (max < hit[i]) {
				max = hit[i];
				index = i;
			}

		}
		for (int i = 0; i < hit.length; i++) {
			if (max == hit[i]) {
				System.out.println(url[i]);
			}

		}

	}
	
	


}
