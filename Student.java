public class Student {
    private int id;
    private String name;
    private String email;
    private int marks;

    public Student(String name, String email, int marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getMarks() { return marks; }
}