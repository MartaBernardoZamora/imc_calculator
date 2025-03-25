package dev.martabernardo.models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class PersonTest {
    @Test
    @DisplayName("Test getWeight method")
    void testGetWeight() {
        String weight = "70.5";
        Person person = new Person(weight, "1.70");

        assertThat(person.getWeight(), is(70.5));
    }
    @Test
    @DisplayName("Test getWeight method with ,")
    void testGetWeightWithComma() {
        String weight = "70,5";
        Person person = new Person(weight, "1.70");

        assertThat(person.getWeight(), is(70.5));
    }
    @Test
    @DisplayName("Test getHeight method")
    void testGetHeight() {
        String weight = "70.5";
        String height = "1.70";
        Person person = new Person(weight, height);

        assertThat(person.getHeight(), is(1.70));
    }
    @Test
    @DisplayName("Test calculateImc method")
    void testCalculateImc() {
        String weight = "70.5";
        String height = "1.70";
        Person person = new Person(weight, height);

        assertThat(person.calculateImc(), is(24.39));
    }
    @Test
    @DisplayName("Test getCategoryByImc method")
    void testGetCategoryByImc() {
        Double imc= 19.00;

        Person person = Mockito.mock(Person.class);
        
        when(person.calculateImc()).thenReturn(imc);
        when(person.getCategoryByImc()).thenCallRealMethod();

        assertThat(person.getCategoryByImc(), is("peso normal"));
    }
    @Test
    @DisplayName("Test getCategoryByImc method with sobrepeso")
    void testGetCategoryByImcWithImcSobrepeso() {
        Double imc= 29.00;

        Person person = Mockito.mock(Person.class);
        
        when(person.calculateImc()).thenReturn(imc);
        when(person.getCategoryByImc()).thenCallRealMethod();

        assertThat(person.getCategoryByImc(), is("sobrepeso"));
    }
    @Test
    @DisplayName("Test getCategoryByImc method with obesidad leve")
    void testGetCategoryByImcWithObesidadLeve() {
        Double imc = 34.00;
        Person person = Mockito.mock(Person.class);
        
        when(person.calculateImc()).thenReturn(imc);
        when(person.getCategoryByImc()).thenCallRealMethod();

        assertThat(person.getCategoryByImc(), is("obesidad leve"));
    }
    @Test
    @DisplayName("Test getCategoryByImc method with obesidad moderada")
    void testGetCategoryByImcWithObesidadModerada() {
        Double imc = 39.00;
        Person person = Mockito.mock(Person.class);
        
        when(person.calculateImc()).thenReturn(imc);
        when(person.getCategoryByImc()).thenCallRealMethod();    

        assertThat(person.getCategoryByImc(), is("obesidad moderada"));    
    }
}
