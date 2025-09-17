import java.util.Scanner;
class Lab3p4{
	 
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		Lab3p4 l = new Lab3p4();
		Lab3p4 l1 = new Lab3p4();
		Lab3p4 l2 = new Lab3p4();
		Lab3p4 l3= new Lab3p4();
		
		l.show();
		l.show(10);
		l.show("String");
		l.show(10,"String");
		}
		public void show(){
			System.out.println("Constructor without params:");
			}
		public void show(int x){
			System.out.println("Constructor without params:"+x);
			}
		public void show(String s){
			System.out.println("Constructor without params:"+s);
			}
		public void show(int x,String s){
			System.out.println("Constructor with two  params int and String:"+x+" "+s);
			}
			}
		
		
