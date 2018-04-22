/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testIT;

import glarmester_solution.data.DataAccessorDatabase;
import glarmester_solution.logic.FrameType;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Micha
 */
public class IntegrationTest {
    
    public IntegrationTest() {
    }
    
    DataAccessorDatabase accessor = new DataAccessorDatabase();

    @Test
    public void glassPriceTest() throws Exception {
        double expectedResult = 300;
        double actualResult = accessor.getGlassprice();
        assertThat(actualResult, is(expectedResult));
    }
    
    @Test
    public void framePriceSimpleTest() {
        double expectedResult = 100;
        double actualResult = accessor.getFramePrice(FrameType.Simple);
        assertThat(actualResult, is(expectedResult));
    }
    
    @Test
    public void framePriceOrnateTest() {
        double expectedResult = 200;
        double actualResult = accessor.getFramePrice(FrameType.Ornate);
        assertThat(actualResult, is(expectedResult));
    }
    
    @Test
    public void framePriceLavishTest() {
        double expectedResult = 350;
        double actualResult = accessor.getFramePrice(FrameType.Lavish);
        assertThat(actualResult, is(expectedResult));
    }
}
