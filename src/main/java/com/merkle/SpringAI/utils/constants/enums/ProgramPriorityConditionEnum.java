package com.merkle.GenAI.utils.constants.enums;

public enum ProgramPriorityConditionEnum {

    PROGRAM_REGISTER_SUCCED("programRegisterSucced","Display highest priority program after register success"),
    PROGRAM_REGISTER_LIST("programRegisterList","Display highest priority program on register success"),
    PROGRAM_CASE_VALIDATE("programCaseValidate","Display highest priority program when validate case");

    private String type;
    private String desc;

    ProgramPriorityConditionEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static boolean contains(String type) {
        boolean containValue = false;
        for (ProgramPriorityConditionEnum programPriorityConditionEnum : values()) {
            if (type.equals(programPriorityConditionEnum.type)) {
                containValue = true;
            }
        }
        return containValue;
    }

}
