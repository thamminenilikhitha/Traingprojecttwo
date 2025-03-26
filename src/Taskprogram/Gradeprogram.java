package Taskprogram;

import java.util.Scanner;

public class Gradeprogram {

    public static void main(String[] args) {

/*int B=80-89;

        Scanner sc = new Scanner(System.in);
        int score = 85; // Example score
        String grade = (score < 60) ? "F" : ((score < 70) ? "D" : ((score < 80) ? "C" : ((score < 90) ? "B" : "A")));
        System.out.println(grade);*/


        /*
        int grade = 70;
        String result = (grade >= 90 && grade <= 100) ? "A" :
                (grade >= 80 && grade <= 89) ? "B" :
                        (grade >= 70 && grade <= 79) ? "C" :
                                (grade >= 60 && grade <= 69) ? "D" : "F";
        System.out.println("Your Grade is: " + result);*/

        Scanner sc = new Scanner(System.in);

        // Prompt user to enter marks
        System.out.print("Please Enter Your Grade: ");
        int marks = sc.nextInt();
        int Grade=60;
        // Determine grade result using correct logical AND (&&) for ranges
        String gradeResult = (Grade >= 90 && Grade <= 100) ? "Grade A" :
                (Grade >= 80 && Grade < 90) ? "Grade B" :
                        (Grade >= 70 && Grade < 80) ? "Grade C" :
                                (Grade >= 60 && Grade < 70) ? "Grade D" :
                                        "You Failed in Exam";

        // Output results
        System.out.println(gradeResult);
    }

    }








