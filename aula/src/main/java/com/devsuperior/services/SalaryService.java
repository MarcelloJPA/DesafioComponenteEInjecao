package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    TaxService taxService;
    @Autowired
    PensionService pensionService;


    public double netSalary(Employer employer){
        return employer.getGrossSalary() - taxService.tax(employer.getGrossSalary()) - pensionService.discount(employer.getGrossSalary());
    }
}
