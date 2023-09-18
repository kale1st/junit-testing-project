package com.azizkale.junittestingproject.customassert;

import com.azizkale.junittestingproject.Employee;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static com.azizkale.junittestingproject.customassert.EmployeeAssert.assertEmployee;

public class EmployeeTest {

    @Test
    public void testEmployee(){
        Employee employeeToTest = new Employee();
        employeeToTest.setName("Aziz Kale");
        employeeToTest.setGender("Male");
        employeeToTest.setAge(35);
        ArrayList<String> duties = new ArrayList<>(Arrays.asList("Testing", "Development"));
        employeeToTest.setDuties(duties);

        assertEmployee(employeeToTest)
                .hasName(employeeToTest.getName())
                .isAdult()
                .hasDuty("Testing");


    }
}

