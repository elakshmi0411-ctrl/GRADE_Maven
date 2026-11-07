package com.example.maven_github_grade;

/**
 * Hello world!
 */




public class grade {

    public static String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 70) {
            return "C";
        }
        else if (marks >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }

    public static void main(String[] args) {

        int marks = 85;

        String result = calculateGrade(marks);

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + result);
    }
}
