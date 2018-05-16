/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import core.BaseTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author eduardo.lana
 */
public class AbrangComercialIT extends BaseTest{
    
    public AbrangComercialIT() {
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
    AbrangComercial instance = new AbrangComercial();
    @Test
    public void testAprovarRascunhoAbrang() {
        System.out.println("Aprovar Rascunho Abrangencia Comercial");
        instance.AprovarRascunhoAbrang();
   
    }

    @Test
    public void testCancelarAbrang() {
        System.out.println("Cancelar Abrangencia Comercial");
        instance.CancelarAbrang();
    }

    @Test
    public void testSalvarAbrang() throws Exception {
        System.out.println("Salvar Abrangencia Comercial");
        instance.SalvarAbrang();
    }

    @Test
    public void testExcluiRascunhoAbrang() {
        System.out.println("Exclui Rascunho Abrangencia comercial");
        instance.ExcluiRascunhoAbrang();
    }

 
}
