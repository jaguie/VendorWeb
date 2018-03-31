package com.jaguie.vendorweb.domain.Service;

import com.jaguie.vendorweb.infrastructure.repository.VendorRepository;
import com.jaguie.vendorweb.domain.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public void deleteVendor(Vendor vendor) {
        vendorRepository.delete(vendor);
        return;
    }

    @Override
    public Vendor getVendorById(Long id) {
        return vendorRepository.findById(id).get();
    }

    @Override
    public List<Vendor> getAllLocation() {
        return vendorRepository.findAll();
    }

    public VendorRepository getVendorRepository() {
        return vendorRepository;
    }

    public void setVendorRepository(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }
}
