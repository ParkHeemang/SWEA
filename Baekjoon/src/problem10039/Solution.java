package problem10039;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score_list = new int[5];
		int sum = 0;
		
		for (int i = 0; i < score_list.length; i++) {
			
			
			int score = sc.nextInt();
			if (score<40) {
				score = 40;
			}
			
			score_list[i] = score;
			sum+=score;
		}
		
		
		System.out.println(sum/5);
		

	}

}
