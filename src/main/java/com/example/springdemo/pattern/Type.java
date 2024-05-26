package com.example.springdemo.pattern;

import java.math.BigDecimal;

public interface Type {
    boolean support(String key);

    BigDecimal calc(BigDecimal price);
}
