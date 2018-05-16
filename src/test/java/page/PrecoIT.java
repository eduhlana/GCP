/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduardo.lana
 */
public class PrecoIT {
    
    public PrecoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class Preco.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        Preco.main();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InserirPreco method, of class Preco.
     */
    @Test
    public void testInserirPreco() {
        System.out.println("InserirPreco");
        Preco instance = new Preco();
        instance.InserirPreco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AprovarPreco method, of class Preco.
     */
    @Test
    public void testAprovarPreco() {
        System.out.println("AprovarPreco");
        Preco instance = new Preco();
        instance.AprovarPreco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CancelarPreco method, of class Preco.
     */
    @Test
    public void testCancelarPreco() {
        System.out.println("CancelarPreco");
        Preco instance = new Preco();
        instance.CancelarPreco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarPreco method, of class Preco.
     */
    @Test
    public void testSalvarPreco() {
        System.out.println("SalvarPreco");
        Preco instance = new Preco();
        instance.SalvarPreco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluiPreco method, of class Preco.
     */
    @Test
    public void testExcluiPreco() {
        System.out.println("ExcluiPreco");
        Preco instance = new Preco();
        instance.ExcluiPreco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AprovaCancelaouExclui method, of class Preco.
     */
    @Test
    public void testAprovaCancelaouExclui() {
        System.out.println("AprovaCancelaouExclui");
        String status = "";
        String codvenda = "";
        String botao = "";
        String texto = "";
        String teste = "";
        String acao = "";
        Preco instance = new Preco();
        instance.AprovaCancelaouExclui(status, codvenda, botao, texto, teste, acao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
