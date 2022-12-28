
public class tutorial2 {

	public static void main(String[] args) {
		/* Lesson plan
		 * 		Arrays
		 * 		Functions
		 * 		Classes
		 */
		
		//***** Arrays *****
		
		int[] numArray = {1,2,3,4,5}; //in line decoration
		//or 
		int[] diffNumArray = new int[] {1,3,24,5,2};
		//we index arrays starting at 0 using [i] to return values at the ith index
		System.out.println("First element: " + numArray[0]);
		//out can set values in the same way
		numArray[0] = 100;
		System.out.println("Updated first element: " + numArray[0]);
		
		//to find the length of an array we can use .length 
		System.out.println("numList's length: " + numArray.length);
		
		
		//Indexing also starts at 0 with strings but uses different functions
		String testString = "Hello World";
		System.out.println(testString.length()); //for strings length is a function (sorry its a bit confusing)
		System.out.println(testString.charAt(3));
		
		
		String[] stringArray = {"Hi", "Santhosh"};
		//Exercise 1: Print the second element on the next line
		
		boolean[] boolArray = new boolean[5]; // defines an empty array with 5 elements
		
		for (int i = 0; i < boolArray.length; i++) {
			System.out.println(boolArray[i]); // as you can see the default value is false. We can change that in the loop if we want
			//Exercise 2: Update all values to true and print them out
		}
		
		//System.out.println(boolArray[5]); // this will throw an error because it is out of bounds 
		//remember it starts at 0 so only indices 0-4 are valid cause list is 5 long
		
		
		//***** Functions *****
		
		String input = "I can run functions";
		
		firstFunction(input); //we run class functions (functions in the same class) using the name followed by the parameters in parentheses
		
		int[] arrInput = {3,5,1,5,6,2};
		System.out.println("input length: " + getLength(input));
		System.out.println("Arr length: " + getLength(arrInput));
		
		System.out.println("The remainder of 10 / 3 is: " + remainder(10, 3));
		
		
		
		//Exercise 3: write a function that takes in a int array arr and an int num and returns the # of times that nun occurs in arr
		//Exercise 4: write a function that takes in a string s and a char c and returns the # of times c occurs in s.
		
	}
	
	private static void firstFunction(String text) {
		/*this function declaration has 5 parts
		 * public vs. private:
		 * 		public - can be accessed from other classes - interfacing functions
		 * 		private - can only be accessed within its own class - helper functions
		 * 		why?: makes code cleaner because it makes the above distinction
		 * 
		 * static:
		 * 		this will make more sense when we get to classes but it is when the function is not associated with an object
		 * 		
		 * 		What are objects?:	just like integers, strings, arrays are their own object we can create our own data types called objects
		 * 							in Java. For example, if we create a dog object, we will be able to create an name new dogs just like we 
		 * 							create and name strings: Dog max = new Dog(); Dog bella = new Dog();
		 * 		
		 * 		If I want to run the function feedDog on max without also feeding bella, I can't make the function static
		 * 				
		 * 		On the other hand this function is static because we are not creating multiple main class objects 
		 * 
		 * 		TLDR: 	If we call the function on an object that we created, its not static. 
		 * 				If we call it without referencing an object then the object must be static. 
		 * 
		 * void:
		 * 		void means that we do not return any value
		 * 		if we want to return a value than we can replace void with the variable type that we will return (see below)
		 * 
		 * name:
		 * 		in this function we used "firstFunction" as the name
		 * 
		 * parameters:
		 * 		you can have as many parameters as you want separated by commas, 
		 * 		these parameters must have a data type and a name that we can use within the function
		 * 
		 * {}: function code goes inside here
		 */
		System.out.println(text);
	}
	
	private static int remainder(int a, int b) {
		//a and b are the parameters and we return c which is an int
		int c = a % b;
		return c; // can do in one line by just: return a % b but this shows better
	}
	
	public static int getLength(String s) {
		return s.length();
	}
	public static int getLength(int[] arr) {
		return arr.length;
	}

}
