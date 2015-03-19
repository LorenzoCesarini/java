
// Program Number 3
// In this program we declare various char and string variables and  print them
// LAST MODIFIED 08/03/2015



class char_and_string {        // INITIALLY I  HAD CALLED THIS PROGRAM char BUT SINCE IT IS A TYPE IDENTIFIER IT IS ILLEGAL TO DO SO 

public static void main(String[] arguments){



//FIRST PART : CHARS

char firstchar;   // this is the way to declare char variables

firstchar='a';    // chars must be assigned using the single '.' quotation marks   


// METHODS TO PRINT A CHAR

System.out.println("This is the content of the char we have declared: "+firstchar); // ok it prints a correctly

//second method : USING %c

System.out.format("The content of the char firstchar is %c and everyone is happy\n" ,firstchar); //OK









// SECOND PART: STRINGS

String name;      // Here we declare a variable called name of String type, the String type starts always
                  //  with a capital letter

name="Aaaaa Bbbbb"; //  A STRING CAN BE DECLARED ONLY WITH THE DOUBLE QUOTATION MARKS "  ".
                     // USING THE SINGLE QUOTATION MARKS '  ' LEADS TO AN ERROR   

//HOW TO PRINT A STRING
					 
System.out.println("The content of the string name is:"+name);					 

//how to print a string with %s

System.out.format("My name is %s, hello everyone\n",name);					 


					 
					 
// HOW TO MEASURE THE LENGTH OF A STRING

int len= name.length();     // the command .length() allows to measure the lenght of the string. 

System.out.println("the lenght of the string name is "+len);


// HOW TO ACCESS THE CHARACTER IN A CERTAIN POSITION 

char LETTER=name.charAt(4);   // the variable LETTER  will store the value: a
                              // the char in the fourth position is actually the fifth letter
                               //the count starts from zero!!!!!!!  							  
System.out.println(LETTER);


char FIRSTLETTER=name.charAt(0);  


System.out.println("The first letter is "+FIRSTLETTER);  // this prints the first letter ,A, which is in the zeroth position


// HOW TO MODIFY THE CHARACTER IN A CERTAIN POSITION
//let us change the fifth letter

//name.charAt(4)='C';
//System.out.println("The modified name now is" +name );        // THESE TWO LINES DON'T WORK IN FACT STRINGS ARE IMMUTABLE IN JAVA, SEE BELOW


//HOW TO ACCESS A SUBSTRING

String firstname=name.substring(0,5);
System.out.println("The name  is "  +firstname); // it prints only Aaaa

String secondname=name.substring(6,11);
System.out.println("The surname  is " +secondname); // it prints only Bbbb





// HOW TO DETERMINE THE POSITION OF A CERTAIN CHAR IN A STRING

String greeting="Hello!";
// we want to determine the position of the letter 'e' in 'Hello!' ,we expect to obtain 1 since the index counter starts from zero  
int position=greeting.indexOf('e');

System.out.println(position); // it prints correctly 1 OK

//what happens if a string contains the same letter multiple times?
//For example there are four a in name, what would happen then?  

int position2=name.indexOf('a');

System.out.println(position2);  //it prints only the index of the first hit
 

//How to search a character in a string starting not from the beginning but from a certain index 

String declaration="Rocky single handedly ended Cold war";  
int newpos=declaration.indexOf('o',6); // It is sufficient to write  the char you are searching and the index from which  the search begins
System.out.println("The index of the first char 'o' found after the sevent letter is "+newpos); // it prints correctly 29 which corresponds to the 30th letter
 
 
// HOW TO DETERMINE THE INDEX AT THE BEGINNING OF A SUBSTRING   

String text="Hello, this is just random junk typed by a monkey";
// we here want to know the index of the first letter of the word random

int pos=text.indexOf("random");  // NOTICE HERE THAT YOU MUST USE DOUBLE QUOTATION MARKS: "...."
 
System.out.println(pos); // it prints 20 OK




//How to search a substring  starting not from the beginning but from a certain index 
 
String message="I must buy two oranges and two apples"; 

int POS1=message.indexOf("two",15);  //we start to search the substring two from the 14th letter 
 
System.out.println("The index of the substring 'two' found after the 14th letter is "+POS1); // it prints correctly 27 which corresponds to the 28th letter





// HOW TO CONVERT A STRING TO UPPERCASE

String newtext=text.toUpperCase();
System.out.println(newtext);  // the entrire string text is printed in uppercase OK 


//is it possible to convert a substring to uppercase? 

String newstring=text.substring(20,26).toUpperCase();  // this shows that multiple features can be accessed using the .
                                                // m has the index 25, we wrote 26 beacuse the last index in the interval is not included
System.out.println(newstring);  //YES it prints RANDOM in uppercase OK


//How to convert a string to lower case

String line="I AM LEGEND";
System.out.println(  line.toLowerCase()   );





// HOW TO ACCESS A SUBSTRING KNOWING ONLY ITS FIRST AND LAST LETTERS (both letters must be the first occurrences of certain chars)

String text2= "Hello, this is just random junk typed by a monkey";
// imagine you have a huge string and want the substring wich begins with the first ocurrence of the letter 'r'
//and ends with the first occurence of the letter 'm'

String specialstring=text2.substring(text2.indexOf('r'),text2.indexOf('m')+1);
System.out.println("This time the string is: "+specialstring); // it prints correctly random
 					 

					 
//HOW TO JOIN MULTIPLE STRINGS
					 
String one="HELLO";
					 
String two= " WORLD!";

String three= one+two;

System.out.println(three); // It prints correctly: HELLO WORLD!

// STRINGS CAN BE SIMPLY JOINED BY ADDING THEM (THE SAME HAPPENS IN PYTHON)




// HOW TO MODIFY THE CHARACTER IN A CERTAIN POSITION USING SUBSTRINGS
//IN JAVA STRINGS CANNOT BE MODIFIED, WE NEED A NEW STRING:					 
String oldname="Arnold Schwarzenegger";					 
String newname=oldname.substring(0,13)+'s'+oldname.substring(14,21); 					 
System.out.println(newname);  //we changed the z into an s					 






					 
}
}







