package problem2751;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		
		//전체를 각원소가 1개가 될때까지 쪼갠다		
		devideToTwo(array);
		
		

	}

	private static ArrayList<int[]> devideToTwo(int[] array) {		
		
		int size = array.length;
		
		int middle_idx = (size%2==0)? array.length/2: array.length/2 + 1 ;
		System.out.println(middle_idx);	
		
		
		
		return null;
				
		
	}

}
