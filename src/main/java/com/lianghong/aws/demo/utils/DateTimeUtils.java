package com.lianghong.aws.demo.utils;

import org.joda.time.DateTime;

import java.util.Optional;

import static org.joda.time.format.DateTimeFormat.forPattern;

/**
 * @author lianghong
 * @date 2019/9/11
 */

public class DateTimeUtils {
    public static final String DATE_TIME_UTC_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    public static DateTime convertToDateTime(String dateString) {
        return Optional.ofNullable(dateString)
                .map(item -> DateTime.parse(item, forPattern(DATE_TIME_UTC_PATTERN)))
                .orElse(null);
    }

    public static String convertToString(DateTime dateTime) {
        return Optional.ofNullable(dateTime)
                .map(item -> item.toString(DATE_TIME_UTC_PATTERN))
                .orElse(null);
    }
}
