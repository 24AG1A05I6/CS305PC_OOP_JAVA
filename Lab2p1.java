import java.util.Scanner;
class Lab2p1{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.nextLine();
		String op=s.nextLine();
		switch(op){
			case"++":
					System.out.println("Post:"+(a++));
					System.out.println("Pre:"+(++a));
					break;
			case"--":
					System.out.println("Post:"+(a--));
					System.out.println("Pre:"+(--a));
					break;
			case"+":
					a=+a;
					System.out.println("Unary+:"+(a));
					break;
		        case"-":
					a=-a;
					System.out.println("Unary-:"+(-a));
					break;
			case"~":
					System.out.println(~a);
			default:
					System.out.println("you enter a wrong opeator");		
					
				
					
			}
			                }
	 }		
