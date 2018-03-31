package com.jaguie.vendorweb.interfaces.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VendorController {

    @RequestMapping(value = { "/createVendor" }, method = RequestMethod.GET)
    public String createVendor() {
        return "createVendor";
    }

}
