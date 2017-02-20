/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.GestionEntity;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author herinihaja
 */
public class InscriptionTest {
    
    public InscriptionTest() {
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
     * Test of inscription method, of class Inscription.
     */
    @Test
    public void testInscription() throws Exception {
        long nombreLigne = GestionEntity.getMaxId("membre");
        System.out.println("Nombre de ligne avant : "+nombreLigne );
        String nom = "Rabe";
        String prenom = "Jean";
        String dateNaissance = "12-11-1987";
        String sexe = "h";
        String mail = "jean@gmail.com";
        String mdp1 = "jean";
        String mdp2 = "jean";
        Inscription.inscription(nom, prenom, dateNaissance, sexe, mail, mdp1, mdp2);
        long nombreLignes = GestionEntity.getMaxId("membre");
        assertTrue("test", nombreLignes==(nombreLigne+1));
        System.out.println("Nombre de ligne après : "+nombreLignes);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
