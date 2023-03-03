import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		a=a.trim();
		String[] b=a.split(" ");
		if(b[0].isEmpty()) {
			System.out.println("0");
		}else if(b.length>0) {
			System.out.println(b.length);
		}
	}
}
