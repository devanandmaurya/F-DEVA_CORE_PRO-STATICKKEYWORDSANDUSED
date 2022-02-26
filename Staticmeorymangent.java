package com.dkh.statics3;
//STATIC KEYWORD FOR MOMORY MANAGEMENT
/*
public class Staticmeorymangent {
int id;
String name;
String company;
public Staticmeorymangent(int id, String name, String company) {
	this.id=id;
	this.name=name;
	this.company=company;
	}
public void display() {
	System.out.println("The id :"+ id + " name: "+name + " comp: "+company);
}
public static void main(String[] args) {
Staticmeorymangent s1=new 
Staticmeorymangent(12, "Devanand","Clover infotech");
s1.display();
Staticmeorymangent s2=new 
Staticmeorymangent(13, "Nagendra","Clover infotech");
s2.display();
}
}
*/
//

//To use of static varible we do not need to write company name using static
//becuese it share memory from statck area.




public class Staticmeorymangent {
int id;
String name;
static String company="Clover infotech";
public Staticmeorymangent(int id, String name) {
	this.id=id;
	this.name=name;
	
	}
public void display() {
	System.out.println("The id :"+ id + " name: "+name + " comp: "+company);
}
public static void main(String[] args) {
Staticmeorymangent s1=new 
Staticmeorymangent(12, "Devanand");
s1.display();
Staticmeorymangent s2=new 
Staticmeorymangent(13, "Nagendra");
s2.display();
}
}
