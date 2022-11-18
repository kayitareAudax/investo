package com.example.investo.repository;

import com.example.investo.model.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CompanyRepoTest {
@Autowired
    private CompanyRepo companyRepo;
@Test
    public void find_all_success(){
    List<Company> companies=companyRepo.findAll();
    assertEquals(companies.size(),6);
}
@Test
    public void find_one_success(){
    Optional<Company> company=companyRepo.findById(Long.valueOf(11));
    assertTrue(company.isPresent());
}
}
