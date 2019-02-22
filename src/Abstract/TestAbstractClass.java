package Abstract;

public class TestAbstractClass {

	public static void main(String[] args) {
		HdfcBank hd=new HdfcBank();
		
		//Create object for child class and call parent methods uisng child obj ref
		hd.loan();
		hd.Debit();
		hd.Credit();
		
		Bank b=new HdfcBank();
		b.loan();
		b.Debit();
		b.Credit();

	}

}





