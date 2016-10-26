package hw;
/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int now=1;
		int n =scn.nextInt();
		int date[][]=new int[n][n];
		
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=i;j++){
				date[i-j][j]=now;
				now++;
			}
		}
		
		for(int i=1;i<=n-1;i++){
			for(int j=0;j<=n-i-1;j++){
				date[n-1-j][i+j]=now;
				now++;
			}
		}
		
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=n-1;j++){
				System.out.print(date[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
