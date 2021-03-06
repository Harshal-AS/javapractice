package wrapperclass;

public class Boxingoperation {

	public static void main(String[] args) {

		double salary = 1234.34;// primative type
		System.out.println("salary: " + salary);// 1234.34
		Double obj = 4521.10;// implicit /auto boxing---> java compiler convert it into Double obj=new
								// Double(4521.10);
		System.out.println(" autoboxing: " + obj);// 4521.10
		double obj1 = new Double(salary);// explicit boxing 
		System.out.println(" explicit boxing: " + obj1);// 1234.34
		System.out.println(salary == obj1);// true

		Double obj2=new Double(50.10);
		System.out.println(" EXPLICIT BOXING: "+obj2);// 50.10  explicit boxing
		
		Double obj3=987.10;//  java comiler convert Double obj3=new Double (987);//  
		System.out.println(" implicit & autoboxing BOXING: "+obj3);//987.10
		//implicit & autoboxing BOXING automatically java compiler at compile time
		
		char a='A';// PRIMATIVE TYPE 
		System.out.println("a vriable primative type: "+a);//'A'
		Character a1='B';// IMPLICIT BOXING OPERATIOM
		System.out.println(" a1 implicit boxing or auto boxing : "+a1);//'B'
		Character a2=new Character('C');// EXPLICIT BOXING OPERATIOM
		System.out.println(" a2 explicit boxing : "+a2);//'C'
		
	}
}
/*1.Wrapper class = it is java provided the mechanism to convert primitive type into object 
 & object into primitive type which also known as boxing & un-boxing.
 2.All wrapper class belongs to " java.lang" packages .
 3.Boxing & un-boxing feature  convert primitive type into object & object into primitive type automatically
 4.Boxing & un-boxing operation can be perform implicit & explicit 
 Automatic conversion of primative into object is knowns as auto-boxing.
 4.
  
 *
 * */
 

