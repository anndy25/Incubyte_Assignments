package org;

/* Activity No. 1:
       1) Write a program that prints the numbers from 1 to 100
       2) if multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
       2) For numbers which are multiples of both three and five print “FizzBuzz “.
 */

public class FizzBuzz {
 public String converter(int number){
     String answer="";
     boolean isThree=false;
     boolean isFive=false;
     int num=number;
     while(num!=0){
         int current=num%10;
         num=num/10;
         if(current==5) isFive=true;
         if(current==3) isThree=true;
     }
     
     if(isThree) answer+="Fizz";
     if(isFive) answer+="Buzz";

     if(number%3==0){
         answer+="Fizz";
     }
     if(number%5==0){
         answer+="Buzz";
     }
     if((!isThree && !isFive)  && (number%3!=0 && number%5!=0)){
         answer+=""+number;
     }

     return answer;
 }

}