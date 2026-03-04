package javaVariable;

public class InstanceVariable {
	    static int x = 0;   // static variable
	    int y = 0;          // instance variable

	    void increment() {
	       
	       System.out.println("x = " + x +", y = " + y);
	       x++;
	        y++;
	    }

	    public static void main(String[] args) {
	    	InstanceVariable obj1 = new InstanceVariable();
	    	InstanceVariable obj2 = new InstanceVariable();

	        obj1.increment();
	        obj2.increment();
	    }
	}
