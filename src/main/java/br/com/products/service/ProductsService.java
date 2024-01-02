package br.com.products.service;

import br.com.products.repository.ProductsRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProductsService {

    @Inject
    ProductsRepository productsRepository;





}
