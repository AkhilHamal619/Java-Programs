//Simple Interest

public class SimpleInterest {
	 public static void main(String[] args) {

	        if (args.length < 3) {
	            System.out.println("Please provide Principal, Rate and Time");
	            System.out.println("Example: java javaSimpleInterest.SimpleInterest 5000 5 2");
	            return;
	        }

	        double principal = Double.parseDouble(args[0]);
	        double rate = Double.parseDouble(args[1]);
	        double time = Double.parseDouble(args[2]);

	        double simpleInterest = (principal * rate * time) / 100;

	        System.out.println("Principal: " + principal);
	        System.out.println("Rate: " + rate);
	        System.out.println("Time: " + time);
	        System.out.println("Simple Interest: " + simpleInterest);
	    }
}