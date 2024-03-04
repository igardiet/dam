package array;

import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[6];
        for (int i = 0; i < grades.length; i++)
        {
            System.out.println("Enter the grade of subject " + (i + 1) + ":");
            grades[i] = scanner.nextDouble();
        }

        double gradesSum = 0;
        for (double grade : grades)
        {
            gradesSum += grade;
        }

        double average = gradesSum / grades.length;

        String finalGrade;
        if (average >= 9)
        {
            finalGrade = "Sobresaliente";
        } else if (average > 8.5)
        {
            finalGrade = "Notable";
        } else if (average > 6.5)
        {
            finalGrade = "Bien";
        } else if (average >= 5)
        {
            finalGrade = "Aprobado";
        } else
        {
            finalGrade = "Suspenso";
        }

        System.out.println("Final grade: " + average + " - " + finalGrade);

        scanner.close();
    }
}