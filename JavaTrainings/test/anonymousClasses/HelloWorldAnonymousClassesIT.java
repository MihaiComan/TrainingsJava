/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousClasses;



import static java.util.Locale.ENGLISH;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class HelloWorldAnonymousClassesIT {
    
    public HelloWorldAnonymousClassesIT() {
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
     * Test of sayHello method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses.LANGUAGES language = ENGLISH;
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello(language);
       
    }

    /**
     * Test of main method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorldAnonymousClasses.main(args);
        
    }
    
}
