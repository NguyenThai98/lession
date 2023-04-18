package bigo.nguyenthai.algorithm;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thaigogo2<br/>
 * Date: 3/21/2023<br/>
 * Time: 10:29 AM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class FieldMask {
    private String name;
    private String mask;

    public FieldMask(String name, String mask) {
        this.name = name;
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
