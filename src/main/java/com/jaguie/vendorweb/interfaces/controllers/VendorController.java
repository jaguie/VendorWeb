package com.jaguie.vendorweb.interfaces.controllers;

import com.jaguie.vendorweb.domain.Service.VendorService;
import com.jaguie.vendorweb.domain.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @RequestMapping(value = { "/createVendor" }, method = RequestMethod.GET)
    public String createVendor() {
        return "createVendor";
    }

    @RequestMapping("/saveVendor")
    public String saveCustomer(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap){
        Vendor vendorSaved = vendorService.saveVendor(vendor);
        String msg = "Vendor saved with the id:" + vendorSaved.getId();
        modelMap.addAttribute("msg", msg);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }

    @RequestMapping(value = { "/displayVendors" })
    public String displayVendors(ModelMap modelMap) {
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }

    @RequestMapping(value = "/deleteVendor")
    public String deleteVendor(@RequestParam("id") Long id, ModelMap modelMap){
        Vendor vendor = vendorService.getVendorById(id);
        vendorService.deleteVendor(vendor);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }

    @RequestMapping(value = "/editVendor")
    public String showUpdateVendor(@RequestParam("id") Long id, ModelMap modelMap){
        Vendor vendor = vendorService.getVendorById(id);
        modelMap.addAttribute("vendor", vendor);
        return "editVendor";
    }

    @RequestMapping("/updateVendor")
    public String updateCustomer(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap){
        Vendor vendorSaved = vendorService.saveVendor(vendor);
        String msg = "Vendor updated with the id:" + vendorSaved.getId();
        modelMap.addAttribute("msg", msg);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }

}
