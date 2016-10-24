package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
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
