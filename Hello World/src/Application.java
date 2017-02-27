
public class Application {

	public static void main(String[] args)
	{
		System.out.println("Hello World");
		 
		//create person object from Person class
		
		Person p = new Person();
		p.name ="thuy";
		System.out.println(p.name);
		
		//create new object from Person class using second constructor
		Person p1 = new Person("thuy");
		
		//6.-	Invoke (in other words run or call) this method in your main method
		
		p.writeName();
		
		//7. a. Use getName to retrieve the name String from the Person object (in the main method, remember!). Store it there temporarily. 
		
		Person p2 = new Person();
		p2.name ="thu thuy";
		String fname = p2.getName();
		p2.writeName();
		
		//Use the setName method to set the name instance variable of your person object to the full name that you've just created
		Person p3 = new Person();
		p3.setName("nguyen thu thuy");
		p3.writeName();

	}	

	}
	
class Person{
	//  Instance variables are variables within a class but outside any method
	
		String name;
		

	//Modify your "Person" class to add a constructor. Make the constructor output the text "Constructor running!". 
	public Person()	
	{
		System.out.println("Constructor running!");
			
	}
	
	//Second constructor
	public Person(String name)
	
	{
		//set the value of the "name" instance variable using the "name" parameter that you pass in
		this.name ="abc";
		//System.out.println(name);
		//System.out.println(this.name);
		
	}
	// 6. add method "writeName".Make this method output the text "My name is " followed by the value of the name instance -  variable. 
	
	void writeName()
	{
		
		System.out.println("My name is " + name);
	}
	
	// 7. Add getName and setName methods to your class
	
	String getName()
	{
		return name;
		
	}
	
	
	void setName (String name)
	{
		this.name = name;
		
	}
	
}
