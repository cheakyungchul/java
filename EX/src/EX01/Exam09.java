package EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean r = true;
		int studentNumber = 0;
		int[] scores = null;
		
		while(r) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------------");
			System.out.println("����> ");
			
		  int selectNo = Integer.parseInt(sc.nextLine());
		  
		  switch(selectNo) {
		  	  case 1:
		  		  System.out.println("�л���>");
		  		  studentNumber = Integer.parseInt(sc.nextLine());
		  		  scores = new int[studentNumber]; // �л�����ŭ�� ���� �迭�� ����� ���´�. 
			  break;
		  	  case 2:
			
			    for(int i=0; i<scores.length; i++) {
			    	scores[i] = Integer.parseInt(sc.nextLine());
			    }
			   
			  break;
		  	  case 3:	    for(int i=0; i<scores.length; i++) {
		  		  System.out.println("scores[i]+");
		  	  }	    
		 		    
		     	 System.out.println("�Էµ� ���� :" + Arrays.toString(scores));
		  	  break;
		  	  case 4:
		  		  int max = 0;
		  		  int sum = 0;
		  		  double avg = 0.0;
		  		  
		  		  for(int i = 0 ; i<scores.length; i++) {
		  			  max = (max < scores[i]) ? scores[i] : max;
		  			  sum += scores[i];
		  		  }
		  		
				avg = (double) sum / studentNumber;
		  		  System.out.println("�ְ� ���� : " + max + "��");
		  		  System.out.println("��� ���� : " + avg + "��");
		  	  break;
		  	  case 5:
		  		  r = false;
		  	  break;
		  	  default :
		  		  r = false;
		  
		  }
			
		}
		
		
		System.out.println("*****************************");
		System.out.println("���α׷� ����Ǿ����ϴ�");
		System.out.println("*****************************");
	}

}