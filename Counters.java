package com.dkh.statics4;
//static variables get memory allocate in class area
// only once when class is load.

/*public class Counters {

	int count=0;
	public Counters() {
   count++;
   System.out.println(count);
	}
public static void main(String[] args) {
	Counters c1=new Counters();//when c1 obj create and count instance
	//Variable c1 allocate memory into c1 for c2 again same and so on .
	//so when constructor call count value always intilized from starting zero.
	Counters c2=new Counters();
	Counters c3=new Counters();
	}
}*/

public class Counters {

	static int count=0;
	public Counters() {
    count++;
   System.out.println(count);
	}
public static void main(String[] args) {
	Counters c1=new Counters();
	//when we create  c1 obj 
	//Constructor will be called and the value of 
	//count becomes 1, when we create c2 obj again constructor
	//will be call and count value become 2 then 3 and so on whenever
	//we create new object
	//create and count instance
	Counters c2=new Counters();
	Counters c3=new Counters();
	Counters c4=new Counters();
	}
}
