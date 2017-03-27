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
 
public static  String numToWords(int n, String s)
{
    String str = "";
    // if n is more than 19, divide it
    if (n > 19)
        str += tens[n / 10] + ones[n % 10];
    else
        str += ones[n];
 
    // if n is non-zero
    if (n != 0)
        str += s;
 
    return str;
}
 
// Function to print a given number in words
public static String convertToWords(int n)
{
     String out="";
 
    // Getting crore place value
    out += numToWords((n / 10000000), "crore ");
 
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
 
public  static void main(String args[])
{
  
    int n = 001;
 
    // calling the function to convert given number in words
    System.out.println(convertToWords(n));
    
    int n1=12345678;
    
    System.out.println(convertToWords(n1));
    
}
}
