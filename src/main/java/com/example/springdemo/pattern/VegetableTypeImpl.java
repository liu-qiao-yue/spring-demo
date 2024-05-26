package com.example.springdemo.pattern;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class VegetableTypeImpl implements Type{
    @Override
    public boolean support(String key) {
        return "V".equalsIgnoreCase(key);
    }

    @Override
    public BigDecimal calc(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.8));
    }
}
