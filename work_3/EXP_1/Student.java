package EXP_1;

public class Student extends User implements Comparable<Student>{

    private Long studentIDI;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public long getStudentIDI() {
        return studentIDI;
    }

    public void setStudentIDI(long studentIDI) {
        this.studentIDI = studentIDI;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentIDI.compareTo(o.studentIDI);
    }
}
