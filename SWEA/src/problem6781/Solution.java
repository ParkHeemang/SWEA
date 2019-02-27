package problem6781;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String answer_list[] = new String[T];
		for (int i = 0; i < answer_list.length; i++) {
			answer_list[i] = "Continue";

		}

		for (int i = 0; i < answer_list.length; i++) { // 테스트 케이스마다 반복

			ArrayList<Card> Card_list = new ArrayList<Card>();
			boolean[] Card_remain = new boolean[9];

			sc.nextLine();
			String input_number = sc.nextLine();
			String input_color = sc.nextLine();

			for (int j = 0; j < 9; j++) {

				int number = Character.getNumericValue(input_number.charAt(j));
				char color = input_color.charAt(j);

				Card_list.add(new Card(number, color));
				Card_remain[j] = true;

			}

			ArrayList<Card> Card_list_copy = Card_list;

			for (int j = 0; j < Card_list_copy.size(); j++) {

				for (int j2 = 0; j2 < Card_list_copy.size(); j2++) {

					for (int j3 = 0; j3 < Card_list_copy.size(); j3++) {

						if (j != j2 && j2 != j3 && j != j3) { // 세장을 뽑는 모든 경우의 수에 대해서

							if (Card_list_copy.get(j).number == Card_list_copy.get(j2).number
									&& Card_list_copy.get(j2).number == Card_list_copy.get(j3).number) {

								Card_remain[j] = false;
								Card_remain[j2] = false;
								Card_remain[j3] = false;

								ArrayList<Card> Card_list_copy2 = new ArrayList<Card>();
								boolean Card_remain2[] = { true, true, true, true, true, true };

								for (int k = 0; k < Card_remain.length; k++) {

									if (Card_remain[k]) {

										Card_list_copy2.add(Card_list_copy.get(k));

									}

								}

								for (int k = 0; k < Card_list_copy2.size(); k++) {
									for (int k2 = 0; k2 < Card_list_copy2.size(); k2++) {
										for (int k3 = 0; k3 < Card_list_copy2.size(); k3++) {

											if (k != k2 && k2 != k3 && k != k3) {

												if (Card_list_copy2.get(k).color == Card_list_copy2.get(k2).color
														&& Card_list_copy2.get(k2).color == Card_list_copy2
																.get(k3).color) {

													Card_remain2[k] = false;
													Card_remain2[k2] = false;
													Card_remain2[k3] = false;

													for (int l = 0; l < Card_remain2.length; l++) {
														System.out.print(Card_remain2[l] + "/");

													}

													ArrayList<Card> Card_list_copy3 = new ArrayList<Card>();

													for (int z = 0; z < Card_remain2.length; z++) {

														if (Card_remain2[z]) {

															Card_list_copy3.add(Card_list_copy2.get(z));

														}

													}

//												System.out.println(Card_list_copy3.size());
//												for (int a = 0; a < Card_list_copy3.size(); a++) {
//													System.out.print(Card_list_copy3.get(a).number+"/");				
//												}

													int[] arr = new int[3];

													for (int l = 0; l < arr.length; l++) {

														arr[l] = Card_list_copy3.get(l).number;

													}

													Arrays.sort(arr);

													if ((arr[0] == arr[1] - 1) && (arr[0] == arr[2] - 2)) {

														answer_list[i] = "Win";
														break;

													}

												}

											}

										}

									}

								}

							}

						}

					}

				}

			}

		}

		for (int j = 0; j < answer_list.length; j++) {

			System.out.println("#" + (j + 1) + " " + answer_list[j]);

		}

	}

}

class Card {

	int number;
	char color;

	public Card(int number, char color) {

		this.number = number;
		this.color = color;
	}

}
