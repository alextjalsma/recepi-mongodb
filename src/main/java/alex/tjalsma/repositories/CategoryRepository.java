package alex.tjalsma.repositories;

import alex.tjalsma.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
