package com.thiscounts.discount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepositoryJpa extends JpaRepository<Discount, Long> {

}
