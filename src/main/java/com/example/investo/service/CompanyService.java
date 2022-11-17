package com.example.investo.service;

import com.example.investo.model.Company;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CompanyService {
    public List<Company> getCompanies();
    public Company getCompany(long id);
    public Company saveCompany(Company company);
    public void deleteCompany(long id);
}
