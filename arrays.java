
//HERE WE DESCRIBE HOW TO DECLARE, ASSIGN AND MANIPULATE ARRAYS
//LAST MODIFIED 31/03/2015


class arrays{
public static void main (String[] args){

// HOW TO DECLARE ARRAYS

int[] intarray;	
double[]  dbarray;	
char[] chararray;
String[] stringarray;
// In order to declare an array we must use the square brackets after the type.	
// The commands above are needed to declare the arrays but don't create them, in order to do so we write:

 
intarray = new int[4];  //this is an array of four integers.
	
dbarray =	new double[10]; //this is an array of ten doubles.

chararray= new char[5]; // this is an array of 5 chars.

stringarray= new String[3]; // this is an array of 3 strings	



// HOW TO ASSIGN ARRAYS	
	
//LET'S USE A FOR LOOP TO FILL THE ARRAYS WITH SOME VALUES	
		
int i=0;	
	
for(i=0;i<4;i++){
intarray[i]=i+1; //we are filling it with consecutive numbers from 1 to 4	
}	
	
System.out.format("%d\t%d\t%d\t%d  \n", intarray[0],intarray[1],intarray[2],intarray[3]);
// we correctly obtain         1	2	3	4



// How to fill a char array
//Imagine that we have a string and that we want to fill the array of chars with the letters of the string

String greeting="Hello everyone I am a string";
int len=greeting.length();

chararray= new char[len]; // this is an array of a number of chars equal to len (we have changed its length)
int j=0;

for(j=0;j<len;j++){
chararray[j]=greeting.charAt(j);	
System.out.println(chararray[j]);  // OK it prints the single chars correctly.
}
System.out.println("\n\n");



// HOW TO FILL A STRING ARRAY

stringarray[0]="I";
stringarray[1]="am";
stringarray[2]="legend";

// let us print it on a single line:

int a=0;

for(a=0; a<3; a++){
System.out.print(stringarray[a]+" ");
}
System.out.println("\n\n");  // PERFECT



//HOW TO CHANGE ONE OF THE ARRAY'S ELEMENTS
//LET US IMAGINE THAT WE WANT TO CHANGE THE FOURTH ELEMENT OF intarray FROM 4 TO 5 

intarray[3]=5;

System.out.format("%d\t%d\t%d\t%d  \n", intarray[0],intarray[1],intarray[2],intarray[3]);
//ok the last number has been correctly modified, the command above prints correctly 1 2 3 5




//How to change one of the elements of a chars' array 
// Let's imagine that for some reason we want to substitute I with i:
	
chararray[15]='i';    // REMEMBER that differently from strings chars must be assigned with ' ' 
//now we  print it 
j=0;

for(j=0;j<len;j++){
System.out.println(chararray[j]);  
}
System.out.println("\n\n");
//OK our array has been correctly modified.



// How to change one of the elements of an array of strings
// Let's change I am legent into I was legend 
stringarray[1]="was";

// now we print it

int b=0;

for(b=0;b<3;b++){
System.out.println(stringarray[b]+" ");	
}
// OK perfect, it prints I was legend on three different lines as wanted.

	
}	
}