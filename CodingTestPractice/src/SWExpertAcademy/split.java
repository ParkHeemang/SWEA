package SWExpertAcademy;

public class split {

	 public static void main(String[] args) {
			String target ="동해물과 백두산이 \n마르고 닳도록\n하나님이 보우하사 우리나라만세\n";
			String[] change_target = target.split("\\n");
				
			for(int i=0;i<change_target.length;i++) {
			    System.out.println(change_target[i]);
			}

			    /*결과값
			    동해물과 백두산이 
			    마르고 닳도록
			    하나님이 보우하사 우리나라만세*/
		    }

}
