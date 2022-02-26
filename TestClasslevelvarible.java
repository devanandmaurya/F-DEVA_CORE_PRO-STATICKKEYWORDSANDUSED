package com.dkh.statics1;

public class TestClasslevelvarible {
	static int i = 90;
int pq=987;//esko acess ke liye object banana padega
	void show() {
		// static int j=89; //Illegal modifier for parameter j;
		// only final is permitted static nhi laga sakte local method var k liye
		final int p = 40;
		System.out.println(p);
	}

	public static void main(String[] args) {
		System.out.println(i);//static variable direct access
		TestClasslevelvarible t = new TestClasslevelvarible();
		t.show();
		System.out.println(t.pq);//with obj se instance varible access kiya
	}
}
