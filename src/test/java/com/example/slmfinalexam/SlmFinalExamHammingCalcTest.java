package com.example.slmfinalexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlmFinalExamHammingCalcTest {
String teststing="12567483020";
SlmFinalExamHammingCalc slmFinalExamHammingCalc=new SlmFinalExamHammingCalc();
    @Test
    void hamcalc() {
    assertEquals(9,slmFinalExamHammingCalc.hamcalc(teststing));
    }

    @Test
    void prevnumber() {
        slmFinalExamHammingCalc.hamcalc(teststing);
        assertEquals(teststing,slmFinalExamHammingCalc.prevnumber());
    }
    @Test
    void testDefault(){
        assertEquals("0",slmFinalExamHammingCalc.prevnumber());
    }
}