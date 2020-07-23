package com.ddw.MySpringJourney;

import lombok.Data;

import java.util.List;

/**
 * @Author DongDawei
 * @createTime 2020/7/2314:59
 */

@Data
public class Taco {

    private String name;
    private List<String> ingredients;
}
