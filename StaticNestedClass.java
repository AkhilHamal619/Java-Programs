//javaNestedClass

public class StaticNestedClass {
	    // Instance variable
	    int a = 10;
	    
	    // Static variable
	    static int b = 20;
	    
	    // Static nested class
	    static class StaticNestedDemo {
	        void show() {
	            // Cannot access non-static member 'a' from static nested class
	            // System.out.println("Value of A: " + a); // ERROR!
	            
	            // Can access static members
	            System.out.println("Value of B: " + b);
	        }
	    }
	    
	    // Main method to test
	    public static void main(String[] args) {
	        // Creating instance of static nested class
	        // No need for outer class instance
	        StaticNestedClass.StaticNestedDemo obj = 
	            new StaticNestedClass.StaticNestedDemo();
	        
	        obj.show(); // Output: Value of B: 20
	    }
	}
