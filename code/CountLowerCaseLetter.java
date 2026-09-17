// import java.util.*;
// class CountLowerCaseLetter{
// 	public static void main(String[] args) {
// 		Scanner sc =new Scanner(System.in);
// 		System.out.print("Enter String: ");
// 		String str=sc.nextLine();
// 		int count=0;
// 		for(int i=0;i<str.length();i++){
// 			char ch=str.charAt(i);
// 			if(Character.isLowerCase(ch)){
//                count++;
// 			}
// 		}
// 		System.out.println("LowerCase Letter count: "+count);
// 	}
// }




import java.util.*;
class CountLowerCaseLetter{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') count++;
		}
		System.out.println("LowerCase Letter count: "+count);
	}
}