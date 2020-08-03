package com.ddw.MySpringJourney;

import com.ddw.MySpringJourney.bean.Ingredient;

/**
 * @Author DongDawei
 * @createTime 2020/7/2823:38
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
