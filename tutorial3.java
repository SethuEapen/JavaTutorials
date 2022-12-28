
class Dog {
	//this is the dog class and it has three values color, owner, and weight
	//they are all null by default (as shown below)
	String color;
	String owner;
	int weight;
}

class Cat {
	private String color;
	private String owner;
	private int weight;
	
	private int hunger = 100;
	
	public Cat(String color, String owner, int weight) { // constructor
		//needs to be public and named the same thing as the class. Params will be filled in when we initialize the object (see below)
		this.color = color; //"this" not needed if parameter names are not the same 
		this.owner = owner;
		this.weight = weight;
	}
	
	public void feed() {
		hunger = 0;
	}
	
	public int getHunger() {//getter
		return hunger;
	}
	
	public void setHunger(int hunger) {//setter
		this.hunger = hunger;
	}
	
	//Exercise 1: generate getters and setters for color, owner, weight
	//Exercise 2: generate a exercise function that increments hunger by weight
	
}

public class tutorial3 {

	public static void main(String[] args) {
		//creating an object without a constructor
		Dog max = new Dog(); //this is how we create a new object
		max.color = "brown"; //set the public member variables by using dot operator just like using .length
		max.owner = "Alex";
		max.weight = 65;
		
		//print out the details of max
		System.out.println("Max is a " + max.color + " dog owned by " + max.owner + " and is " + max.weight + " pounds");
		
		//setting the variables like this is risky and clunky
		//instead lets use a constructor
		Cat whiskers = new Cat("grey", "Sarah", 12);
		
		//Exercise 1 cont.: now lets print out the details
		//System.out.println("Whiskers is a " + whiskers.getColor() + " cat owned by " + whiskers.getOwner() + " and is " + whiskers.getWeight() + " pounds");
		
		System.out.println("Hunger: " + whiskers.getHunger());
		whiskers.feed();
		System.out.println("Hunger: " + whiskers.getHunger());
		
		
		//Exercise 3:
		//	create a simulation over 100 days where whiskers exercises 100 days 
		//	each day print out their hunger
		//	if hunger exceeds 100 feed the cat. 
	}

}

