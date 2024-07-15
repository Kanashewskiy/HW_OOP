package EXP_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentFlow implements  Iterable<StudentGroup>{

    private List<StudentGroup> studentGroupList = new ArrayList<>();

    public void addGroup(StudentGroup sGroup){
        studentGroupList.add(sGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }
}
