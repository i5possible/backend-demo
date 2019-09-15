package com.lianghong.aws.demo.repository.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import org.joda.time.DateTime;

import static com.lianghong.aws.demo.utils.DateTimeUtils.convertToDateTime;
import static com.lianghong.aws.demo.utils.DateTimeUtils.convertToString;

/**
 * @author lianghong
 * @date 2019/9/11
 *
 * Convert DateTime to String when save to DynamoDB
 * Need @DynamoDBTypeConverted(converter = DateTimeConverter.class)
 */

public class DateTimeConverter implements DynamoDBTypeConverter<String, DateTime> {

    @Override
    public String convert(DateTime dateTime) {
        return convertToString(dateTime);
    }

    @Override
    public DateTime unconvert(String dateString) {
        return convertToDateTime(dateString);
    }
}
