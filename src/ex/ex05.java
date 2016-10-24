package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
 */
//import java.util.Scanner;
import java.util.Random;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=10;
		int data[][]=new int[10][10];
		for(int i=1-1;i<=end-1;i++){
			for(int j=1-1;j<=end-1;j++){
				Random rdm=new Random();
				data[i][j]=rdm.nextInt(10);
			}
//			System.out.println();
		}
		for(int i=1-1;i<=end-1;i++){
			for(int j=1-1;j<=end-1;j++){
				
				System.out.print(data[j][i]);
			}
			System.out.println();
		}
	}

}
