import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========= Student Grade Calculator =========");

        System.out.print("\nEnter Student Name : ");
        String name = sc.nextLine();

        System.out.print("\nEnter Number of Subjects : ");
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];

        for(int i=0; i<subjects; i++) {
            while(true) {
                System.out.print("Enter Marks of Subject " + (i + 1) + " : ");
                int mark = sc.nextInt();

                if(mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                }else {
                    System.out.println("Invalid Marks! Enter between 0 and 100.");
                }
            }
        }

        Student student = new Student(name,marks);
        GradeCalculator gradeCalculator = new GradeCalculator();
        int total = gradeCalculator.calculateMarks(student.getMarks());
        double percentage = gradeCalculator.calculatePercentage(total,subjects);
        String grade = gradeCalculator.calculateGrade(percentage);
        String result = gradeCalculator.getResult(percentage);

        System.out.println("\n\n========== Result ==========");
        System.out.println("Student Name : "+ student.getName());
        System.out.println("Total Marks  : "+ total);
        System.out.printf("Percentage   :%.2f%%\\n ", percentage);
        System.out.println("\nGrade        : "+ grade);
        System.out.println("Result       : "+ result);

        sc.close();
    }
}

