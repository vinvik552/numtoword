import java.io.*;
import java.util.*;
class Numtoword
{
// Creating String array for number from 1 to 19
	
static String ones[] = {"","one ", "two ", "three ", "four ",
                 "five ", "six ", "seven ", "eight ",
                 "nine ", "ten ", "eleven ", "twelve ",
                 "thirteen ", "fourteen ", "fifteen ",
                 "sixteen ", "seventeen ", "eighteen ",
                 "nineteen "
               };
 
// Creating an array for tens value 

static String tens[] = { "", "", "twenty ", "thirty ", "forty ",
                 "fifty ", "sixty ", "seventy ", "eighty ",
                 "ninety "
               };
 
public static  String numToWords(long n, String s)
{
    String str = "";
    // if n is more than 19, divide it
  
    if (n > 19)
    {
    	str += tens[(int) (n / 10)] + ones[(int) (n % 10)];
    }
    else
        {
    	str += ones[(int) n];
        }
    
    // if n is non-zero
    if (n != 0)
        str += s;
    return str;
}
 
// Function to print a given number in words
public static String convertToWords(long n)
{
     String out="";
 
    // Getting billion place value
     out +=numToWords((n/1000000000),"billion ");
    // Getting crore place value
     out += numToWords(((n / 10000000) %100), "crore ");
        // Getting lakh place value
    out += numToWords(((n / 100000) % 100), "lakh ");
   
    // Getting thousand place value
    out += numToWords(((n / 1000) % 100), "thousand ");
   
    // Getting hundred place value
    out += numToWords(((n / 100) % 10), "hundred ");
    
    if ( n > 100 && (n % 100) < 100)
        out += "and ";
 
    // handles digits at ones and tens places
    out += numToWords((n % 100), "");
    
    return out;
}
 
public  static void main(String args[]) throws Throwable
{
  
    long n = 000;
 if (n == 0)
	 System.out.println("Zero");
    // calling the function to convert given number in words
 else   
 System.out.println(convertToWords(n));
    
    long n1=123456789;

    if (n1 == 0)
   	 System.out.println("Zero");
    else
    System.out.println(convertToWords(n1));
    
}
}
