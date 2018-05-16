/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

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
public class AbrangenciaLogisticaIT {
    
    public AbrangenciaLogisticaIT() {
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
     * Test of InserirAbrangLog method, of class AbrangenciaLogistica.
     */
    @Test
    public void testInserirAbrangLog() {
        System.out.println("InserirAbrangLog");
        AbrangenciaLogistica instance = new AbrangenciaLogistica();
        instance.InserirAbrangLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AprovarRascunhoAbrangLog method, of class AbrangenciaLogistica.
     */
    @Test
    public void testAprovarRascunhoAbrangLog() {
        System.out.println("AprovarRascunhoAbrangLog");
        AbrangenciaLogistica instance = new AbrangenciaLogistica();
        instance.AprovarRascunhoAbrangLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CancelarAbrangLog method, of class AbrangenciaLogistica.
     */
    @Test
    public void testCancelarAbrangLog() {
        System.out.println("CancelarAbrangLog");
        AbrangenciaLogistica instance = new AbrangenciaLogistica();
        instance.CancelarAbrangLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarAbrangLog method, of class AbrangenciaLogistica.
     */
    @Test
    public void testSalvarAbrangLog() {
        System.out.println("SalvarAbrangLog");
        AbrangenciaLogistica instance = new AbrangenciaLogistica();
        instance.SalvarAbrangLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluiRascunhoLog method, of class AbrangenciaLogistica.
     */
    @Test
    public void testExcluiRascunhoLog() {
        System.out.println("ExcluiRascunhoLog");
        AbrangenciaLogistica instance = new AbrangenciaLogistica();
        instance.ExcluiRascunhoLog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Acao method, of class AbrangenciaLogistica.
     */
    @Test
    public void testAcao() {
        System.out.println("Acao");
        String status = "";
        String codvenda = "";
        String botao = "";
        String Validacao = "";
        String teste = "";
        String acao = "";
        AbrangenciaLogistica instance = new AbrangenciaLogistica();
        instance.Acao(status, codvenda, botao, Validacao, teste, acao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
