import java.util.*;
public class alphaCharacter {
	 
	public static void main(String args[]) {
	
		//char [] alpha = new char [50];
		
		public static char getRandomLowerCaseLetter() {
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = alphaCharacter.getRandomLowerCaseLetter();
			if ((i + 1) % 10 == 0)
				System.out.println(i);
			else
				System.out.print(i);
		}
	}
}
}