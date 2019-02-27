package problem1152;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String input_string = sc.nextLine();
		
		String[] array = input_string.split(" ");
		
		
		for (int i = 0; i < array.length; i++) {
			
			
			System.out.println(array[i]);
		}
		
		
		
		HashSet<String> hs = new HashSet<String>(Arrays.asList(array));		
		
		
		System.out.println(hs.size());		
		
		
		
	
	}
	
	

}
