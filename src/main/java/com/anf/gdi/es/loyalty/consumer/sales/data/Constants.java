package com.anf.gdi.es.loyalty.consumer.sales.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
    public static final String FAULT_CODE = "ANF-500";
    public static final String CORRELATION_ID_HEADER = "Correlation-ID";
    public static final String COUNT_HEADER = "Count";
    public static final String RECORDS_EFFECTED_HEADER = "Records-Effected";
    public static final String CONTENT_LANGUAGE_HEADER = "Content-Language";
    public static final String CONTENT_LANGUAGE_HEADER_VALUE = "en-US";

    public static final String LOG_ENTRY_START = ":::SALES LOYALTY CONSUMER";
}