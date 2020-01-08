package alex.tjalsma.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Runs with JUnit4 and go
public class CategoryTest {

    Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() {
        long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());

    }
}