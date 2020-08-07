/*Dealing with exceptional situations in a program is called Exception handling
java have also its own "Default catch mechanism" but its not robust
..program gets terminated after exception.
2 ends : 
	where exception is occurring
	Handling that exception
	
4.ways to handle exception
	a.Default Throw, Default catch
	b.Default Throw, Our Catch
	c.Our Throw, Default Catch
	d.Our Throw, Our Catch
	
2 very import key words:
	throw : when we want to throw exception
	catch : when we want to throw exception
	
NullPointerException: when reference variable is pointing to a NULL.
and trying to access apply object function, it occurs.

getMessage() is a function of throwable super class of all exception classes.
It allows us to see the error message.

2 Categories of Exception:

	a. Unchecked Exception:
			eg. ArrayOutOfBounds Exception,
				NullPointerException,
				ArithmaticException,
				RunTimeException etc.
				
		Default Throw and Our Catch:
		 try{	
		 		<our code where exception can occur> 
		 	 }
		 catch(exception-type, parameter)
		 	{
		 		<code execute when exception occur>
		 		}
		 finally{}
		 
		 Note: There should be One catch or more after one try block.
		 		And not more then one finally block should be there.
		 		Finally block(optional).
		 		But it guarantees to execute after exception also, no matter what.
		 		
		Our throw, Default Catch:
		 We use "throw" keyword and create an object of desired exception class using new keyword
		 
		 

*/

package javacore;
public class ExceptionHandle{
	
	public static void main(String args[]){
		
		//Default Throw, Our catch
		try {
			//code that could cause exception
			System.out.println(3/0);
		}
		catch(NullPointerException e) {
			//code that run on exception
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			//code that run on exception
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I will run, no matter exception");
		}
//**********
		
		
		//Our throw,  Default Catch
		int totalBalance = 400;
		int withdrawBalance = 600;
		if(withdrawBalance>totalBalance)
			throw new ArithmeticException("Insufficient balance");
//	**************	
		
		//our throw , our catch
		
		try {
			if(withdrawBalance>totalBalance)
				throw new ArithmeticException("Insufficient balance");
			totalBalance = totalBalance - withdrawBalance;
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());

		}
		
		System.out.println("program running..");

//*******************		
		
	}
}

