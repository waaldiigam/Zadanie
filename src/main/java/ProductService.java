package main.java;
import org.springframework.stereotype.Service;
import main.java.ProductDTO;
import main.java.ProductType;

@Service
public class ProductService {

    public ProductDTO getData(Long id) {
        ProductDTO product = new ProductDTO(); //Pobieram dane produktu z bazy danych po id i wypelniam nimi productDTO
        product.setPrice(countPrice(product));
        product.incrementedCounter();
        // Tworze metode ktora aktualizuje zmienna counter w bazie danych.
        return product;
    }

    public float countPrice(ProductDTO product) {
        float price = product.getPrice();
        ProductType sex = product.getType();

        if (sex.equals(ProductType.KID)) {
            return (float) 0.9 * price;
        } else {
            return (float) 0.95 * price;
        }
    }
}
