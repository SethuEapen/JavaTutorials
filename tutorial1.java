
public class tutorial1 {

	public static void main(String[] args) { // this is the main function. This is where the code starts running 
	//comments
		//these are comments denoted by two slashes. Anything after "//" does not affect the running of code
		
		/* 
		 * These are multi-line comments
		 */
		
	//variables
		int number = 1; //can be any whole number from -2147483647 to 2147483647 - 32 bit
		long bigNumber = 20; //can be any value -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 - 64 bit
		float largeDecimal = 103.1f; //6-7 Decimal places
		double decimal = 153.2; //15-16 Decimal places
		boolean decition = true; //true or false
		String words = "Hello world";
		char letter = 'g';
		
		//when declaring a variable you need to identify its type as above
		//template: [data type] [name] (optional) = [value];
		//if you do not set a value when you initialize a value such as:
		int uninitialized;
		//the variable is placeholder and will be equal to the value null (as shown below)
		//this is a somewhat risky process because certain manipulations of the variable can break your code
		//making sure that a value is initialized is necessary even if not in the declaration
		
	//setting variables
		uninitialized = 2; //sets to a value
		
		// left side is the thing being set and the right is the value it is being set to
		
		uninitialized++; //increments it one
		uninitialized--; //decrements it by one
		uninitialized += 10; //adds 10 to number - same as uninitialized = uninitialized + 10
		uninitialized -= 10; //subtracts 10 from the number - same as uninitialized = uninitialized - 10
		
	//print statements
		System.out.println(words);
		System.out.println(decimal);
		System.out.println("Hello World Again!");
		System.out.println("uninitialized is equal to: " + uninitialized);
	
	//if statements
		//inequalities
		//The self explanatory ones: <=, >=, <, >
		// == checks if two values are equal to each other. We use 2 equal signs because = is used for assignment
		// != means not equal to
		// % is remainder
		
		
		if (number == 0) { // use double equal to check equality
			System.out.println("number is equal to 0");
		} else if (decition) {
			// will run if true, in the end if statements just need a boolean value which can be derived from an equality, inequality, or other boolean variable
			System.out.println("number is not equal to 0 but decition is true");
		} else { //defaults to this if none of the other if statements in the block run
			System.out.println("number is not equal to 0 and decition is false");
		}
		//the else if and else are optional if you do not need them
		
	//loops
		//for loop - used to run something n amount of times
		int reps = 5;
		for (int i = 0; i < reps; i++) {
			//this is saying that in this loop we will initialize an integer i at 0
			//each time we run the loop the value of i will be incremented one (i++) and the loop will stop once i == reps
			System.out.println(i);
		}
		//we can change how much the value is incremented by and starts at by modifying those parameters:
		for (double j = 1.0; j < reps; j += 0.5) {
			//as you can see we can also change the data type of the variable to match your needs
			System.out.println(j);
		}
		
		//while loops - run until a condition is false
		int counter = 0;
		while (counter < 5) {
			System.out.println(counter);
			counter++;
		}
		//this is basically a glorified for loop though.
		//where while loops really shine is when we are doing more complex operations to determine whether we should stop or not
		
		
		/* situation: 
		 * 		we have a half full pool and need 100 more gallons of water to fully fill it up
		 * 		each day we can only add a gallon of water to the pool
		 * 		it will rain for the next 20 days each day adding 10 gallons of water
		 * 		the pool has leaks that will take 10 days to patch. each day the pool loses 15 gallons of water
		*/
		int progress = 0;
		int rain = 20;
		int leaks = 10;
		int daysUntilFull = 0;
		while (progress < 100) { //how many days before is full
			if (rain != 0) {//if it is still raining
				progress += 10; //the pool will fill 10 gallons that day
				rain--; //a rainy day has passed
			}
			if (leaks != 0) { //if there are still leaks
				progress -= 15; //15 gallons leaked
				leaks--; //one less day until they are patched
			}
			progress++; //you can add one more gallon yourself
			daysUntilFull++;//one day passes each loop
		}
		System.out.println("It took " + daysUntilFull + " days to fill the pool");

		
		//your task: Using your knowledge, I want you to make a program that with an int n does the following
		/*
		 * while n is greater than 1, 
		 * 		print values 0 - n skipping by 5s
		 * 		divide n by 2
		 * 
		 * Example:
		 * 		Input: n = 20
		 * 		Output:
		 * 			0
		 * 			5
		 * 			10
		 * 			15
		 * 			20
		 *   		0
		 *    		5
		 *     		10
		 *      	0
		 * 			5
		 * 			0
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		int n = 20;
		while (n > 1) {
			for (int i = 0; i <= n; i += 5) {
				System.out.println(i);
			}
			n /= 2;
			
		}
		
		
		//      || - or      && - and       ! - not
		
		
		//priority
		// ! - first
		// && - next
		// || - last
				
		
		int j = 2;
		int i = 4;
		
		while (!(i < 0) && j > 0) {
			i--;
			j--;
			System.out.println("i: " + i + "    j: " + j);
		}
		
		
	}
}



