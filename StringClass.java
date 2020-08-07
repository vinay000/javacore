//It is in java.lang.String package
//String class is a final class so it can not be extended

//String a ="hello"
// a is  reference variable and hello is string object value 
package javacore;
public class StringClass{
	public static void main(String args[]) {
	String s1 = "java";
	String s2 = "java";
	String s5="Java";
	String s3 = "JOHN";
	String s4 = "computer";
	System.out.println(s1==s2); //comparing two ref. avr pointing same strin object
	System.out.println(s1.equals(s2)); // comparing string object
	
	//toUpperCase()
	System.out.println(s1.toUpperCase());
	
	//toLowerCase()
	System.out.println(s3.toLowerCase());
	
	//indexOf(char) ---1
	s3.indexOf('N');
	
	//indexOf(char, startindex)---2
	s3.indexOf('N', 2);
	 
	//indexOf(subStr)
	s4.indexOf("ute");
	
	s4.indexOf("ute",2);
	
	//lastIndexOf() //similar version as above are available for lastIndexOf() also
	s4.lastIndexOf('t'); 
	
	
	
//comparing strings
	
	s1.equals(s2);
	s1.equalsIgnoreCase(s5);
	s1.compareTo(s5);
	
//substring
	s5.substring(3); // puter
	
	
	
	
	
	
	
	
	
	
	}
}