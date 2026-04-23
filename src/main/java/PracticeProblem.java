/**
	* Lesson: Random Module
	* Author: Nithin.A
	* Date Created: April 22, 2023
	* Date Last Modified: April 23, 2026
	*/
import java.util.Random;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int randomInt(int num1, int num2){
	    Random ran = new Random();
		return (ran.nextInt(num2 + 1 - num1))+num1;
	}
	
	public static char randomChar(String str){
	    Random ran = new Random();
	    return str.charAt(ran.nextInt(str.length()));
	}
	
	public static int randomEvenNumber(int num1, int num2){
	    Random ran = new Random();
	    num1 = num1/2;
	    num2= num2/2;
	    return ((ran.nextInt(num2 - num1)+ num1))*2 + 2;
	}

}
