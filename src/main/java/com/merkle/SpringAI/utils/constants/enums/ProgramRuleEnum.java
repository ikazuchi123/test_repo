package com.merkle.SpringAI.utils.constants.enums;

public enum ProgramRuleEnum {

    PROGRESS_RULE_AND("and", "progress rule and"),
    PROGRESS_RULE_OR("or", "progress rule or"),
    PROGRESS_RULE_LARGE(">","larger"),
    PROGRESS_RULE_SMALLER("<","smaller"),
    PROGRESS_RULE_EQUALS("==","equals"),
    PROGRESS_RULE_LAGEROREQUALS(">=","large or equals"),
    PROGRESS_RULE_SMALLEROREQUALS("<=","smaller or equals"),
    PROGRESS_RULE_NOTEQUALS("!=","not equals");

    private final String rule;
    private final String desc;

    ProgramRuleEnum(String rule, String desc) {
        this.rule = rule;
        this.desc = desc;
    }

    public String getRule() {
        return rule;
    }

    public String getDesc() {
        return desc;
    }

    public static boolean contains(String rule) {
        boolean containValue = false;
        for (ProgramRuleEnum programRuleEnum : values()) {
            if (rule.equals(programRuleEnum.rule)) {
                containValue = true;
            }
        }

        return containValue;
    }

}
