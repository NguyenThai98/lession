package bigo.nguyenthai.algorithm;

/**
 * Date: 3/27/2023<br/>
 * Time: 5:54 PM<br/>
 */
public enum FlagStatusValid {
    ACTIVE(0L,"Active"),
    INACTIVE(1L,"Inactive");
    private Long id;
    private String code;

    FlagStatusValid(Long id, String code) {
        this.id = id;
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public Long getId() {
        return id;
    }

    public static final boolean isExistsCode(String code) {
        for(FlagStatusValid e : FlagStatusValid.values()) {
            if(e.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }
    public static final String getFlagStatusCode(String code) {
        for(FlagStatusValid e : FlagStatusValid.values()) {
            if(e.getCode().equalsIgnoreCase(code)) {
                return e.getCode();
            }
        }
        return null;
    }
}
