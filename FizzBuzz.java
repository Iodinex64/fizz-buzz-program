public class FizzBuzzProgram {
    //Code by Sean Duggan, B.A. (Hons) Applied Computing, 15/05/2020
     public static void main(String [] args){
         
         //Ideally would want to use this in real world scenario
         //int val1 = Integer.parseInt(args[0]);
         //int val2 = Integer.parseInt(args[1]);
         //int start = Integer.parseInt(args[2]);
         //int limit = Integer.parseInt(args[3]);
         
         int val0 = 3;
         int val1 = 5;
         int start = 0;
         int limit = 100;
         
		for (int i = start; i <= limit; i++) {
			if (start < limit) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("Fizzbuzz");
				}
				else if(i % 3 == 0) {
					System.out.println("Fizz");
				}
				else if(i % 5 == 0) {
					 System.out.println("Buzz");
				}
				else {
					 System.out.println(i);
				}
			}
		 }
	}
}