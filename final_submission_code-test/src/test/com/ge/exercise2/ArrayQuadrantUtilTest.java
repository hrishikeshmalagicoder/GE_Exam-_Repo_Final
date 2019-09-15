package com.ge.exercise2;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ArrayQuadrantUtilTest {

    @Test
    public void getQuadrantValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Assume.assumeNotNull(util.getQuadrantValues(0, 0));

        char[] expectedResult = {'a', 'b', 'e', 'f'};
        assertArrayEquals(expectedResult, util.getQuadrantValues(0, 0));
    }
    
    
    @Test
    public void getRowValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
      

        char[] expectedResult = {'a', 'b', 'c', 'd'};
        assertArrayEquals(expectedResult, util.getRowValues(0));
    }
    
    
    @Test
    public void getRowValuesTestFloat() {
        float[][] data = {
        		{1,2,3},
        		{4,5,6},
        		{7,8,9}
               
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
      

        float[] expectedResult = {1,2,3};
        assertNotNull(util.getRowValuesFloatDataType(0));
      
      
    }
    
    @Test
    public void getColumnValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
       

        char[] expectedResult = {'a', 'e', 'i', 'm'};
        assertArrayEquals(expectedResult, util.getColumnValues(0));
    }
    
    
    @Test
    public void getPartitionValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
       

        char[][] expectedResult = {
        		{'a', 'b', 'c'},
        		{'e', 'f', 'g'},
        		{'i', 'j', 'k'}
        };
        assertArrayEquals(expectedResult,util.getArbitraryPartitionValues(0, 0, 3));
    }
    
}