package com.example.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

/**
 * Kelas ini digunakan untuk menginisialisasi data awal saat aplikasi pertama kali dijalankan
 */
@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Periksa apakah database sudah berisi data
        if (productRepository.count() == 0) {
            // Tambahkan beberapa produk contoh
            productRepository.save(new Product("Cyber Visor", "Kacamata realitas virtual dengan teknologi holografik", 299.99));
            productRepository.save(new Product("Neural Link", "Perangkat koneksi otak-komputer nirkabel", 599.99));
            productRepository.save(new Product("Quantum Processor", "Prosesor kuantum 128-qubit untuk komputasi paralel", 1299.99));
            productRepository.save(new Product("Holo Projector", "Proyektor hologram 3D dengan resolusi tinggi", 499.99));
            productRepository.save(new Product("Nano Drone", "Drone pengawas mikro dengan kemampuan kamuflase", 199.99));
            
            System.out.println("Database telah diinisialisasi dengan data contoh");
        }
    }
}