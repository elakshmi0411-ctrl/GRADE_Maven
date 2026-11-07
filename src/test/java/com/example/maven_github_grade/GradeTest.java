
package com.example.maven_github_grade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    public void testGradeA() {
        assertEquals("A", grade.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", grade.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", grade.calculateGrade(75));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", grade.calculateGrade(65));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", grade.calculateGrade(45));
    }

    @Test
    public void testBoundaryValues() {
        assertEquals("A", grade.calculateGrade(90));
        assertEquals("B", grade.calculateGrade(80));
        assertEquals("C", grade.calculateGrade(70));
        assertEquals("D", grade.calculateGrade(60));
        assertEquals("F", grade.calculateGrade(59));
    }
}
