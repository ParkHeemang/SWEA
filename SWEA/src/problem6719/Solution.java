package problem6719;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double[] answer_list = new double[T];

		for (int i = 0; i < answer_list.length; i++) { // 테스트 케이스마다 반복

			double maxA = 0;
			int N = sc.nextInt(); // 강좌갯수
			int K = sc.nextInt(); // 몇개 들을건지

		
			int[] Mlist = new int[N]; // 점수리스트 만들기

			for (int j = 0; j < N; j++) { // 강좌갯수만큼 반복

				int M = sc.nextInt();
		
		

				Mlist[j] = M;

			}

//			System.out.println(class_arr.get(0).M);

			Permute permute = new Permute();
			ArrayList<int[]> permutationList = permute.getPermutation(Mlist, K); // 순열 뽑아내기 같은 수의 중복을 제외함
//			permute.print(permutationList);

			for (int j = 0; j < permutationList.size(); j++) { // 경우의 수들을 돌면서 ex) 5P2 {1,2}, {1,3}, {1,4}, ...

				double A = 0;

				for (int j2 = 0; j2 < permutationList.get(j).length; j2++) {

					A = (A + permutationList.get(j)[j2]) / 2;

				}

				if (A > maxA) {

					maxA = A;
				}

			}

			System.out.println("#" + (i + 1) + " " + maxA);

		}

	}

}



class Permute {

	public static ArrayList<int[]> getPermutation(int[] inputArray, int selectCount) {
		ArrayList<int[]> resultList = new ArrayList<int[]>();

		ArrayList<int[]> combinationList = getCombination(inputArray, selectCount);
		int count = combinationList.size();
		for (int i = 0; i < count; i++) {
			if (combinationList.get(i) == null) {
				continue;
			}

			int[] singleArray = combinationList.get(i);

			if (singleArray == null || singleArray.length == 0) {
				continue;
			}

			addSinglePermutation(resultList, singleArray, 0);
		}

		return resultList;
	}


	public static void addSinglePermutation(ArrayList<int[]> resultList, int[] inputArray, int position) {

		int count = inputArray.length;
		for (int i = position; i < count; i++) {
			int[] inputArray2 = cloneArray(inputArray);
			swapArray(inputArray2, position, i);
			resultList.add(inputArray);

			addSinglePermutation(resultList, inputArray2, position + 1);
		}
	}


	public static ArrayList<int[]> getCombination(int[] inputArray, int selectCount) {
	

		ArrayList<int[]> resultList = new ArrayList<int[]>();
		int[] hintArray = new int[inputArray.length];

		addSingleCombination(resultList, selectCount, inputArray, 0, hintArray, 0);
		return resultList;
	}


	public static void addSingleCombination(ArrayList<int[]> resultList, int selectCount, int[] inputArray,
			int position, int[] hintArray, int hintIndex) {

		if (hintIndex == selectCount) {
			int[] singleArray = resizeIntArray(hintArray, hintIndex);
			if (singleArray != null && singleArray.length > 0) {
				resultList.add(singleArray);
			}
			return;
		}

		int lastIndex = inputArray.length - 1;
		if (position > lastIndex) {
			return;
		}

		int[] hintArray2 = cloneArray(hintArray);
		hintArray[hintIndex] = 0;
		hintArray2[hintIndex] = inputArray[position];

		position++;

		addSingleCombination(resultList, selectCount, inputArray, position, hintArray, hintIndex);
		addSingleCombination(resultList, selectCount, inputArray, position, hintArray2, hintIndex + 1);
	}


	public static int[] cloneArray(int[] inputArray) {
		if (inputArray == null) {
			return null;
		}

		int count = inputArray.length;
		int[] resultArray = new int[count];

		for (int i = 0; i < count; i++) {
			resultArray[i] = inputArray[i];
		}

		return resultArray;
	}

	public static boolean swapArray(int[] array, int i, int k) {
		if (array == null) {
			return false;
		}

		int count = array.length;
		int lastIndex = count - 1;

		if (i < 0 || k < 0 || i > lastIndex || k > lastIndex) {
			return false;
		}

		int temp = array[i];
		array[i] = array[k];
		array[k] = temp;

		return true;
	}


	public static int[] resizeIntArray(int[] inputArray, int newSize) {
		int lastIndex = -1;
		if (inputArray != null) {
			lastIndex = inputArray.length - 1;
		}

		int[] newArray = new int[newSize];

		for (int i = 0; i < newSize; i++) {
			if (i > lastIndex) {
				newArray[i] = 0;
			} else {
				newArray[i] = inputArray[i];
			}
		}

		return newArray;
	}

}
