class Super{
	public static void main(String args[]){
		child c=new child();
		c.display();
	}
}
class Parent{
	void display(){
		System.out.print("Parent class method without object");
	}
}
class child extends Parent{
	void display(){
		super.display();
	}
}

