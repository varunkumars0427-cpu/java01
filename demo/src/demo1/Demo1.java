package demo1;

	
	class Parents
	{
	   void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class Demo1 extends Parents {
		void marry1()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			Demo1 test = new Demo1();// object
			test.marry1();
			test.property();
		
		}


}
