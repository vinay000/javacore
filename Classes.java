

// 1. There should be only one public class in a java file

// 2. Access Specifier - private, protected, default, public

// 3. if not public, make it default
// 4. Main class should always be public

package javacore;

class Test{
	public void fun() {
		System.out.println("I am Test class called by object");
	}
}

public class Classes{
	public static void main(String args[]) {
		Test ob = new Test();
		ob.fun();
		
	}
}