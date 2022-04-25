class A
{
	 public void show()
	 {
		 System.out.println("\nClass A: Parent Class\n");
	 }
}

class B extends A 	//Single inheritance implemented
{
	 public void show1()
	 {
		 System.out.println("Class B: Inherits Class A");
	 }
}

class C extends B 	//Multilevel inheritance implemented
{
	 public void show2()
	 {
		 System.out.println("Class C: Inherits Class B");
	 }
}

class D extends A 	//Hierarchical inheritance implemented
{
	 public void show3()
	 {
		 System.out.println("Class D: Inherits class A");
	 }
}


class p021_049
{
	 public static void main(String args[])
	 {
		B b1=new B();
		C c1=new C();
		D d1=new D();
		b1.show();
		b1.show1();
System.out.println("Single inheritance implemented"+"\n");
		 c1.show2();
System.out.println("Multilevel inheritance implemented"+"\n");
		d1.show3();
System.out.println("Hierarchical inheritance implemented"+"\n");
	 }
}
