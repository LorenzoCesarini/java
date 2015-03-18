
// Program 7 
// HERE WE SHOW FOR LOOPS, WHILE LOOPS AND DO WHILE LOOPS
// Last modified 18/03/2015



class loops{

public static void main(String[] args){

// FOR LOOPS 
// let us calculate the factorial of 15

int number=15;
long fact=1;     //if you don't declare this variable as a long but as an int the program will exceed the range of integers
                 // and print on screen a wrong result without notifying any problem to the user 

int i;    //remember to declare the index of the for!!!

for(i=1; i<number+1;i++){   // remember to always add 1 to the upper limit (ex: number+1) otherwise you forget the last iteration 
fact*=i;
System.out.println(fact);
}
System.out.format("The factorial of %d is %d.\n",number,fact);
//this code is identical to C 





//WHILE LOOPS

int a=3;

while (a%13!=0){           //the logical condition must be written between round brackets, the commands below are iterated until the condition is false
a++;	
System.out.format("The value of the variable a is %d\n",a);
}

//These lines of code increase the variable a until its value is a multiple of 13. 





//DO WHILE LOOPS

int b=3;

do{
b++;	
System.out.format("The value of the variable b is %d\n",b);
}while (b%13!=0);       //  this line REQUIRES the semicolon!!!!

//These lines of code increase the variable b until its value is a multiple of 13. 



//REMARK: the difference between while and do...while is that using while at every iteration the logical condition is checked first 
//and then the commands are executed.
//For do..while this series of actions is carried on exactly in the opposite order, therefore the statements within the do...while 
//block are always executed at least once.





}
}
