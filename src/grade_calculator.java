//Task 2 - Student Grade Calculator

import java.util.Scanner;
public class grade_calculator {
    public static void main(String[] args){
        System.out.println("ENTER YOUR MARKS BELOW(OUT OF 100)");
        Scanner sc = new Scanner(System.in); // scanning the input

        System.out.println("Subject 1");
        float a = sc.nextFloat();
        System.out.println("Subject 2");
        float b = sc.nextFloat();
        System.out.println("Subject 3");
        float c = sc.nextFloat();
        System.out.println("Subject 4");
        float d = sc.nextFloat();
        System.out.println("Subject 5");
        float e = sc.nextFloat();

        float tm = (a + b + c + d + e); //calculating the total marks
        float percentage = ((a + b + c + d + e)/500)*100 ; //calculating the average percentage

        System.out.print("Total Marks: "); // printing total marks
        System.out.println(tm);
        System.out.print("Percentage: "); // printing average percentage
        System.out.println(percentage);
        System.out.print("Grade:"); // printing the grade
        if (percentage >= 90) {
            System.out.println('A');
        } else if (percentage >= 80) {
            System.out.println('B');
        } else if (percentage >= 70) {
            System.out.println('C');
        } else if (percentage >= 60) {
            System.out.println('D');
        }else if (percentage >= 50) {
            System.out.println('E');
        } else {
            System.out.println('F');
        }



    }
}
