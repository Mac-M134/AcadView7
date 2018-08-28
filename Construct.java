class Construct{
	public static void main(String args[]){
		Test t=new Test(1);
		t.display();
	}
}
class Test{
	Test(){
		System.out.print("I'm in Default Constructor");
	}
	Test(int i){
		this();
		System.out.print("\n I'm in parameterized constructor");
	}
	void display(){
		System.out.print("\nDefault OCnstructor call through parameterized Constructor");
	}
}

