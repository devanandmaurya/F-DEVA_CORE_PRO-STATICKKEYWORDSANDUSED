package com.dkh.static5;


/*public class TestM {
	void show() {
		System.out.println("show here method ");
	}
public static void main(String[] args) {
	TestM testM=new TestM();
	testM.show();	
}
}
*/

public class TestM {
static	void show() {
		System.out.println("show here method ");
	}
public static void main(String[] args) {
	//TestM testM=new TestM(); //no need to class
	//TestM.show();	//via class name call
show(); //static method direct call within class
Tt1.sets();//from out side class ke static method ko direct 
//nhi call kar sakte but class k name se car sakte hai call
}
}
class Tt1{
	static void sets() {
		System.out.println("t1 class mthod static");
	}
	}