package com.jaguie.vendorweb.infrastructure.repository;

import com.jaguie.vendorweb.domain.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
