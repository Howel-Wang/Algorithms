package Unit1;

import java.util.Scanner;

/*
	编写一个静态方法lg(),接受一个整型参数N，返回不大于log2N的最大整数。不要使用Math库。
*/

public class Practice1_14 {

	private static int lg(int N) {
		int count = 0;
		if(N>=2) {
				count++;
			while(N/2 >= 2) {
				N = N/2;
				count++;
			}
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
		System.out.println(lg(N)); 

	}

}