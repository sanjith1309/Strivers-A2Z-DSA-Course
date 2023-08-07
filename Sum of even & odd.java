import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		ArrayList<Integer> arr = new ArrayList<>();
		while(a>0){
			b=a%10;
			arr.add(b);
			a=a/10;
		}
		int ev=0;
		int od=0;
		for(int i=0;i<arr.size();i++){
			if (arr.get(i)%2==0){
				ev+=arr.get(i);
			}
			else{
				od+=arr.get(i);
			}

		}
		System.out.print(ev+" "+od);

	}
}
