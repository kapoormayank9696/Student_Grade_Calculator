public class GradeCalculator {

    // Calculate Total Marks
    public int calculateMarks(int[] marks) {
        int sum = 0;
        for(int num : marks) {
            sum = sum+num;
        }
        return sum;
    }

    // Calculate Total Percentage
    public double calculatePercentage(int total, int totalSubjects) {
        return (double)total/totalSubjects;
    }

    // Calculate Grade
    public String calculateGrade(double percentage) {
        if(percentage >= 90) {
            return "A+";
        } else if(percentage >= 80) {
            return "A";
        } else if(percentage >= 70) {
            return "B";
        }else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Check Pass/Fail
    public String getResult(double percentage) {

        if (percentage >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
