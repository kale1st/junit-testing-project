package com.azizkale.springtesttutorial.MathsTest;

import com.azizkale.springtesttutorial.TestExample.Square;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareAreaCalculatingTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 }) // Different side lengths
    public void testCalculateSquareArea(int sideLength) {
        Square square = new Square();
        int expectedArea = sideLength * sideLength;
        int calculatedArea = square.calculateArea(sideLength);
        assertEquals(expectedArea, calculatedArea);
    }
}
