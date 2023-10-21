package org.example;

import org.assertj.core.api.Assertions;
import org.example.Calculator.*;

import org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //Assertions.assertThat(calculator.calculatingDiscount(1_000,10)).isEqualTo(900);

        Assertions.assertThat(calculator.calculatingDiscount(1_000,10)).isEqualTo(800);

        //Assertions.assertThat(calculator.calculatingDiscount(1_000,-10)).isEqualTo(1100);

        //Assertions.assertThat(calculator.calculatingDiscount(-3_000,10)).isEqualTo(1100);

        Assertions.assertThat(calculator.calculatingDiscount(2_000,110)).isEqualTo(1100);

    }
}