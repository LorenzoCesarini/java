
// PROGRAM 6
// WE DESCRIBE HERE BOOLEAN VARIABLES, LOGIC OPERATORS, AND HOW TO IMPLEMENT LOGIC CONDITIONS WITH IF AND ELSE
// LAST MODIFIED 18/03/2015

class boolean_and_logic {

public static void main(String[] args ){


boolean babbage=true;                // these are examples of boolean type variables 
boolean turing=false;
// the boolean variables can assume  the value true or false
// or they can be assigned to logical statements whose truthness value is then considered 									 

boolean statement=3>8; // the valuse of this boolean  variable should be false
System.out.println("The value of the boolean variable statement is : "+statement); //it prints false OK
                                     

									  
//How to perform the logical AND operation with & or $$

boolean third= babbage & turing;
System.out.println(third); //we expect false as a reult and false is exactly what we obtain on screen OK  

boolean fourth= babbage && turing;
System.out.println(fourth); //we expect false as a reult and false is exactly what we obtain on screen OK  

/*
The difference between & and && lies in how much work Java does on the combined
expression. If & is used, the expressions on either side of the & are evaluated
no matter what. If && is used and the left side of the && is false, the expression on
the right side of the && never is evaluated.
*/





// how to perform the OR logical operation with | or ||

boolean fifth= babbage | turing;
System.out.println(fifth); //we expect true as a reult and true is exactly what we obtain on screen OK  

boolean sixth= babbage || turing;
System.out.println(sixth); //we expect true as a reult and true is exactly what we obtain on screen OK  


/*
The difference between | and || lies in how much work Java does on the combined
expression. If | is used, the expressions on either side of the | are evaluated
no matter what. If || is used and the left side of the || is true, the expression on
the right side of the || never is evaluated.
*/


// How to perform the logical NOT operation with !

boolean var =!(babbage);
System.out.println("The  value of the boolean variable var is: "+ var);
boolean var2 =!babbage;
System.out.println("The  value of the boolean variable var2 is: "+ var2);
// To use the NOT operator we can use or not the brackests to deny the value of a variable, the brackets are necessary to deny
// an expression such as !(5>3)

boolean var3=!(3>5);        // 3>5 is false, with the NOT it becomes true  
System.out.println("The  value of the boolean variable var3 is: "+ var3); // it prints true as expected




// how to perform the logical XOR operation with ^

boolean xor1=true^true;
boolean xor2=true^false;
boolean xor3=false^true;
boolean xor4=false^false;

System.out.println("The truth table for the Xor operator is:");
System.out.println("A\tB\t|XOR");
System.out.println("true\ttrue\t|"+xor1);
System.out.println("true\tfalse\t|"+xor2);
System.out.println("false\ttrue\t|"+xor3);
System.out.println("false\tfalse\t|"+xor4);



// how to implement logical conditions with if , else and else if:

int num1=12;
int num2=34;

if (num1>num2)    //REMEMBER: the logical conditions must be written between brackets. After that you don't need curly brackets as in C or the colon as in Python
		System.out.println("hello world!"); 
	    // this line is not printed because num1>num2 is false, it is enough to indent a command to make it depend on the result of the if statement   

System.out.println("Without indentation: hello world!"); //without indentation this line instead is correctly printed,
                                                         // just indented commands belong to the scope of the if statement


														 
//let us see another example

if (num1<num2)    
		System.out.println("hello world!"); 
		System.out.println("hello world! Take 2"); 
//the condition is true, both commands are indented and both are printed
														 
														 
														 
														 
// a better way is using curly brackets

if (num1<num2){    
	System.out.println("hello world! This line is triggered by an if statement!"); 
	// this line is printed correctly because this time the condition is true  
}


//if we use curly brackets can we ignore indentation?

if (num1<num2){    
System.out.println("hello world! This line is triggered by an if statement!"); //yes it prints correctly
}


//obviously we can build complex conditions

if ((3>4)||(26>18)){  // this OR is true, NOTICE THE USE OF THE VARIOUS BRACKETS
System.out.println("This line is triggered by an a complex logical condition !"); // it prints correctly
} 


// how to use if and else if


int lastvalue= 33;

if ((lastvalue>12) && (lastvalue<50 )) 
	System.out.println("First test passed"); //this line is printed
else if ((lastvalue<12) && (lastvalue>45 )) 
	System.out.println("second test passed"); // this line is printed





int supermanstrenght=1200;
int batmanstrenght=800;

if (supermanstrenght>batmanstrenght)
	System.out.println("superman is stronger than batman");
else 
	System.out.println("Batman is stronger than superman"); 




// AN ALTERNATIVE TECHNIQUE TO IF CONDITIONS : THE switch COMMAND

char operation='*';
double object1=23.45;
double object2=11.66;


// let us imagine that we need to check the content of a varible more times in order to decide the execution of a certain command:
if (operation == '+')
	System.out.println(object1+object2);
else if (operation == '-')
	System.out.println(object1-object2);
else if (operation == '*')
	System.out.println(object1*object2);
else if (operation == '/')
	System.out.println(object1/object2);

// a completely equivalent result can be obtain with the switch command:


switch (operation) {
case '+':
	System.out.println(object1+object2);
	break;
case '-':
	System.out.println(object1-object2);
	break;
case '*':
	System.out.println(object1*object2);
	break;
case '/':
	System.out.println(object1/object2);
	break;
default:      //the default is like an else when none of the conditions above is verified
	System.out.println("None of the following operations +, -, *, /  detected");
}

// using the switch command you don't need to write more lines comparing the variable with possible values but
// the variable is written only once and then you list all the values.




// AN ALTERNATIVE TO SITUATIONS WICH REQUIRE if AND else: HOW TO USE THE ? OPERATOR
 

//first case:  printing on screen if a condition is verified or not  
int a=12;
int b=8;
System.out.println(a>b ? "a is bigger than b " : "a is lower than b");

//Inside the println you need to write the logical condition, then the ?, then the text that must be printed if the logical condition is verified, 
//then :  and the last part is the text that must be printed if the logical condition is not verified. 
//In this case since 12>8 it prints "a is bigger than b "



//second case: assigning a certain value to a variable if a condition is verified or not

int result=  a>b? 3:5;
System.out.println("The value of the variable result is "+result);
//the variable result is assigned the value 3 if a>b is true, otherwise it is assigned the value 5 if a>b is false.



/*remeber for both cases: you can also assign the logical condition to a boolean variable and substitue the logical condition with the variable: 

FIRST CASE:
int a=12;
int b=8;
boolean condition=a>b;
System.out.println(condition ? "a is bigger than b " : "a is lower than b");


SECOND CASE:

boolean condition2=a>b;
int result= condition2 ? 3:5;
System.out.println("The value of the variable result is "+result);

*/

}
}