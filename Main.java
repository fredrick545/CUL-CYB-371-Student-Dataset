
/*
    CUL-CYB 371 - DATA MINING AND DATA WAREHOUSING
    ASSIGNMENT TWO

    Name: Taiwo Fredrick Ayomide
    Matric Number: 24/14100
    Department: Computer Science
    Level: 300 Level

    Project: Fictional Student Dataset Using Java
*/

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Student records
        String[][] students = {
            {"CYB001", "Cyber Security", "100", "85%", "78"},
            {"CYB002", "Computer Science", "200", "90%", "82"},
            {"CYB003", "Software Engineering", "300", "75%", "68"},
            {"CYB004", "Cyber Security", "200", "95%", "88"},
            {"CYB005", "Information Technology", "100", "80%", "72"},
            {"CYB006", "Computer Science", "300", "88%", "91"},
            {"CYB007", "Software Engineering", "200", "70%", "65"},
            {"CYB008", "Cyber Security", "400", "92%", "85"},
            {"CYB009", "Information Technology", "300", "83%", "76"},
            {"CYB010", "Computer Science", "100", "78%", "70"}
        };

        // Display the student information
        System.out.println("STUDENT DATASET");
        System.out.println("-----------------------------");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student ID: " + students[i][0]);
            System.out.println("Department: " + students[i][1]);
            System.out.println("Level: " + students[i][2]);
            System.out.println("Attendance: " + students[i][3]);
            System.out.println("Average Score: " + students[i][4]);
            System.out.println("-----------------------------");
        }

        // Save the records into a CSV file
        try {
            FileWriter file = new FileWriter("student_dataset.csv");

            file.write("Student ID,Department,Level,Attendance Percentage,Average Examination Score\n");

            for (int i = 0; i < students.length; i++) {
                file.write(
                    students[i][0] + "," +
                    students[i][1] + "," +
                    students[i][2] + "," +
                    students[i][3] + "," +
                    students[i][4] + "\n"
                );
            }

            file.close();

            System.out.println("Student dataset created successfully.");
            System.out.println("Total students: " + students.length);

        } catch (IOException e) {
            System.out.println("Unable to create the student dataset.");
        }
    }
}
