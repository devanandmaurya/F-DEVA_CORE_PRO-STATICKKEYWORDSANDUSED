package com.dkh.statics2;
class Testin {
	int h=87; //instance var ko access k liye obj bananaa padega
	static int j=432;
}
    public class demo2 {
	public static void main(String[] args) {
    System.out.println(Testin.j);	
    Testin testin=new Testin(); // for non static access create obj
    System.out.println(testin.h);//to access non static var
	}
}
