package problem5549;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] answer_list = new String[T];
		
		
		sc.nextLine();
		
		for (int i = 0; i < T; i++) {
			
			String string = sc.nextLine();
			
			int N = Integer.parseInt(""+string.charAt(string.length()-1));
			
			
			
			if(N%2==0) {
				
				answer_list[i] = "Even";
			}else {
				answer_list[i] = "Odd";
			}
			
			
		}
		
		for (int i = 0; i < answer_list.length; i++) {
			
			System.out.println("#"+(i+1)+" "+answer_list[i]);
		}
		

	}

}
