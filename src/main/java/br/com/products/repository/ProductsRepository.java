package br.com.products.repository;

import br.com.products.model.Products;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductsRepository implements PanacheRepository<Products> {
}
