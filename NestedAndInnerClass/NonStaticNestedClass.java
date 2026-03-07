package NestedAndInnerClass;
// Outer class
class University 
{
	private String uniName = "Tech University";
	    
    // Non-static nested class (Inner class)
	class Department
	{
	    private String deptName;
	        
	    // Constructor
        Department(String name) 
		{
	        this.deptName = name;
	    }
	        
	    // Method to display
	    void display() 
		{
        // Can access outer class private member
	    System.out.println("University: " + uniName);
	    System.out.println("Department: " + deptName);
	    }

	}
}

public class NonStaticNestedClass
{
	public static void main(String[] args) 
	{
		// Step 1: Create outer class object
		University uni = new University();
	        
		// Step 2: Create inner class object USING outer object
	    University.Department csDept = uni.new Department("Computer Science");
        University.Department mechDept = uni.new Department("Mechanical");
	        
	    // Call methods
	    csDept.display();
	    System.out.println("---");
	    mechDept.display();
	    
	}

}
