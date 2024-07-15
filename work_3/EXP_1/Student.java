package EXP_1;

public class Student implements Comparable<Student>{

    private Long studentIDI;
    private String firstName;
    private String lastName;
    private String middleName;

    public long getStudentIDI() {
        return studentIDI;
    }

    public void setStudentIDI(long studentIDI) {
        this.studentIDI = studentIDI;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentIDI.compareTo(o.studentIDI);
    }
}
