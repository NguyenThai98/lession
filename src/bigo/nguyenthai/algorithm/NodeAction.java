package bigo.nguyenthai.algorithm;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thaigogo2<br/>
 * Date: 3/21/2023<br/>
 * Time: 3:22 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class NodeAction {
    private Action action;
    private NodeAction nextAction;
    boolean isSuccess = true;
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public NodeAction(Action action) {
        this.action = action;
    }
    public boolean exec(){
        if(action.getCode() > 2){
            isSuccess = false;
        }
        System.out.println(action.getName());
        return isSuccess;
    }

    public static void main(String[] name) {
        System.out.println(name);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public NodeAction getNextAction() {
        return nextAction;
    }

    public void setNextAction(NodeAction nextAction) {
        this.nextAction = nextAction;
    }
}
