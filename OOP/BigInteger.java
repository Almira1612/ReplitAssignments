import java.util.Collections;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class BigInteger {
	
	private static final boolean POSITIVE   = true;
    private static final boolean NEGATIVE = false;
    
	/**
	 * // this array stores the number. Each digit of the number is an 
	 * element of the array
	 */
	private final int[] number;
	/**
	 * sign of this BigInteger. POSITIVE or NEGATIVE
	 */
    private final boolean sign;	
    
    /**
	 * Default constructor, creates a BigInteger object whose value is 0.
	 * and whose sign is positive
	 * 
	 * This constructor will assign sign of the BigInteger
	 * and will assign BigInteger array called number to 0
	 */
	public BigInteger(){
		//TODO
		//replace assignments for number and sign with accordance to constructor description
		number =  new int[1];
		number[0] = 0;
		this.sign = POSITIVE;
	}
    /**
	 * Constructor, creates a BigInteger object with given sign and given array of numbers
	 * @param sign of a number
	 * @param array of integers 
	 * This constructor will assign sign of the BigInteger
	 * and will copy all elements of the given array into BigInteger array called number
	 */
	public BigInteger(boolean sign, int[] val){
		//TODO
	    //replace assignments for number and sign with accordance to constructor description
		number = new int[val.length];
	        for(int i=0; i<val.length; i++) {
	            number[i]=val[i];
	        }
	        
	        this.sign = sign;
	}
	
	/**
	 * Create a BigInteger object using the number given as string. 
	 * If the string starts with "-", it indicates, the number is negative.
	 * 		in this case assign sign to negative and store all numbers from  a String in number array
	 * If the string starts with "+", or a digit, the number is positive. 
	 * 		in this case assign sign to positive and store all numbers from  a String in number array
	 * If the string is null or empty, the number is zero. zero is a positive number. 
	 * 		in this case assign sign to positive and store 0 in number array
	 * If string contains non-digit characters, throw IllegalArgumentException
	 * 		in this case use the following syntax to throw an exception:
	 * 						throw new IllegalArgumentException();
	 * 
	 * 
	 * 
	 * @param n: the number in string format. 
	 *  For example:
	 * 	BigInteger b1 = new BigInteger("1234567890");
	 *  b1 is a BigInteger with value of 1234567890 stored in number array
	 *  BigInteger b2 = new BigInteger("-1234567");
	 *  b1 is a BigInteger with value of -1234567 stored in number array
	 *  BigInteger b3 = new BigInteger("+123");
	 *  b3 is a BigInteger with value of +123 stored in number array
	 *  BigInteger b3 = new BigInteger("+123xyz");
	 *  throw IllegalArgumentException
	 */
	public BigInteger(String strNumber){
		//this();	//use to call the default constructor
		
		//TODO
	    //replace assignments for number and sign with accordance to constructor description
		if(strNumber == null || strNumber.isEmpty())  // IF STRING IS EMPTY OR NULL
		{
			number = new int[1];
			number[0] = 0;
			this.sign = POSITIVE;
		}else { // if the string is NOT empty
			String num;
			// CHECKING FOR SIGN OF NUMBER
			if(Character.isDigit(strNumber.charAt(0))) {  // MADE STRING OF NUMBERS
				this.sign = POSITIVE;
				num = strNumber;
				
			}else if(strNumber.charAt(0) == '+') {        // FOUND THE SIGN OF THE NUMBER
				this.sign = POSITIVE;
				num = strNumber.substring(1);
				
			}else if(strNumber.charAt(0) == '-') {
				this.sign = NEGATIVE;
				num = strNumber.substring(1);
				
			} else {
				throw new IllegalArgumentException();
			}
			
			// FIRST LETS CREATE THE ARRAY WITH THE RIGHT SIZE
			number = new int[num.length()];
			
			// WE WILL NOW READ ALL THE NUMBERS AND SAVE THEM
			for(int i = 0; i < num.length(); i++) { // 1  2  3  4 [ 1 , 2  ,  ,  ]
				char check = num.charAt(i);
				if(Character.isDigit(check)) {
					number[i] = Character.getNumericValue(check);
				}else {
					throw new IllegalArgumentException();
				}
			}
			
		}
	}
	/**
	 * Create a BigInteger object using another another BigInteger.
	 * This constructor will take another BigInteger as a parameter and will copy all the values into
	 * this BigInteger and assign the sign
	 * @param another: BigInteger object
	 * 	BigInteger b = new BigInteger("1234567890")
	 * 
	 * Create a new BigInteger object using b
	 *  BigInteger b2 = new BigInteger(b)
	 */
	public BigInteger(BigInteger another){
		//TODO
	    //replace assignments for number and sign with accordance to constructor description
		number =  new int[another.number.length];
	     for(int i=0;i<another.number.length;i++) number[i]=another.number[i];
	        	this.sign = another.sign;
	}
	
	
	
	/**
	 * Adds two BigIntegers, and creates a new BigInteger with the result of the addition
	 * 
	 * IMPORTANT: Pay attention to the integer sign and length   
	 * 		When two positive values are added, the result is positive (2+2=4)
	 *      When one positive and one negative numbers are added, 
	 *      		the result can be negative (-4 + 2 = -2) or positive (-2 + 3 = 1)
	 *      When two negative values are added, the result is negative (-2 + -2 = -4)
	 *      When both numbers are zeroes, the result is zero as well
	 *      																		 
	 * Two add two big integers, we cad add each digit at the same index
	 * from the two arrays. For example: 
	 * a:[1,2,3,4]
	 * b:[5,6,7,8]
	 * a+b is
	 * [6,9,1,2]    
	 *  																	     
	 * @param b: BigInteger to be added to this BigInteger Object
	 * @return: a new BigInteger object, whose value is the sum of this and b, two BigInteger
	 *          objects
	 */
	public BigInteger add(BigInteger b){
	
		//TO DO
String AA=Arrays.toString(number).replace(", ","").replace("[", "").replace("]",""), 
				BB=Arrays.toString(b.number).replace(", ","").replace("[", "").replace("]","");		
			boolean Aresult=sign, Bresult=b.sign;
				if(Aresult == false) AA="-"+AA;
				if(Bresult == false) BB="-"+BB;
					
			BigDecimal A=new BigDecimal(AA),B=new BigDecimal(BB),results= A.add(B);
					return new BigInteger(""+results);
	}
	

	
	/**
	 * Subtracts BigInteger b from this BigInteger, and creates a new BigInteger with 
	 * the result of the subtraction.
	 * @param b: BigInteger to be subtracted from this BigInteger Object
	 * @return: a new BigInteger object
	 */
	public BigInteger sub(BigInteger b){
		//TODO
	String AA=Arrays.toString(number).replace(", ","").replace("[", "").replace("]",""), 
				BB=Arrays.toString(b.number).replace(", ","").replace("[", "").replace("]","");	
			
				boolean Aresult=sign, Bresult=b.sign;
				if(Aresult == false) AA="-"+AA;
				if(Bresult == false) BB="-"+BB;
					
		  BigDecimal A= new BigDecimal(AA),B= new BigDecimal(BB),results= A.subtract(B);
					return new BigInteger(""+results);
	}
	
	
	
	/**
	 * Compares this BigInteger with the specified BigInteger. 
	 * @param b: BigInteger to which this BigInteger is to be compared.
	 * @return:  -1, 0 or 1 as this BigInteger is numerically less than, 
	 * equal to, or greater than b

	 */
	public int compareTo(BigInteger b) {
		//TODO
		BigInteger a= new BigInteger(sign, number);
		   if(a.sub(b).isZero())  return 0;
		   else if(a.sub(b).sign)  return 1;
			   return -1;  
	}
	public boolean equals(BigInteger b) {
		return this.toString().equals(b.toString());
	}
	/**
	 * Returns an int array containing this BigInteger. 
	 * The array will contain each digit of this BigInteger as an element
	 * @return: an int array containing this BigInteger, ignore the sign
	 */
	public int[] toArray(){
		//TODO
		return number;
	}
	/**
	 * Check if the BigInteger is zero
	 * @return true if BigInteger value is zero. False otherwise
	 */
	public boolean isZero(){
		//TODO
		if(this.number.length == 1)
			if(this.number[0] ==0)
				return true;
		return false;
	}
	/**
	 * Returns the length of this BigInteger. length is the number of digits in a BigInteger
	 * @return: length of this integer
	 */
	public int length(){
		//TODO
		return number.length;
	}
	
	/**
	 * Returns the sign of this BigInteger.
	 * @return: sign of this integer
	 */
	public boolean sign(){
		return sign;
	}
	

	
	/**
	 * returns the the BigInteger in string format. If the number is 
	 * negative, return string must start with a "-"
	 * @return BigInteger in a String format
	 */
	public String toString(){
		//TODO
		String str = "";
        if (!this.sign)   str += "-";
        for (int i = 0; i < number.length; i++)   
        	str += "" + number[i];  
        return str;
		
	}
	
}
