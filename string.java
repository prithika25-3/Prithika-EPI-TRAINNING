import java.util.Scanner;

public class Main
{
    static String reverseString(String str){
        	
		String empStr = "";
		int a=str.length()-1;
		for(int i=a;i>=0;i--){
		    empStr+=str.charAt(i);
		   
		}
	    return empStr;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(Main.reverseString(str));
	}

}