
public class main {

	public static void main(String[] args) { // this is the main function. This is where the code starts running 
	//comments
		//these are comments denoted by two slashes. Anything after "//" does not affect the running of code
		
	//variables
		int number = 0; //can be any whole number
		double decimal = 153.2; //for decimal values
		boolean decition = false; //true or false
		String words = "Hello world";
		char letter = 'c';
		
		//when declaring a variable you need to identify its type as above
		//template: [data type] [name] (optional) = [value];
		//if you do not set a value when you initialize a value such as:
		int uninitialized;
		//the variable is placeholder and will be equal to the value null (as shown below)
		//this is a somewhat risky process because certain manipulations of the variable can break your code
		//making sure that a value is initialized is necessary even if not in the declaration
		
	//setting variables
		uninitialized = 2; //sets to a value
		uninitialized++; //increments it one
		uninitialized--; //decrements it by one
		uninitialized += 10; //adds 10 to number
		uninitialized -= 10; //subtracts 10 from the number
		
	//print statements
		System.out.println(words);
		System.out.println(decimal);
		System.out.println("Hello World Again!");

	
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
		for (double j = 1.0; j < reps; j = j + 0.5) {
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
		int degeneracy = 0;
		int animeWatchlist = 20;
		int goingOutside = 10;
		int daysUntilFailure = 0;
		while (degeneracy < 100) { //how many days before you become a degenerate
			if (animeWatchlist != 0) {//if there are still anime on your watchlist you will watch
				degeneracy += 10; //makes you become more of a degenerate
				animeWatchlist--; //you have one less in your watch list
			}
			if (goingOutside != 0) { //if there are still days to go outside
				degeneracy -= 15; //subtract from your degeneracy score
				goingOutside--;
			}
			degeneracy++; //add one degeneracy point each day;
			daysUntilFailure++;
		}
		System.out.println("You made it " + daysUntilFailure + " days before you became a degenerate");
		
	}
}


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
 * 
 * Hint: dont worry about remainder or anythin just code it as if the input is clean like 20.
 */
