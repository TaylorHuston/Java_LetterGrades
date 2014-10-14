
import java.util.Scanner;

/*
 * Simple program to calculate a letter grade. 
 * Demonstrates Switch statement.
 * From "Java How To Program, 10/e, Early Objects" - Chapter 5.
 */


public class LetterGrades {

    public static void main(String[] args) {
        int total = 0;
        int counter = 0; //Number of grades entered 
        int aCount = 0; //A grades             
        int bCount = 0; //B grades             
        int cCount = 0; //C grades             
        int dCount = 0; //D grades             
        int fCount = 0; //F grades
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n %s%n %s%n",
            "Enter the integer grades in the range 0–100.",
            "Type the end-of-file indicator to terminate input:",
            "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter");
         
        //Loop until user indicates end-of-file
        while (input.hasNextInt()) {
            int grade =  input.nextInt();
            total += grade;
            ++counter;
            
            switch (grade / 10) {
                case 9:  //Grade between 90 and 100
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:  //Grade less than 60
                    ++fCount;
                    break;
            }//End switch  
        }//End while
        
        System.out.printf("%nGrade Report:%n");
        
        if(counter != 0) {
            double average  = (double) total / counter;
        
            System.out.printf("Total of the %d grades entere is %d%n", counter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
               "Number of students who received each grade:",
               "A: ", aCount,   // display number of A grades
               "B: ", bCount,   // display number of B grades
               "C: ", cCount,   // display number of C grades
               "D: ", dCount,   // display number of D grades
               "F: ", fCount); // display number of F grades
         }

    }//End main
        
}//End class LetterGrades
    

