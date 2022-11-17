package com.example.investo.controller;

import com.example.investo.model.Company;
import com.example.investo.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController(value = "/api")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(value = "/company")
    public ResponseEntity<List<Company>> getCompanies(){
        return ResponseEntity.ok().body(companyService.getCompanies());
    }
    @PostMapping(value = "/company")
    public ResponseEntity<Company> createCompany(@RequestBody Company company){
        return ResponseEntity.ok().body(companyService.saveCompany(company));
    }
    @GetMapping(value = "/company/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable long id){
        return ResponseEntity.ok().body(companyService.getCompany(id));
    }
    @DeleteMapping(value = "/company/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable long id){
        companyService.deleteCompany(id);
        return ResponseEntity.ok().body("Deleted successfully");
    }
}
