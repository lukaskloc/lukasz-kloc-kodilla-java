package com.kodilla.stream.array;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        double expectedResult = 210.0 / 20;
        Assert.assertEquals(expectedResult, average, 0);
    }
}
