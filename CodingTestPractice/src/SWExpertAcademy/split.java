package SWExpertAcademy;

public class split {

	 public static void main(String[] args) {
			String target ="���ع��� ��λ��� \n������ �⵵��\n�ϳ����� �����ϻ� �츮���󸸼�\n";
			String[] change_target = target.split("\\n");
				
			for(int i=0;i<change_target.length;i++) {
			    System.out.println(change_target[i]);
			}

			    /*�����
			    ���ع��� ��λ��� 
			    ������ �⵵��
			    �ϳ����� �����ϻ� �츮���󸸼�*/
		    }

}
