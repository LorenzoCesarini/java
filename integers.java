
// Program Number 2
// In this program we declare and assign various int variables and  print them
// LAST MODIFIED 15/03/2015

class integers{

public static void main(String[] arg){

// USING INTEGERS AND PRINTING THEM

int num;     // The int type starts always with a lower case letter

num=6;       // AS WE CAN SEE THE DECLARATION OF A VARIABLE AND THE ASSIGNMENT OF ITS VALUE CAN HAPPEN IN TWO DIFFERENT MOMENTS

System.out.println(num);  // this is the command to use if we want to print only the value of the variable

System.out.println("The variable num has been assigned the value: "+num);  // to print a variable after the text you need to write the plus
                                                                          // In Python and C instead a simple comma is needed

																		  
System.out.println("The variable num has been assigned the value "+num+" and we are happy like that"); 
// this line shows how to print a variable between two statements.
// Remember to leave a space both on the left and right of the quotation marks near the variable that you want to print


// HOW TO PRINT MORE VARIABLES:

int newnum =15;   //we need first to declare a new variable and assign a value to it 

System.out.println("First Attempt: The variables num  and newnum have been assigned the values: "+ num + newnum);  //in this way the number printed is 615 we need spaces!!

System.out.println("Second Attempt: The variables num  and newnum have been assigned the values: " + num+ "\t"+ newnum); 
//  the tab  works but this is more complex than other programming languages SEE BELOW

// third wrong attempt, let's learn how to use format 
System.out.format("Third attempt: The variables num and newnum have been assigned the values: ", num, newnum); //prints only the text
System.out.format("\n\n");   // and it doesen't go to a newline that's why I had to print two newline commands  
 


// the correct way is the following:
System.out.format("Fourth attempt: The variables num and newnum have been assigned the values: %d  %d \n", num, newnum);


//what if we wanted to print only one variable?
System.out.format("The variable num has been assigned the value: %d \n", num);
// this is the unique working way if you use .format .    With .format  you must use also %d and the comma 
// NOTICE THAT System.out.println IS MEANT TO PRINT TEXT LINES, THAT'S WHY WE USE THE +, IT IS THE COMMAND TO JOIN DIFFERENT STRINGS!!!!
// System.out.format INSTEAD  MUST BE USED TO PRINT NUMBERS THAT WE WANT TO PERCEIVED FOR WHAT THEY ARE AND NOT AS STRINGS


//fifth attempt: another possible method to print more variables on the same line consists in using  .print and .println 
System.out.print("Fifth Attempt: The variables num  and newnum have been assigned the values: ");
System.out.print(num);
System.out.print(" ");
System.out.print(newnum);
System.out.println(".");  // this last line or something like  "System.out.print("\n");"  or  "System.out.print();"   is necessary to go to a new line 


//IS IT POSSIBLE TO CARRY OUT OPERATIONS BETWEEN VARIABLES INSIDE THE PRINT? LET'S CHECK 

System.out.println((num + newnum));  // this line prints correctly 21 : you need the double brackets, NO! see next line
System.out.println(num+newnum);      // This line prints correctly 21 : DOUBLE BRACKETS ARE NOT NEEDED IF THERE ISN'T TEXT

//let us try to print some text and carry an operation at the same time:

System.out.println("The sum of the variables num and newnum is :"+(num + newnum)); 
//this line works correctly, notice the difference between the two +: the first plays the role of the comma in C, the second is needed to add the two integers 



// HOW TO REASSIGN A VALUE TO A VARIABLE

int a=12;
System.out.println("a="+a);
a=33;
System.out.println("Now a="+a);   // the reassignment works normally and here we obtain a=33 on screen



// INCREASE A VARIABLE OF A CERTAIN AMOUNT WITH +=

int b=5;
b+=1;  // this command will increase b of 1

System.out.println("b="+b);   // b is printed correctly as 6   OK



// RESULT OF THE RATIO BETWEEN INTEGERS

int g=5;
int f=3;
 
System.out.println(g/f);  // only the integer part is printed, the result is 1

double h= g/f;            // this is how to declare a decimal number, the other option is float 

System.out.println(h);   // the number printed is 1.0 THIS MEANS WE MUST CAST BEFORE THE RATIO

double h2= (double) g/f;

System.out.println(h2);    // it prints  1.6666666666666667  OK



// OPERATIONS BETWEEN INTEGERS

int number1= 14;
int number2= 16;

System.out.println(number1+number2);  //sum
System.out.println(number1*number2);  // product
System.out.println(number1/number2);  // ratio (gives only the integer part as seen above) it gives 0 correctly
System.out.println(Math.pow(number1, number2));  // to raise number1 to the number2th  power use Math.pow(base, exponent)
System.out.println(20%8); // it prints the remainder of the division 20:8 which is 4 OK   
System.out.println(Math.sqrt(4)); // it prints the square root of 4 which is printed as 2.0






// PRINTING AN INTEGER WITH %d 

int income= 5000;

System.out.format("I wish i earned %d $ a month\n",income);

//  the %d can be mofied to diplay commas evey 3 digits
//The %,dcode displays a decimal with commas dividing each three digits:

System.out.format("I wish i earned %,d $ a month\n",income); // on my computer it actually prints 5.000, it uses the dot!

// let us try to use %.d instead

//System.out.format("I wish i earned %.d $ a month\n",income); IF YOU EXECUTE THIS LINE IT GIVES AN ERROR



// how to use  %5d  to select only a part of a number with more that 5 digits 

//int superincome= 1234567890;

//System.out.format("I wish i earned %5d $ a month\n",superincome);   IT DOESN'T WORK





// HOW TO DECLARE VARIABLES THAT CANNOT BE MODIFIED LATER WITH A SECOND ASSIGNMENT

final int answer=42;   // final in Java is the equivalent of const in C


System.out.format("The answer to the universe, life and it all is %d\n", answer); 
System.out.format("Let us try to change it to 43\n"); 

//answer=43;  // this command is consider illegal and the program cannot be compiled 
// the user is reminded that " error:cannot assign a value to final variable answer"









}

}