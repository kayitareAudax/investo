package com.example.investo.service;

import com.example.investo.model.Company;
import com.example.investo.repository.CompanyRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Slf4j
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepo companyRepo;
    public CompanyServiceImpl(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    @Override
    public List<Company> getCompanies() {
        return companyRepo.findAll();
    }

    @Override
    public Company getCompany(long id) {
        Company company=companyRepo.findById(id).get();
        return company;
    }

    @Override
    public Company saveCompany(Company company) {
        log.info("saving company");
        return companyRepo.save(company);
    }

    @Override
    public void deleteCompany(long id) {
       Company company=companyRepo.findById(id).get();
       companyRepo.delete(company);
    }
}
