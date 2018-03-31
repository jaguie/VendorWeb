package com.jaguie.vendorweb.domain.Service;

import com.jaguie.vendorweb.domain.model.Vendor;

import java.util.List;

public interface VendorService {
    Vendor saveVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(Vendor vendor);
    Vendor getVendorById(Long id);
    List<Vendor> getAllLocation();
}
