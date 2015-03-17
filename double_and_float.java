
// PROGRAM 4
// WE DECLARE ASSIGN, MANIPULATE AND PRINT  FLOAT AND DOUBLE  VARIABLES
// LAST MODIFIED  17/03/2015 


class double_and_float {

public static void main(String[] args){


float firstvar;                              // a variable of float  type  belongs to the interval ( 3 .4e–038   ,  3.4e+038 )   
double secondvar;                            // a variable of double type belongs to the interval (  1 .7e–308 ,  1.7e+308)




firstvar = 1.333f;    // IN ORDER TO ASSIGN FLOATS YOU MUST WRITE f AT THE RIGHT OF THE NUMBER !!!
secondvar = 1.55555555544443333;


// THE DIFFERENCE BETWEEN DOUBLE AND FLOAT IS THAT Double is a 64 bit number and float is only 32 bit.



//How to print a float with the %f converter

System.out.format("The value of the variable firstvar is: %f \n",firstvar);


//How to print a double  with the %f converter

System.out.format("The value of the variable secondvar is: %f \n",secondvar);




// DIFFERENCES BETWEEN DOUBLE AND FLOAT WHEN PERFORMING THE RATIO OF TWO NUMBERS 

double num1=10.5;
double num2=20.8; 
System.out.println(num1/num2); // It prints  0.5048076923076923  : this result has 16 decimal digits, in the exact (with infinite digits) result  the group of digits 076923 is periodical. 


float num3=10.5f;
float num4=20.8f; 
System.out.println(num3/num4); // It prints  0.5048077    : we have only seven decimal digits and the reult has been approximated, in this case for excess

// We have performed the same ratio between two numbers defined first as double variables and then as float variables.
// The results show us about the rounding operated in the case of floats.



// EXAMPLES WITH VARIOUS MATHEMATICAL OPERATIONS WHICH PRODUCE NON INTEGER NUMBERS 

double squaretwo=Math.sqrt(2);
System.out.println(squaretwo);   //it prints only  16 decimal digits of the square root of 2 


// thrigonometric functions:

double sine=Math.sin(3.45);
System.out.println(sine);   //it prints the sine 

double cosine=Math.cos(0.99);
System.out.println(cosine);   //it prints the cosine 

double tangent=Math.tan(0.99);
System.out.println(tangent);   //it prints the tangent 

// logarithm and exponential

double log=Math.log(10);
System.out.println(log);   //it prints the logarithm of 10 in base e

double exponent=Math.exp(10);
System.out.println(exponent);   //it prints e^10 




// USING CONSTANTS

double greekpi= Math.PI;
System.out.println(greekpi);   //it prints PI = 3,1416....... 



}
}