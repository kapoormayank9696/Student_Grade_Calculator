public class Student {
    private String name;
    private int[] marks;

    // Parameterized Constructor
    public Student(String name,int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Marks
    public int[] getMarks() {
        return marks;
    }
}
