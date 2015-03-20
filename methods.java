
// Program 8 
// We show here how to create new methods (the equivalent of functions in C)
// Last modified 20/03/2015


//Remark: this program is a first example of a class as a collection of methods



class methods {

// THE VARIOUS Methods can BE DEFINED BEFORE or after THE MAIN:

public static double  Sum (double a, double b){
return a+b;
} 
// this function returns simply the sum of the two arguments.
// REMEMBER THAT THE TYPE OF THE FUNCTION COINCIDES WITH THE TYPE OF THE RETURNED QUANTITY.
// after the return the semicolon is obligatory


public static void newline(){
System.out.println(" ");	
}
//this function simply prints a new line, for this reason it is of void type 



// AN INTERESTING KIND OF METHODS:  RECURSIVE METHODS (THEY CALL THEMSELF)
public static void countdown(int n) {
if (n == 0) {
System.out.println("Blastoff!");
} else {
System.out.println(n);
countdown(n-1); // here the method calls itself
}
}
// we will assign the value 4 inside the main and its execution continues until n=0





public static void main(String[] args){


double var1 =13.45;
double var2= 17.5;

double newvar=Sum(var1,var2);  // HERE THE VARIABLE  newvar has been initialized as the output of the function Sum. OK 
System.out.println(newvar);
newline(); // we should see an empty line on screen OK
System.out.println("Hi, I am the line printed after the newline() command!\n\n\n");



//LET US TRY TO CALL A METHOD DEFINED AFTER THE MAIN

double secondvar=Diff(var2, var1);
System.out.println(secondvar+"\n\n"); // it works






// let us see how a recursive method works:

countdown(4); //it prints the numbers from 4 to 1 in different lines and then Blastoff! OK



//LET US SEE HOW OVERLOADING WORKS : WE CAN HAVE MORE METHODS WITH THE SAME NAME 

double area1=area(12);
double area2=area(24,Math.PI);
System.out.format("\n\nThe value of  the variable area1 is %f . The value of the variable area2 is %f\n",area1,area2);
area("This time the function area won't calculate anything");
//OK



} // the main ends here




// LET'S SEE IF WE CAN DEFINE METHODS AFTER THE MAIN AND CALL THEM IN THE MAIN

public static double  Diff (double a, double b){
return a-b;
} 
// this method simply returns the difference of the arguments




//OVERLOADING: MORE METHODS CAN HAVE THE SAME NAME IF THE NUMBER OF ARGMENTS IS DIFFERENT
// OR IF THEY HAVE THE SAME NUMBER OF ARGUMENTS BUT THE ARGUMENTS ARE OF DIFFERENT TYPE

public static double area(double radius){
return radius*radius*Math.PI; 
}


public static double area(double diameter, double pi){
return Math.pow((diameter/2),2)*pi; 	
}

public static void area(String message){
System.out.println(message); 	
}


//ALL the methods above are called area but they have different arguments OK




}
