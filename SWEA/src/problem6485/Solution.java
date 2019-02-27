package problem6485;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		ArrayList<int[]> answer_list = new ArrayList<int[]>();

		for (int i = 0; i < T; i++) { // 테스트 케이스마다 반복

			int N = sc.nextInt(); // 버스의 갯수
			ArrayList<Bus> Bus_arr = new ArrayList<Bus>();

			for (int j = 0; j < N; j++) {

				Bus_arr.add(new Bus(sc.nextInt(), sc.nextInt()));

			}

			int[] BusStop = new int[5000]; // 정류장 5000개 생성 , 0 으로 초기화
			for (int j = 0; j < BusStop.length; j++) {
				BusStop[j] = 0;

			}

			for (int j = 0; j < Bus_arr.size(); j++) {

				for (int k = Bus_arr.get(j).Ai; k <= Bus_arr.get(j).Bi; k++) {

					BusStop[k]++;

				}

			}

			int P = sc.nextInt();
			int[] bus_count_list = new int[P];

			for (int j = 0; j < P; j++) {

				bus_count_list[j] = BusStop[sc.nextInt()];

			}

			answer_list.add(bus_count_list);

		}

		for (int i = 0; i < answer_list.size(); i++) {

			System.out.print("#" + (i + 1));
			for (int j = 0; j < answer_list.get(i).length; j++) {

				System.out.print(" " + answer_list.get(i)[j]);
			}

			System.out.println();
		}

	}

}

class Bus {

	int i;
	static int bus_number;
	int Ai;
	int Bi; // Ai번부터 Bi번 정류장 까지 다님

	public Bus(int Ai, int Bi) {

		this.Ai = Ai;
		this.Bi = Bi;
		this.i = ++bus_number;

	}

}
