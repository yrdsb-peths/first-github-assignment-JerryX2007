/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and grade.
 */
public class student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    public student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
