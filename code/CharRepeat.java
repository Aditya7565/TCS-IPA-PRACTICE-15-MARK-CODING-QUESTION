/*
String Compression Problem

Description: Given a string, compress it by replacing consecutive repeated characters with the character
followed by the number of repetitions. For example, the string "aabbbcc" should be compressed to "a2b3c2",
while "abbccc" should become "a1b2c3".

Input:
A string consisting of lowercase letters.

Output:
A compressed string where consecutive characters are replaced by the character followed by its count.


Examples:

Example 1: Input: aabbbcc Output: a2b3c2

Example 2: Input: abbccc Output: a1b2c3

Constraints:

The input string will only contain lowercase letters (a-z).
The length of the input string will not exceed 1000 characters.
 */


// import java.util.*;
// class CharRepeat {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter your String: ");
// 		String str=sc.nextLine();
// 		HashMap<Character,Integer> map=new HashMap<>();
// 		for(int i=0;i<str.length();i++){
// 			char ch=str.charAt(i);
// 			if(map.containsKey(ch)){
// 				map.put(ch,map.get(ch)+1);
// 			}
// 			else{
// 				map.put(ch,1);
// 			}
// 		}

// 		 for (char i : map.keySet()) {
//             System.out.print(i+""+map.get(i));
//         }
// 	}
// }





import java.util.*;
class CharRepeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}
			else{
				map.put(ch,1);
			}
		}
		for(char i:map.keySet()){
			System.out.print(i+""+map.get(i));
		}
	}
}
























