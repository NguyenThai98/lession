package bigo.nguyenthai.algorithm;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thaigogo2<br/>
 * Date: 3/21/2023<br/>
 * Time: 3:20 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class Action {
    private String name;
    private int code;

    public Action(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static void main(String[] args) {
        NodeAction nodeAction1 = new NodeAction(new Action("eat",1));
        NodeAction nodeAction2 = new NodeAction(new Action("sleep",2));
        nodeAction1.setNextAction(nodeAction2);
        NodeAction nodeAction3 = new NodeAction(new Action("rest",3));
        nodeAction2.setNextAction(nodeAction3);

        while(nodeAction1 != null){
            nodeAction1.exec();
            if(!nodeAction1.isSuccess()){
                System.out.println(nodeAction1.getAction().name + " is fail");
                break;
            }else{
                nodeAction1 = nodeAction1.getNextAction();
            }

        }
    }
}
