package com.merkle.SpringAI.utils.constants.enums;

public enum ProgramRuleDataType {

    PROGRESS_STRING("string", "data type is string"),
    PROGRESS_NUMBER("number", "data type is number");

    private final String type;
    private final String desc;

    ProgramRuleDataType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static boolean contains(String type) {
        boolean containValue = false;
        for (ProgramRuleDataType programRuleDataType : values()) {
            if (type.equals(programRuleDataType.type)) {
                containValue = true;
            }
        }
        return containValue;
    }
}
