package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Mendapatkan semua produk
     * @return List semua produk
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Mendapatkan produk berdasarkan ID
     * @param id ID produk
     * @return Optional produk
     */
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    /**
     * Menyimpan atau memperbarui produk
     * @param product Produk yang akan disimpan
     * @return Produk yang telah disimpan
     */
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * Menghapus produk berdasarkan ID
     * @param id ID produk yang akan dihapus
     */
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}