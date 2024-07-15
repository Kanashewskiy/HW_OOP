package EXP_1;

import java.util.List;

public class FlowController {

    private FlowService flowService;

    public FlowController(FlowService flowService){
        this.flowService = flowService;
    }

    public void sortedFlow(List<StudentFlow> studentFlowList){
        flowService.sortedFlow(studentFlowList);
    }

}
