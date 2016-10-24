package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int end=scn.nextInt();
		int sum=1;
		int start=1;
		while(start<=end)
		{
			sum=sum*start;
			start+=1;
		}
		System.out.println(sum);
		
	}

}
