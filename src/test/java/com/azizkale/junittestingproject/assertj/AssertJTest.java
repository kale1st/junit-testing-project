package com.azizkale.junittestingproject.assertj;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    public void testString(){
        String city1 = "Berlin";

        assertThat(city1)
                .isEqualTo("Berlin")
                .startsWith("Ber")
                .endsWith("lin")
                .isNotEmpty()
                .isNotNull()
                .doesNotContain("k")
                .containsOnlyOnce("Be");
    }

    List<String> citiesInGerman =  new ArrayList<>(Arrays.asList("Berlin","Frankfurt","Muenchen"));
    @Test
    public void testList() throws Exception{
        assertThat(citiesInGerman)
                .contains("Berlin")
                .doesNotContain("New York")
                .containsExactly("Berlin","Frankfurt","Muenchen")
                .doesNotHaveDuplicates();
    }

    private Condition<? super String> noCitiesInList(List<String> otherList) {
        return new Condition<String>(){
            @Override
            public boolean matches(String value) {
                return citiesInGerman.contains(value);
            }
        };
    }

    @Test
    public void testNoCitiesInList() {
        List<String> cityList2 = Arrays.asList("Paris", "London", "Amsterdam");
        assertThat(citiesInGerman).have(noCitiesInList(cityList2));
    }
}
