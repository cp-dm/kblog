package com.kakaobank.enumeration;

import java.util.Arrays;

public enum NaverSort {
    SIM(Sort.ACCURACY), DATE(Sort.RECENCY);

    private final Sort sort;

    NaverSort(Sort sort) {
        this.sort = sort;
    }

    public static String findSort(Sort sort) {
        return Arrays.stream(values())
                .filter(sort::equals)
                .findFirst()
                .orElse(DATE)
                .name();
    }
}
