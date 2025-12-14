package interview;

public class StringIsAPalindromeOrNot {

	public static void main(String[] args) {

		String s = "madam";
		int n = s.length();
		String rev = "";
//		for (int i = n - 1; i >= 0; i--) {
//			rev += s.charAt(i);
//		}
		for (int i = n-1; i >=0 ; i--) {
			rev+=s.charAt(i);
		}
		if (s.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
