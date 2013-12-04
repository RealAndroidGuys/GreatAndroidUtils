package com.realandroidguys.greatandroidutils.common;

/**
 * Util methods to effectively work with strings
 */
public class StringUtil {

    private StringUtil() {}

    /**
     * Checks is string null or its length == 0, very useful
     *
     * @param string
     *          object to check, can be null :D
     * @return {@code true} if string is null or its length == 0, {@code false} otherwise
     */
    public static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }

    /**
     * Awesome way to get only digits from your string
     *
     * @param stringWithDigits
     *          string you want to get digits from, can be null or empty or even without digits
     * @return String with only digits from stringWithDigits or empty string "" if stringWithDigits was null or did not contain any digits.
     *          Example: stringWithDigits = "afb1et2fnvf3fs4", result = "1234"
     */
    public static String getOnlyDigitsFromString(String stringWithDigits) {
        return isNullOrEmpty(stringWithDigits) ? "" : stringWithDigits.replaceAll("\\D", "");
    }
}
