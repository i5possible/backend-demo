package com.lianghong.aws.demo.repository.converter;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author lianghong
 * @date 2019/9/15
 */

public class ApplicationIdConverterTest {

    @Test
    public void should_unconvert_dynamoDB_string_to_application_id() {
        String dynamoDBPK = "application-4b2f4445-7ddf-437f-a662-aaace38ee96e";
        ApplicationIdConverter applicationIdConverter = new ApplicationIdConverter();
        String applicationId = applicationIdConverter.unconvert(dynamoDBPK);

        assertThat(applicationId, is("4b2f4445-7ddf-437f-a662-aaace38ee96e"));
    }

    @Test
    public void should_convert_application_id_to_dynamoDB_string() {
        String applicationID = "4b2f4445-7ddf-437f-a662-aaace38ee96e";
        ApplicationIdConverter applicationIdConverter = new ApplicationIdConverter();
        String dynamoDBPK = applicationIdConverter.convert(applicationID);

        assertThat(dynamoDBPK, is("application-4b2f4445-7ddf-437f-a662-aaace38ee96e"));
    }
}