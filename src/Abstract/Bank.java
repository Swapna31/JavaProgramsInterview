package Abstract;

//Abstract class can have abstract methods and non-abstract methods.
//We cant achieve 100% abstraction
public abstract class Bank {
	
	//This is abstract method.- No Method body,only method declaration
	public abstract void loan();
	
	//This is non-abstract method.
	public void Credit()
	{
		System.out.println("Im in credit method");
				}
	
public void Debit()
{
	System.out.println("Im in debit method");
}
	
}

