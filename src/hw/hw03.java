package hw;
/*
 * Topic: �]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000
 * Date: 2016/10/24
 * Author: 105021058 �����M
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum=0;
		int m=1;
		while(sum<=10000){
			sum=(int)Math.pow(n,m);
			if(sum<=10000){m+=1;};
		}
			System.out.println(m);
		
	}

}
