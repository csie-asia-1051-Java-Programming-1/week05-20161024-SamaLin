package hw;

import java.util.Scanner;

/*
 * Topic: ���ϥΪ̿�J�@�����n�A�p��1/(1*2)+
 * 1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
 * Date: 2016/10/24
 * Author: 105021058 �����M
 */
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float n=scn.nextInt();
		float sum=0;
		for(float i=2;i<=2*n;i+=2){
			sum=sum+1/((i-1)*i);
		}
		System.out.print(sum);
	}

}
