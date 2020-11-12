public class Overload{
	void myOverLoad(A a){
		System.out.println("Overload.myOverLoad(A a)");
	}
	
	void myOverLoad(B b){
		System.out.println("Overload.myOverLoad(B b)");
	}
		
	public static void main(String[]args){
		Overload o =  new Overload();
		C1 c = new C1();
	}
}