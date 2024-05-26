package com.example.springdemo.pattern;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FruitTypeImpl implements Type{
    @Override
    public boolean support(String key) {
        return "F".equalsIgnoreCase(key);
    }

    @Override
    public BigDecimal calc(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.9));
    }
}
