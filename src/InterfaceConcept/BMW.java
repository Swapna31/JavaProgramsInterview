package InterfaceConcept;

public class BMW  implements Car{

	@Override
	public void start()
	{
		System.out.println("Im in start method");
	}
	@Override
public void stop()
{
	System.out.println("im in Stop method");
}
	@Override
public void refuel()
{
	System.out.println("Im in refuel method");
}
}
