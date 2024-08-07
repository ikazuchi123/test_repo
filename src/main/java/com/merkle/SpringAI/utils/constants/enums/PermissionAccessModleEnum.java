package com.merkle.SpringAI.utils.constants.enums;

public enum PermissionAccessModleEnum {
    /*ACCESS_ONLY(1, "access_only"),
    ACCESS_WRITE(2, "access_write");*/
    ACCESS_VIEW(1,"access_view"),
    ACCESS_CREATE(2,"access_create"),
    ACCESS_EDIT(3,"access_edit"),
    ACCESS_DELETE(4,"access_delete");

    private final int accessCode;
    private final String accessText;

    private PermissionAccessModleEnum(Integer accessCode, String accessText) {
        this.accessCode = accessCode;
        this.accessText = accessText;
    }

    public int getAccessCode() {
        return accessCode;
    }

    public String getAccessText() {
        return accessText;
    }

    public static boolean contains(int accessCode) {
        boolean containValue = false;
        for (PermissionAccessModleEnum accessModle : values()) {
            if (accessCode == accessModle.accessCode) {
                containValue = true;
            }
        }

        return containValue;
    }
}
