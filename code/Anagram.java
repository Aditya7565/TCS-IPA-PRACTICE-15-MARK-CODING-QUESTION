/*Given two string s and t, return true if t is an anagram of s, and false otherwise.

*/
import java.util.*;
class Anagram {
	public static boolean checkAnagram(String s,String t){
		if(s.length()!=t.length()){
			return false;
		}
		char char1[]=s.toCharArray();
		char char2[]=t.toCharArray();
		Arrays.sort(char1);
        Arrays.sort(char2);
		if(Arrays.equals(char1,char2)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String first: ");
		String s=sc.nextLine();
		System.out.println("Enter String second: ");
		String t=sc.nextLine();
		System.out.println(checkAnagram(s,t));

		

	}
}