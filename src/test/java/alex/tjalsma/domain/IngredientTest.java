package alex.tjalsma.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Runs with JUnit5
class IngredientTest {

    Ingredient ingredient;

    @BeforeEach
    void setup(){
        ingredient = new Ingredient();
    }

    @Test
    void getId() {
        long idValue = 4L;

        ingredient.setId(idValue);

        assertEquals(idValue, ingredient.getId());
    }
}