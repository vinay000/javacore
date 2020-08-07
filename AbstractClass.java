/* 
 ABSTRACT CLASS:
+ class made with "Abstract" keyword
+ Can not create object
+ It have constructor since it have instance VAR. 

+ main use is to inherit these classes in to subclasses
that need similar property and behavior(generalization)

+ But we can create reference variable of any abstract class
 
ABSTRACT METHOD:
+ A abstract method should always be in a abstract class ony
But not vice-versa
+ abstract method don't have definition in abstract class
+ when an abstract class have abstract method, and a subclass inherits 
that abstract class, then it should give definition of that 
abstract method. Other wise abstract class will not get inherit

*/
package javacore;
abstract class A{
	//it can have or not have abstract method
}

class B extends A{
	// definition of abstract method is compulsory if it is in parent abstract class
}

public class AbstractClass{
	public static void main(String args[]) {
		A ref = new B();
	}
}
