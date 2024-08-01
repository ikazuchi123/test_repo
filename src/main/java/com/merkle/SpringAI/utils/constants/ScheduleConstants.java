package com.merkle.GenAI.utils.constants;


public class ScheduleConstants {

    public static final String FEED_PATH_PREFIX = "com.conti.tcp.feed.implementation.";

    public static final String JOB_PATH_PREFIX = "com.conti.tcp.job.implementation.";

    public static final String JOB_ID = "JOB_ID";

    public static final String FEED_ID = "FEED_ID";

    public static final String JOB_NAME = "JOB_NAME_";

    public static final String FEED_NAME = "FEED_NAME_";

    public static final String TRIGGER_NAME = "TRIGGER_NAME_";

    public enum Status {

        NORMAL("1"),

        PAUSE("0");

        private final String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    public enum Type {

        JOB("JOB"),

        FEED("FEED");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
