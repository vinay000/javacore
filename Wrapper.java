/*List of wrapper classes
int - Integer
char - Charter
Remaining all are same as name of class.
float - Float
double - Double
boolean - Boolean

3 functions that is present in each wrapper class
	1. valueOf()
				static member function
				returns object reference
	2.  Xxxparse()
				staic member fun
				return Xxx type value
				xxx is primitive data type
	3.Xxxvalue()
				return Xxx type value
				instance function

*/
package javacore;
public class Wrapper{
	public static void main(String args[]) {
		Integer a = Integer.valueOf("123");
		Integer b = Integer.valueOf("0110",2);//binary, base return obj of decimal
		Float f = Float.valueOf("1.37"); //return object float 1.37
		
		a.intValue();
		f.floatValue();
		
		int j  = Integer.parseInt("444");
	}
}
