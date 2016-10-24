package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int end=scn.nextInt();
		long sum=0;
		int start=1;
		while(start<=end)
		{
			sum=sum+(int)Math.pow(2,start);
			start+=1;
		}
		System.out.println(sum);
	}

}
