/* 
 "interface" keyword is used 
we specify method declaration in interface

By default every member in interface is public and abstract

and variable would be public static final by default
NO OTHER OPTIO OR POSSIBLITY

can not create object of interface
Interface don't have constructor. Because it have all variable static

Any class that implements interface should implement the methods in
interface

INTERFACE CAN HAVE MULTPLE INHERITENCE USING EXTEND KEYWORD
INTERFACE REFRENCE VARIABLE CAN BE CREATED
reference variable can only call method in parent class

*/
package javacore;
interface I1{
	int a = 2; //its public static final
	void fun();//fun def. public and abstract
	
}
interface I2 extends I1{
	
}
interface I3 extends I1,I2{
	
}
interface I4{}
interface I5{}

class Hen implements I3{
	// class should implement the method of all three interface 
	//because I3 inherited I1, I2 both
	public void fun() {
		System.out.println(a);
	}
}
class Den extends Hen implements I4,I5{
	
}




