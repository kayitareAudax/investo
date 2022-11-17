package com.example.investo.service;

import com.example.investo.model.Company;
import com.example.investo.repository.CompanyRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CompanyServiceImplTest {
    @Mock
    private CompanyRepo companyRepoMock;
    @InjectMocks
    private CompanyServiceImpl companyService;
    @Test
    public void getAll(){
        when(companyRepoMock.findAll()).thenReturn(Arrays.asList(new Company("Bookinga",3000,50,15000),
                new Company("TURA",2000,40,200000),new Company("MINE",1000,30,400000)));
        assertEquals(companyService.getCompanies().size(),3);
    }
}
