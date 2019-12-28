package alex.tjalsma.services;

import alex.tjalsma.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
