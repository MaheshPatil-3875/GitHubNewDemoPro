package packageJava;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "WelcoMe MaHesH";
		String upper = "";
		String lower = "";
		
		for(int i=0;i<name.length();i++)
		{
			char ch= name.charAt(i);               //.chatAt(i) return the character at specific index 
			if(ch>=65 && ch<=90)                   //.toCharArray() convert the string int sequence of characters
			{
				upper = upper + ch;
			}
			else
				lower= lower + ch;
		}
		
		System.out.println("Upper case latters = " +upper);
		System.out.println("Lower case latters = " +lower);
		

	}

}
