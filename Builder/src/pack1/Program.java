package pack1;

public class Program {
	
	public static void main(String[] args)
	{
		Builder builder = new Builder();
		int capacity = builder.program();
		System.out.println(capacity + " " + builder.getStr() );
		
		builder.appending();
		System.out.println("Capacity: " + capacity + ": " + builder.getStr() );
	}
}
