package week6;

public class monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
       int student1,student2;
       student1=75;
       student2=3;
       
       if(student1 >= 90) {
    	   System.out.println("student got an A");
    	      
       }else if ( student1 >=80 && student1 <90) {
	System.out.println("student1 got an B");
		
	} else if ( student1 >=70 && student1 <90) { 
System.out.println("student got an C");

       }else if ( student1>=60 && student1<=69 ) {
	System.out.println("student get an D");
	
    }else if ( student1 >=0 && student1 <=59 ) {
    	System.out.println("student get an F");
    }
}
	}