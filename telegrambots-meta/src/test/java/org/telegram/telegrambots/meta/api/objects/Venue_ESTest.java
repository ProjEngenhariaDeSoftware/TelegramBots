/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:47:32 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.Venue;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Venue_ESTest extends Venue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Venue venue0 = new Venue();
      Location location0 = venue0.getLocation();
      assertNull(location0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Venue venue0 = new Venue();
      String string0 = venue0.getAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Venue venue0 = new Venue();
      String string0 = venue0.toString();
      assertEquals("Venue{location=null, title='null', address='null', foursquareId='null', foursquareType='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Venue venue0 = new Venue();
      String string0 = venue0.getFoursquareId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Venue venue0 = new Venue();
      String string0 = venue0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Venue venue0 = new Venue();
      String string0 = venue0.getFoursquareType();
      assertNull(string0);
  }
}
