package com.ddw.MySpringJourney.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Author DongDawei
 * @createTime 2020/7/2314:07
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUSE
    }
}
