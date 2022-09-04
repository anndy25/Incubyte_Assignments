package org;

/* Activity No. 1:
       1) Write a program that prints the numbers from 1 to 100
       2) if multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
       2) For numbers which are multiples of both three and five print “FizzBuzz “.
 */

public class FizzBuzz {
 public String converter(int number){
     String answer="";
     if(number%3==0){
         answer+="Fizz";
     }
     if(number%5==0){
         answer+="Buzz";
     }
     if(number%3!=0 && number%5!=0){
         answer+=""+number;
     }

     return answer;
 }

}