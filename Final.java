class Final{
	public static void main(String args[]){
	//Child c=new Child();
	//c.display();
	Parent p=new Parent();
	p.display();


	}
}
final class Parent{
	void display(){
		System.out.print("Class That cannot be extended further");
	}

}
/*
class Child extends Parent{
	void display1(){
		super.display();
	}
}
*/




