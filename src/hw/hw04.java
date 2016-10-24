package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+
 * 1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
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
