package hw;
/*
 * Topic: ���@ n x n���x�}(1��n��21)�A��J n ��A�եH�{��ø�X���@��}�A��}���c�p�U�A�Ҧp n=5 �ɡG
 * Date: 2016/10/24
 * Author: 105021058 �����M
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
