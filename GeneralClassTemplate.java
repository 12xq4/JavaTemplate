
public class GeneralClass {
	//an example of a concrete class template
	
	private int variables;
	private String var;
	// this is where the class variables are located, they will be visible to the entire class => all methods within the same class can access and use these variables.

	public GeneralClass (){
		variables = 10;
		var = "Default";
		// this is the assignment stage, where you initialize an object based on pre-determined values.
	}

	public GeneralClass (int number, String name){
		variables = number;
		var = name;
		// this is the assignment stage, where you initialize an object by giving values to the attributes that are within.
	}

	public int accessor (){
		return variables;
		// a good class will try to protect the privacy of its attributes so that no other program will try to change it.
		// but the cost of making variables private is that no one can even read it. So to solve this problem, we need a method which tells other programs
		// what are the values of certain variable. 
	}

	public void mutator (int new_variables){
		variable = new_variables;
		// same reasoning as above, except what you do here is providing an alternative path for a certain program to change the value of certain variable.
		// note that this doesn't mean the variable is not protected, this is more like a access right to functions that need/should change a variable's value.
	}

	int actions (){ //default privacy => allows method within the same class and any children to use it. 
		return variables * 2;
		// these are method which calcuates/output values. 
		// you might need certain calculations (or perform certain actions with a object of this type), and you make your methods for them here.
		// you could have multiple methods for each. 
	}

	public String toString (){
		return "The variable is "+ variables +" and name associated is " + var;
		// I don't know if you ever tried printing an object before, but what you will get is the object's address in memory, not its actual value.
		// So what you are doing here is that you specify the desired message when you call System.out.println(GeneralClass object);
	}

	public int compareTo (GeneralClass another_object_of_the_same_class){
		if (variables>other.accessor())
			return 1;
		else if (variables==other.accessor())
			return 0;
		else
			return -1;

		//compare two objects of the same type by some standards (attributees)
		// 1 => true, if the object is greater than the other object.
		// 0 if they are equal.
		// -1 if the object is less than the other object.
		// can also be implemented using <Generic>>
	}

	public bool equal (Object another_object_of_unknown_kind){
		if (!another_object_of_unknown_kind.instanceOf(GeneralClass))
			return False;
		// check if they are the same kind. If not, then they are not euqal.
		else { // now you are sure that they are the same kind
			if (variables == another_object_of_unknown_kind.accessor())
				return true;
			//note that I assume you only have to compare one value. You could compare more than one values.
		}
		return False;
		// none of the condition above fits the problem. False by default.
	}
} //end of class

