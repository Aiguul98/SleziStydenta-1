package SalaryCalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalcTest {

    private SalaryCalc testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new SalaryCalc();
    }

    @AfterEach
    void tearDown() {
        testingClass = null;
    }

    @Test
    void calcSalary() throws Exception {
        testingClass.arrTf[0].setText("228");
        testingClass.arrTf[1].setText("5");
        testingClass.arrTf[2].setText("13");
        testingClass.arrTf[3].setText("37");
        testingClass.calcSalary();
        assertEquals("10270,26", testingClass.arrTf[7].getText());
    }
	@Test
    void calcSalary() throws Exception {
        testingClass.arrTf[0].setText("133");
        testingClass.arrTf[1].setText("7");
        testingClass.arrTf[2].setText("14");
        testingClass.arrTf[3].setText("88");
        testingClass.calcSalary();
        assertEquals("1720,49", testingClass.arrTf[7].getText());
} 
}