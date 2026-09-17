// /*
// Question:

// Input:
// CHNKSC

// Output:
// CSK

// Explanation:
// If the String contain CHN then print last character till CHN of the string in reverse order
//  */
// import java.util.*;
// class CHN_Problem {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter String: ");
// 		String str=sc.nextLine();
// 		String ss="";
// 		if(str.contains("CHN")){
// 			for(int i=str.length()-1;i>=3;i--){
// 				char ch=str.charAt(i);
//                  ss+=ch;
// 			}
// 		}
// 		System.out.println(ss);
		
// 	}
// }



import java.util.*;

class CHN_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int pos = str.indexOf("CHN");

        if (pos != -1) {
            String part = str.substring(pos + 3);

            StringBuilder result = new StringBuilder(part);
            System.out.println(result.reverse());
        }
    }
}