package com.salary.salarymanagment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalaryTest
{ private BasicSalaryCal basicSalaryCalculator;
@BeforeEach
void init()
{ basicSalaryCalculator =new BasicSalaryCal();

	}
@Test
void testBasicSalaryWithValidSalary()
{ double basicSalary=4000;
basicSalaryCalculator.setBasicSalary(basicSalary);
double exceptedSocialInsurance=basicSalary * 0.25; //1000
assertEquals(exceptedSocialInsurance,basicSalaryCalculator.getSocialInsurance());

//to test additionalbonus
double expectedAdditionalBonus=basicSalary * 0.1;
assertEquals(expectedAdditionalBonus,basicSalaryCalculator.getAdditionalBonus());

//to test gross
double expectedGross=basicSalary + exceptedSocialInsurance + expectedAdditionalBonus;
assertEquals(expectedGross,basicSalaryCalculator.getGrossSalary());
}

@DisplayName("Test invalid salary")
@Test
void testBasicSalaryWithInValidSalary()    // Negative test case
{
double basicSalary=-100;
assertThrows(IllegalArgumentException.class,() ->{
	basicSalaryCalculator.setBasicSalary(basicSalary);
});

}
}