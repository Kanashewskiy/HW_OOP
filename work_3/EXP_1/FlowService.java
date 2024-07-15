package EXP_1;

import java.util.Collections;
import java.util.List;

public class FlowService {

    public void sortedFlow(List<StudentFlow> studentFlowList){
        Collections.sort(studentFlowList, new StreamComparator());
    }
}
