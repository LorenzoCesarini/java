
// PROGRAM NUMBER 1
// THIS PROGRAM PRINTS SOME LINES ON SCREEN  
// LAST MODIFIED 15/03/2015

// TO COMPILE TYPE "javac print.java"
// AFTER THAT TO RUN TYPE "java print"  OR  "java -cp.  print "


class print {
    public static void main(String[] args) {     
	         System.out.println("Hello World!"); //Displays the string.
   

            System.out.println("Programmers' favourite outputs :\nHello, world!\nHello world 2, the revenge."); 
            //    \n can be used to print multiple lines on screen as in C or Python

			
			
			//How to display the output from multiple print statements all on one line using  .print instead of .println
            System.out.print("Hello ");
			System.out.print("World!");
			System.out.print(" All ");                    // remember to leave blank spaces between the outputs!!
			System.out.print("these ");
			System.out.print("words ");
			System.out.print("will ");
			System.out.print("be ");
			System.out.print("printed ");
			System.out.print("on ");
			System.out.print("the ");
			System.out.print("same ");
			System.out.print("line ");
			System.out.print("on ");
			System.out.print("screen.\n"); //If you use .print it is obligatory to use \n at the end to go to a new line 
			
			
   }
}

/* COMMENTS CAN BE WRITTEN USING SLASH STAR (IN THIS CASE THE COMMENT MUST ALSO BE CLOSED WITH STAR SLASH) 
 OR DOUBLE SLASH AS ABOVE, INSTEAD THE CHARACTER # CANNOT BE USED.
 THE DOUBLE SLASH COMMENTS OUT ONLY  A LINE
*/

// THE LINES " class <Name> { "   AND THE ASSOCIATED "}" AT THE END OF THE PROGRAM  ARE  OBLIGATORY.
// WE WILL RETURN ON THE MEANING OF THIS FIRST LINE ON A LATER PROGRAM ABOUT CLASSES


// THIS  PROGRAM HAS BEEN CALLED  "print.java"  AND  IN THE FIRST LINE WE  WROTE "print" AFTER "class",
// THIS IS DEMANDED BY MATTER OF SIMPLICITY :  IF WE HAD CALLED THE PROGRAM  "print.java"  AND  HAD  WRITTEN AS THE FIRST LINE 
// "class HelloWorld {"
// AFTER COMPILING  WITH "javac print.java"  WE WOULD HAVE OBTAINED THE EXECUTABLE "HelloWold.class" IN THE SAME FOLDER.
// CONSEQUENTLY  IN ORDER TO RUN IT WE WOULD HAVE HAD TO USE THE COMMAND "java HelloWold".
// THE NAME WRITTEN AFTER "class" THEN MUST BE INTENDED AS THE NAME OF THE EXECUTABLE GENERATED BY THE COMPILER AND 
// IT IS ALWAYS SIMPLER TO KEEP THE SAME NAME FOR THE .java PROGRAM  AND THE .class EXECUTABLE.
// IN SOME CASES THE USER  IS NOTIFIED OF  AN ERROR IF THIS  CONDITION IS NOT VERIFIED, 
// (This happens when we write "public" before "class")


// THE MAIN METHOD PLAYS AN ANALOGOUS ROLE OF THE MAIN FUNCTION IN THE C lANGUAGE, BY METHOD IS MEANT AN ACTION, 
// (WE WILL RETURN LATER ON THE CONCEPT OF METHOD),
// THE MAIN IS THE STARTING POINT OF ANY PROGRAM  AND EVERY COMMAND MUST BE WRITTEN WITHIN ITS SCOPE (WHAT ABOUT FUNCTIONS?).
// THE METHOD MODIFIERS "public static "  ARE INTERCHANGEABLE BUT THIS IS THE COMMONLY USED ORDER.
// public MEANS THAT THE MAIN METHOD CAN BE ACCESSED EVEN FROM OUTSIDE THE CLASS IN WHICH IT HAS BEEN DEFINED,
// WE WILL EXPLAIN THIS FEATURE BETTER IN PROGRAMS WITH MULTIPLE CLASSES
// static  MEANS THAT A METHOD IS THE SAME FOR EVERY INSTANCE OF THE CLASS, STATIC METHODS CANNOT INTERACT 
// WITH THE VARIABLES OF AN INSTANCE BUT ONLY WITH THOSE OF A CLASS. THIS WILL BE CLEARER WHEN WE WILL DISCUSS CLASSES. 
// THE  method modifier "void" IS THE SAME IN C, IT SIMPLY MEANS THAT THE MAIN FUNCTION HAS NO RETURNS. 
// IF  THE THREE method modifiers "public static void" ARE OMITTED the PROGRAM DOESN'T COMPILE.
// IF ONLY THE VOID modifier IS KEPT, "void main... " , THE PROGRAM COMPILES BUT DURING EXECUTION IT WARNS ABOUT THE FACT
// THAT "the principal method has not been found in the class print".
// THE THREE modifiers "public static void" ARE OBLIGATORY.
// THE MAIN'S ARGUMENTS, "String[] args"  , CANNOT BE OMITTED, IF THEY ARE OMITTED THE PROGRAM CAN BE COMPILED BUT IT CANNOT BE EXECUTED,
// THE USER IS REMINDED THAT  "the principal method has not been found in the class print".


// In place of the main's argument  "args"  it is possible to write also "arguments" ,"argv" or anything we want. These are exactly the
// equivalent of the arguments (that can be passed from the command line) in a C program. 


// THE SEMICOLON AND CURLY BRACKETS ARE OBLIGATORY


// THERE ARE MULTIPLE PRINT COMMANDS: 
// System.out.println(" "); 
// System.out.print(" ");
// WE WILL SEE OTHER TWO PRINT COMMANDS, THE ONES USED TO PRINT VARIABLES USING THE % CONVERTER, IN THE NEXT PROGRAMS.
// THE TEXT TO BE SENT ON SCREEN MUST BE WRITTEN WITHIN THE QUOTATION MARKS. 
// IN PLACE OF " ... "  THE QUOTATION MARKS ' ...  '  CANNOT BE USED, OTHERWISE THE USER IS NOTIFIED OF AN ERROR 
















  