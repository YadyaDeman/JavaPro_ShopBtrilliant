package app.repository;

import app.controller.ProductController;
import app.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class ProductRepositoryMap  implements ProductRepository {

    private Map<Long, Product> database = new HashMap<>();

    public ProductRepositoryMap(){
        database.put(1L, new Product(1L, "Браслет", 40));
        database.put(2L, new Product(2L, "Цепочка", 65));
        database.put(3L, new Product(3L, "Кулон", 27));
    }

    @Override
    public Product getById(Long id) {
        return database.get(id);
    }
}
