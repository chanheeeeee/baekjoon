import java.util.Scanner;

public class Main {

//	A가 B보다 큰 경우에는 '>'를 출력한다.
//	A가 B보다 작은 경우에는 '<'를 출력한다.
//	A와 B가 같은 경우에는 '=='를 출력한다.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c="";
		if(a>b) {
			c=">";
		}else if(a<b) {
			c="<";
		}else if(a==b) {
			c="==";
		}
		System.out.println(c);
	}
}
