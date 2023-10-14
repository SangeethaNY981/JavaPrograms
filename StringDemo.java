package String;

public class StringDemo {

	public static void main(String[] args) {
		
		String name="shaun";
		int str =name.length();
		System.out.println(str);
		
		//charAt()
		String str1="world";
		char str2=str1.charAt(4);
		System.out.println(str2);

		//concat(string str)
		String str11="EDU";
		String str21="Bridge";
		String Result =str11.concat(str21);
		System.out.println(Result);
		
		//equals(Object o)
		//equalIgnoreCase()
		String st="hello";
		String st1 ="Hello";
		boolean rs=st.equals(st1);
		boolean Rs =st.equalsIgnoreCase(str1);
		System.out.println(Rs);
		
		//to LowerCase()
		String name3="CAPGEMINI";
		String Lowercase =name3.toLowerCase();
		System.out.println(Lowercase);
		
		// to UpperCase()
		String name4="helloworld";
		String UpperCase =name4.toUpperCase();
		System.out.println(UpperCase);
		
		//to trim()
		String str31 ="                welcome         ";
		String str41 =str31.trim();
		System.out.println(str41);
		
	}

}
