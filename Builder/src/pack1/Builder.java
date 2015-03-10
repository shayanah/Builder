package pack1;
//V00
import java.lang.StringBuilder;
import java.util.Scanner;

public class Builder {
	
	StringBuilder str;
	
	/**
	 * Take the statement "Java is fun." from keyboard 
	 * @return stringBuilder. capacity
	 */
	public int program()
	{
		System.out.println("Type in Java is fun.");
		Scanner in = new Scanner(System.in);
		str = new StringBuilder(in.nextLine());
		return str.capacity();
	}
	/**
	 * append "I love it" to the stringBuilder
	 * the take the string "yes" from keyboard
	 * add the string "yes" between the last two string
	 */
	public void appending()
	{
		int len = str.length();
		str.append("I love it!");
		System.out.println("Type in Yes");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		str.insert(len, " " + s + ", ");
	}
	/**
	 * 
	 * @return stringBuilder
	 */
	public StringBuilder getStr() {
		return str;
	}
	
	
}
