import java.util.*;
class CountTwoConsecutiveVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.nextLine();
		String[] words=str.split("\\s+");
		String vowels="aeiouAEIOU";
		int count=0;
		for(String word:words){
			for(int i=0;i<word.length()-1;i++){
				char ch=word.charAt(i);
				char ch1=word.charAt(i+1);
				if(vowels.indexOf(ch)!=-1 && vowels.indexOf(ch1)!=-1){
                 count++;
				}
			}
		}
		
		System.out.print("Two Consecutive Vowel count is: "+count);
	}
}