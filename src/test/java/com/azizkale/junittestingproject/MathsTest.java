package com.azizkale.junittestingproject;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsTest {

    private Maths maths;

    // This method runs once before any test methods in this class
    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Before all tests");
    }

    // This method runs once after all test methods in this class
    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("After all tests");
    }

    // This method runs before each test method
    @BeforeEach
    public void setUp() {
        maths = new Maths();
        System.out.println("Before each test");
    }

    // This method runs after each test method
    @AfterEach
    public void tearDown() {
        maths = null;
        System.out.println("After each test");
    }

    @Test
    public void additionTest() {
        // GIVEN
        int num1 = 4;
        int num2 = 6;

        // WHEN
        int addition = maths.add(num1, num2);

        // THEN
        assertEquals(10, addition);
        System.out.println("the result is: " + addition);
    }

    @Test
    public void testSubtraction(){
        // GIVEN
        int num1 = 4;
        int num2 = 6;

        // WHEN
        int varSub = maths.sub(num1, num2);

        // THEN
        assertEquals(-2, varSub);
        System.out.println("the result is: " + varSub);
    }
}