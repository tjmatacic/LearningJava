
public class notesInCode {
	public static void main(String[] args)
	{
		System.out.println("public: is called a access modifier, it  controls what other parts of the program can use this code "
				+ "\n Class is a keyword and it's here to remind me that everything in a Java program lives in a class "
				+ "\n Class is the building block of Java EVERYTHING in Java must be in a class "
				+ "\n every Java app must have a main method whose header is identical to the one used here"
				+ "\n for function calls Java uses this syntax object.method(parameters)"
				+ "\n if I want to \t\t tab a line I need a forward slash and a 't'"
				+ "\ndeclerations and assignments, declerations are when you declare a variable type and name like: 'int salary' to assign the variable we need a = in this case initalizing salary might look like: 'salary= 10,000'"
				+ "\n decleration: whenever you define a new variable WITH its type"
				+ "\n Assignment: whenever you change the value of a variable by giving it a new value "
				+ "\n Initialization: an assignment that is done TOGETHER with the decleration, or the first assignment that is done with a variable"
				+ "\n String is a built in clas for Java, anything in quote marks is am instance of the string class"
				+ "\n indeterminate loop: used for when we don't know how many times a loop should be processed the while loop is an example"
				+ "\n for if else if we have multiple selections if/else can be cumbersome, java uses a switch statement to deal with this"
				+ "\n switch statement uses 'switch' (choice) and 'break'"
				+ "\n arrays denoted with []"
				+ "chapter 3 finished!"
				+ "\n object oriented programming (OOP) puts the data first then looks at the algorithims that perate the data"
				+ "\n Class= blueprint which objects are actually made. Classes are 'cookie cutters' and objects are 'cookies'"
				+ "\nInstance: when you construct an object from a class"
				+ "\n Encapsulation: (data hiding) is a key concept in OOP, combining data behavior in one package and hiding it from user the dat are called 'instance fields' and the functions that operate the data are called 'methods'"
				+ "\n3 key characterists of objects: 1.behavior (what you can do with it) 2.State (how does it react when you apply those methods)3. identity(how it distinguishes its self from  others that may have the same behavior and state"
				+ "\n common relationships between classes 1.dependence (uses-a) 2.aggregation (has-a) 3. inheritence (is-a)"
				+ "\n\t\t!!page 121 has great info on Constructors!!"
				+ "\nmutator Methods: methods that chang einstance fields (accessor methods only access instance fields"
				+ "\nmethods have the ability to access the private data of all objects in its class, private methods: when implementing a class we make all data fields private since public data is dangerious"
				+ "\n private methods can only be called upon from other methods of the same class"
				+ "static: if you deermine a field as static it measn that there is only one such field per class, instance fields should almost always be set as private so encapsulation isn't ruined"
				+ "\nConstructor: has the same name as a class, a class can have more than 1 constructor, they may take 0, 1, or more parameters, has no return value, IS ALWAYS CALLED WITH THE NEW OPERATOR"
				+ "\n Static Modifier: if you define a filed as static then there is only one such field per class, static fields belong to the class not individual objects"
				+ "\n Default Constructor: a constructor with no parameters, data is 0 boolian is 'false' and object variables are 'null' using the 'this' keyword calls a constructor of the same class"
				+ "\nPackage: a group of classes. a class can use all classes from it own package and all public classes from other packages"
				+"\nClass design hints:1always keep data private 2.always initialize data 3.dont use too many basic types in a class 4.not all fields need individual field accessors and mutators 5.use a standard form for class definitions 6.break up classes with too many responsibilities 7. make names and methods reflect their responsibility");
		/*System.out.println("Class is a keyword and it's here to remind me that everything in a Java program lives in a class, ");*/
	}
}
