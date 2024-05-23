package UserDefinedMethods;



public class MethodExample
{
	public void addition()
	{
		//local/instance variable
		int var1=30;
		int var2=20;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable  var3 after Addition Operation is :"+var3);
		
	}
		
				
		/**
		 * @param args
		 */
		public static void main(String[] args) 
		{
			MethodExample ranjith=new MethodExample();
			ranjith.addition();
}

				
	}

