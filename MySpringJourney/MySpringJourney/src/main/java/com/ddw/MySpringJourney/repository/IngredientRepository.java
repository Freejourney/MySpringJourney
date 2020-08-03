package com.ddw.MySpringJourney.repository;

import com.ddw.MySpringJourney.bean.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
