import java.util.Scanner;
class Lab2p4{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("and gate"+(a&b));
		System.out.println("or gate"+(a|b));
		System.out.println("notgate"+(a^b));
		}
		}
