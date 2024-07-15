package EXP_1;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentFlow> {

    @Override
    public int compare(StudentFlow o1, StudentFlow o2) {
        return Integer.compare(o1.getStudentGroupList().size(), o2.getStudentGroupList().size());
    }

}
