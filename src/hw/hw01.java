package hw;
/*
 * Topic: ���ϥΪ̿�J�@����� n�A�H�r�� '*' ��X����� n ������� (�ЧQ�ΰj��A���n������ printf �覡������X)�C
 * Date: 2016/10/24
 * Author: 105021058 �����M
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int end=scn.nextInt();
		int start=1;
		for(int i=1;i<=end;i++){
			for(int j=1;j<=end;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}