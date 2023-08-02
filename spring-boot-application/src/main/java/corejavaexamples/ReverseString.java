package corejavaexamples;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String orginalStr="Hello";
		String reverseStr="";
		
		for(int i =0; i< orginalStr.length(); i++) 
		{
		 
		reverseStr = orginalStr.charAt(i) + reverseStr;
	    }
	 System.out.println("Reversed string: "+ reverseStr);
	 
    }
	
 
	}


