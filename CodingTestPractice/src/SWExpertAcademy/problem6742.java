package SWExpertAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class problem6742 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int case_number = sc.nextInt();
		ArrayList<Test_case> test_case_arrayList = new ArrayList<Test_case>();

		for (int i = 0; i < case_number; i++) { // 케이스 갯수만큼 반복


			int n = sc.nextInt();
			double a = (double) sc.nextInt();
			double b = (double) sc.nextInt();

			Test_case test_case = new Test_case(n, a, b); // test_case 생성
			test_case_arrayList.add(test_case); // ArrayList에 추가

			// dot리스트 생성
			for (int j = 0; j < n; j++) { // 점 갯수만큼 반복


				int x = sc.nextInt();

				int y = sc.nextInt();
				test_case_arrayList.get(i).makeDot_list(x, y); // arrayList에 Dot들을 추가
			}

			test_case_arrayList.get(i).makeTri_list(); // Tri_arrayList에 삼각형들 추가



			test_case_arrayList.get(i).test();

		}



		for (int i = 0; i < test_case_arrayList.size(); i++) {

			System.out.println("#" + (i + 1) + " " + test_case_arrayList.get(i).result_sum);

		}

	}
}

class Test_case {

	int n;
	double a;
	double b;
	int result_sum = 0;
	ArrayList<Dot> dot_arrayList = new ArrayList<Dot>();
	ArrayList<Triangle> Tri_arrayList = new ArrayList<Triangle>();

	Test_case(int n, double a, double b) {
		this.n = n;
		this.a = a;
		this.b = b;

	}

	public ArrayList<Dot> makeDot_list(int x, int y) {

		dot_arrayList.add(new Dot(x, y));

		return dot_arrayList;

	}

	public void makeTri_list() {

		int tri_num = 0;

		for (int i = 0; i < dot_arrayList.size(); i++) {
			for (int j = i + 1; j < dot_arrayList.size(); j++) {
				for (int k = j + 1; k < dot_arrayList.size(); k++) {
				
					Dot d1 = dot_arrayList.get(i);
					Dot d2 = dot_arrayList.get(j);
					Dot d3 = dot_arrayList.get(k);


					ArrayList<Dot> Dots = new ArrayList<Dot>();
					Dots.add(d1);
					Dots.add(d2);
					Dots.add(d3);

					Tri_arrayList.add(new Triangle(Dots));
					tri_num++;
				}

			}

		}


	}

	public void test() {


		for (int i = 0; i < Tri_arrayList.size(); i++) {


			double area = Tri_arrayList.get(i).calculate_area();
			if (area >= a / 2 && area <= b / 2) {
				result_sum++;

			}

		}

	}

}

class Dot {

	int x; // x,y좌표
	int y;

	public Dot(int x, int y) {
		this.x = x;
		this.y = y;

	}

}

class Triangle {

	ArrayList<Dot> Dots = new ArrayList<Dot>();

	double area;

	public Triangle(ArrayList<Dot> Dots) { // 생성자

		this.Dots = Dots;

	}

	public double calculate_area() {

		int d1X = Dots.get(0).x - Dots.get(2).x;
		int d1Y = Dots.get(0).y - Dots.get(2).y;
		int d2X = Dots.get(1).x - Dots.get(2).x;
		int d2Y = Dots.get(1).y - Dots.get(2).y;

		double area = (double) Math.abs((d1X * d2Y - d2X * d1Y)) / 2;

		return area;

	}

}
