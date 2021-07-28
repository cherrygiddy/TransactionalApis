package com.transactional.api.utils;

import java.nio.charset.StandardCharsets;

import org.bson.internal.Base64;

import lombok.extern.slf4j.Slf4j;


/**
 * Contains a set of helper functions.
 */
@Slf4j
public class HelperUtility {

    /**
     * @param value the value to be converted to a base64 string
     * @return returns base64String
     */
    public static String toBase64String(String value) {
        byte[] data = value.getBytes(StandardCharsets.ISO_8859_1);
        return Base64.encode(data);
    }
}
