
class Lab3p3{
	 
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		Lab3p3 l = new Lab3p3();
		l.display();
		l.display(10);
		l.display("String");
		l.display(10,"String");
		}
		public void show(){
			System.out.println("Method without params:");
			}
		public void show(int x){
			System.out.println("Method without params:"+x);
			}
		public void show(String s){
			System.out.println("Method without params:"+s);
			}
		public void show(int x,String s){
			System.out.println("Method without params:"+x+" "+s);
			}
			}
		
		
		
		
