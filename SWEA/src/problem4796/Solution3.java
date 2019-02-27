package problem4796;

public class Solution3 {

	public static void main(String[] args) {
//		for (int i = 0; i < mountains.length - 2; i++) { // 시작점 i
//
//			for (int j = i + 2; j < mountains.length; j++) { // 끝점 j
//
//				int up_down_state = 0; // 올라가고 있으면 1 내려가고있으면 -1
//				int current_i = i;
//				int highest = 0; // 가장 높은산
//
//				if (mountains[current_i] < mountains[current_i + 1]) { // 첫번째만
//
//					up_down_state = 1; // i를 기준으로
//
//					while (true) { // 하강상태로 바뀌어야 빠져나옴
//
//						if (mountains[current_i] > mountains[current_i + 1]) {
//
//							current_i++;
//							up_down_state = -1;
//							break;
//						} else {
//
//							current_i++;
//							highest = mountains[current_i + 1];
//						}
//
//					}
//
//					if (current_i > j) { // 하강 상태인데 이미 끝점 지나갔으면
//						sys
//						break;
//						
//					}
//
//					System.out.println("여기왔니");
//					
//					while (true) { // 하강상태로 바뀜(최소 숫자 만족)
//
//						if(current_i==mountains.length-1) {
//							
//							break;
//						}
//						
//						if (mountains[current_i] < mountains[current_i + 1]) {
//
//							if (current_i + 1 <= j) { // 나가리됨
//
//								up_down_state = 1;
//								break;
//							}
//						} else { // 또 내려감
//
//							current_i++;
//							if (current_i > j) {
//
//								break;
//							}
//
//						}
//
//					}
//
//					if ((up_down_state == -1)) {
//
//						count++;
//					}
//
//				} else {
//
//					continue;
//				}
//
//			}
//
//		}
//		
//		System.out.println("#"+(k+1)+" "+count);

	}

}
