import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class tutorial4 {

	public static void main(String[] args) {
		String[] list = {"element1", "element2", "element3"};
		
		for (String word : list) {
			System.out.println(word);
			if (word.equals("element2")) {
				break;
			}
		}
		
		int num = 142;
		
		double desimal = 143.9;
		
		int num2 = (int)desimal;
		
		System.out.println(num2);
		
		String word = Integer.toString(num);
		
		if (word.equals("142")) {
			System.out.println("Hello world");
		}
		
		int input = Integer.valueOf("224");
		
		System.out.println(input);
	
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.println("Enter number");
//
//	    String userName = myObj.nextLine();  // Read user input
//	    System.out.println(Integer.valueOf(userName));  // Output user input
	    
	    Vector<Integer> v = new Vector<Integer>();
	    
	    v.add(14);
	    
	    
	    
	    
	    System.out.println(v.get(0));
	    
	    
	    int[][] matrix = new int[3][3];//{{1,2,3},{4,5,6},{}};
	    
	    /*
	    
	    [ [1,2,3],
	      [4,5,6],
	      [7,8,9] ]
	    
	    */
	    
	    for (int i = 0; i < matrix.length; i++) {
	    	for (int j = 0; j < matrix[0].length; j++) {
	    		System.out.println(matrix[i][j]);
	    	}
	    }
	    
	    Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 100);
	    System.out.println(hm.get("a"));
	    
	    
		
	}

}
