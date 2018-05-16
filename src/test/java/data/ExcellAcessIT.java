/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduardo.lana
 */
public class ExcellAcessIT {
    
    public ExcellAcessIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of data method, of class ExcellAcess.
     */
    @Test
    public void testData() {
        System.out.println("data");
        String filepath = "E:\\GCP\\src\\main\\java\\data\\users.xlsx";
        String sheetName = "Comercial";
        List<HashMap<String, String>> expResult = null;
        List<HashMap<String, String>> result = ExcellAcess.data(filepath, sheetName);
        assertEquals(expResult, result);
 
    }
    
}
