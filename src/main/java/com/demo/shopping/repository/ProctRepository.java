package com.demo.shopping.repository;

import com.demo.shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProctRepository extends JpaRepository<Product,Long> {
}
