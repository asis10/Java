
public class StringBufferDemo {

	public static void main(String[] args) {
		String a  = "Ashish Paudyal";
		StringBuffer sb = new StringBuffer(a);
		StringBuffer sb2 = new StringBuffer("madam");
		
	
		
//	1
//		sb.append("is Programming Lang");
//		System.out.println(sb);
//		
//		sb.append(s);
//		System.out.println(sb);
//		
//		sb.append(1.2f);
//		System.out.println(sb);
		
//	2
//		System.out.println(sb.insert(2, "aaa");

//	3	
//		System.out.println(sb.replace(0, 1, "baalai farara"));
		
//	4
//		System.out.println(sb.deleteCharAt(2));
		
//	5
//		System.out.println(sb.delete(4, 9));

//	6
//		System.out.println(sb.reverse());
		
//	7 and 8
//		System.out.println(sb.capacity());     // initially capacity is 16 but String sb has 23 letters which makes capacity 16+23=39
//		
//		sb.append(" is beautifulllllllllllllllll");  // appending is done
//		System.out.println(sb);
//		System.out.println(sb.capacity());      // the capacity 39 is not enough to store the appended value . hence new_capacity = (old_capacity*2+2) i.e (39*2+2=80)
//		System.out.println(sb.length());        // prints the actual length

//		9
//		System.out.println(sb.charAt(4));

//		10
//		sb.reverse();
//		System.out.println(sb);
//		System.out.println(sb.compareTo(sb2)==0);
//		if(sb.compareTo(sb2)==0)
//			System.out.println("Palindrome");
//		else 
//			System.out.println("Not Palindrome");
		
//		11
//		int b = sb.indexOf("s");
//		System.out.println(b);
		
//		12
//		System.out.println(sb.lastIndexOf("s"));
		
//		13
//		System.out.println(sb.subSequence(2, 5));	//returns in character
	
//		14
//		System.out.println(sb.substring(2,5));   //returns in string
//		System.out.println(sb.substring(2));
		
//		15
//		System.out.println(sb.toString()); //typecasts stringbuffer to strings
		
//		NOTE : STRINGBUILDER AND STRINGBUFFER USE SAME METHODS. IT IS JUST THE MATTER OF THREAD SAFETY
	
		
		
		
		

		
		
		
	}
}
