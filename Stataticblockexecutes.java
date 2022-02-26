package com.dkh.staticS.STATICBLOCK.S6;


/*//before 1.6 without main programrun
class AAA{
	static {
		System.out.println("hello before 1.6");
		System.exit(0);
	}
}
*/
/*
public class Stataticblockexecutes {
static {
	System.out.println("hello all");
	//System.exit(0); //if this we use then static block main method executes
}
public static void main(String[] args) {
System.out.println("i am main methods");}
}
*/

//multiple statics blocks

//THE FLOW IS STATIC MEMBER  IDENTIFY KAREGA
//LIKE STATIC VARIBLE MEMBER BLOCK METHODS SECOND TIME
//STATIC BLOCK AND MEMBER KO EXECUTE KAREGA AND LAST
//THEN STATIC MAIN METHOD  KO EXECUTE KAREGA 
public class Stataticblockexecutes {
static {
	System.out.println("first static block");
	//System.exit(0); //if this we use then static
	//block main method executes
}
public static void main(String[] args) {
System.out.println("i am main methods");
}
static {
	System.out.println("this is second static block");
}
}
