package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 105021058 �����M
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum=0;
		int m=1;
		while(sum<=n){
			sum=sum+m;
			if(sum<=n){m+=1;};
		}
			System.out.println(m-1);
		
	}

}
