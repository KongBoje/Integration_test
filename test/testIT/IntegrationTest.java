/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testIT;

import glarmester_solution.data.DataAccessorDatabase;
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
    
    DataAccessorDatabase DAD = new DataAccessorDatabase();

    @Test
    public void glassPriceTest() throws Exception {
        double expectedResult = DAD.getGlassprice();
        assertThat(expectedResult, is(300.0));
        
    }
}
