package com.digiburo.three_fragment;

/**
 * legal fragment options
 */
public enum FragmentEnum {
    UNKNOWN("Unknown"),
    FIRST("First"),
    MIDDLE("Middle"),
    END("End");

    private final String name;

    FragmentEnum(String arg) {
        name = arg;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * string to enum conversion
     * @param arg
     * @return
     */
    public static FragmentEnum discoverMatchingEnum(String arg) {
        FragmentEnum result = UNKNOWN;

        if (arg == null) {
            return result;
        }

        for (FragmentEnum token:FragmentEnum.values()) {
            if (token.name.equals(arg)) {
                result = token;
            }
        }

        return result;
    }
}