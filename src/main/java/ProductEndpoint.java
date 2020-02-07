package main.java;
import main.java.ProductDTO;
import main.java.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productEndpoint")
public class ProductEndpoint {

    @Autowired
    ProductService productService;

    @GetMapping("product/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable Long id) throws Exception {
        return new ResponseEntity<ProductDTO>(productService.getData(id), HttpStatus.OK);
    }
}
