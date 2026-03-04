//javaOperators

public class LogicalOperators
{
	 public static void main(String[] args)
         {

	        int age = 22;
	        int marks = 75;
	        boolean hasID = true;

	        // Using AND (&&)
	        if(age >= 18 && hasID) {
	            System.out.println("Eligible to enter (AND used)");
	        }

	        // Using OR (||)
	        if(marks >= 80 || age < 25) {
	            System.out.println("Eligible for scholarship interview (OR used)");
	        }

	        // Using NOT (!)
	        if(!hasID) {
	            System.out.println("ID card is missing (NOT used)");
	        } else {
	            System.out.println("ID card verified");
	        }

	        // Using all together
	        if((age >= 18 && marks > 60) || !hasID) {
	            System.out.println("Final condition satisfied (Combined logic)");
	        }

	    }
}
