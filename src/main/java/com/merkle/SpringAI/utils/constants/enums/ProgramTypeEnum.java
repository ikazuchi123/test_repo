package com.merkle.SpringAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.List;

public enum ProgramTypeEnum {
    PROGRAM_TYPE_EW("EW","TCP Program"),
    PROGRAM_TYPE_NW("NW","Normal Warranty"),
    PROGRAM_TYPE_THITTY("30D","30 days"),
    PROGRAM_TYPE_SIXTY("60D","60 days"),
    PROGRAM_TYPE_NINETY("90D", "90 days");

    private final String type;
    @SuppressWarnings("unused")
    private final String desc;

    ProgramTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static List<String> getAllTypes(){
        List<String> list = new ArrayList<>();
        for(ProgramTypeEnum programType: values()){
            list.add(programType.type);
        }
        return list;
    }

    public static String getDefultNWType() {
        return PROGRAM_TYPE_NW.type;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
