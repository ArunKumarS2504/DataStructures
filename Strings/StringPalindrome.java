package Strings;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String str = "racecar";
		int i=0;
		int j= str.length()-1;
		while(i<j) {
		if(str.charAt(i) != str.charAt(j)) {
			System.out.println("Is a not palindrome");
			return;
		}
		i++;
		j--;
		}
		
		System.out.println("is a palindrome");
		
	}

}
