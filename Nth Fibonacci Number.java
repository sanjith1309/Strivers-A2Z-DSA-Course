import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a==1 || a==2){
			System.out.println("1");
		}
		else{
		int pre=1;
		int pre1=1;
		for(int i=2;i<a;i++){
			int sum = pre + pre1;
			pre = pre1;
			pre1 = sum;
		}
		System.out.print(pre1);
		}

		
	}

}
