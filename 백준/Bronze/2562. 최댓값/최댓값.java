import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[9];
		int max=0, su=0;
		for(int i=0;i<9;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<9;i++) {
			for(int j=i;j<9;j++) {
				if(su<a[j]) {
					max=j;
					su=a[j];
				}
			}
		}
		System.out.println(su);
		System.out.println(max+1);
	}
}
