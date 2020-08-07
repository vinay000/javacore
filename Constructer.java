/*constructer is a member function of java class
It  don't have any return type
its name is same as class
It is first function that executed in object life
It properly initialize the object varialble

*/
package javacore;
public class Constructer{
	int l, b , h;
	public Constructer() {
		l= 10; b = 20; h = 3;
	}
	public Constructer(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.h = h;
		System.out.println(l+" "+b+" "+h);
	}
	public static void main(String args[]) {
		Constructer ob = new Constructer();
		Constructer ob2 = new Constructer(3,4,5);
	}
	
}