package fr.dauphine.ja.rochedypierre.td00;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
        
    }
    
    ArrayList<Integer> list = new ArrayList<>();
	PrimeCollection p = new PrimeCollection(list);
   
    public void test0IsPrime() {
    	assertEquals(true, p.isPrime(0));
    }
    
    public void testTwoIsPrime() {
    	assertEquals(true, p.isPrime(2));
    }
    
    public void test9IsNotPrime() {
    	assertEquals(false, p.isPrime(9));
    }
}
