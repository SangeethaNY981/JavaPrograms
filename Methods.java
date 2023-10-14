package StringBufferDemo;
//mutable class

public class Methods {

	public static void main(String[] args) {
		
		   //append()
				StringBuffer sb =new StringBuffer("Java ");
				sb.append("fullstack");
				System.out.println(sb);
     //				
				String st ="hello";
				String st1="hello";
				boolean st2= st==st1;      //==
				System.out.println(st2);
       //				
				boolean rs=st.equals(st1);  //equals() 
				System.out.println(rs);
				
				StringBuffer sb1=new StringBuffer("Manas");
				System.out.println(sb1.insert(5, " Rath"));
				
				StringBuffer sb2=new StringBuffer("Manas Rath");
				System.out.println(sb2.delete(2,5));                        //deleting between 2-4 index value
				
				StringBuffer sb3=new StringBuffer("Ruchika");
				System.out.println(sb3.replace(0, 7, "hi"));   //it will replace index 1-5 with hi
				
				
				StringBuffer sb4=new StringBuffer("Hello ");
				System.out.println(sb4.reverse()); 
				System.out.println(sb4.capacity()); //default value is 16
				System.out.println(sb4.toString());
				
	}

}
