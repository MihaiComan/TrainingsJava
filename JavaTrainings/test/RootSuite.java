/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gheorgheaurelpacurar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({numberHolder.NumberHolderITSuite.class, library.LibraryITSuite.class, javatrainings.JavatrainingsITSuite.class, numbersmagic.NumbersmagicITSuite.class, FixTheProgram.FixTheProgramITSuite.class, eBookStore.EBookStoreITSuite.class, javadisplaymessages.JavadisplaymessagesITSuite.class, variablesoperations.VariablesoperationsITSuite.class, HelloWorldAnonymousClassesIT.class, complexNumbers.ComplexNumbersITSuite.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
