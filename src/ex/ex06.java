package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=0;
		int end=5;
		int data[]={105021045,105021056,105021069,105021062,105021006};
		for(int i=0;i<end;i++){
			for(int j=i+1;j<=end-1;j++){
				if(data[i]<data[j]){
					v1=data[i];
					data[i]=data[j];
					data[j]=v1;
				}			
			}
		}
		for(int i=0;i<=end-1;i++){
			System.out.print(data[i]+"\t");		
		}
	}

}
