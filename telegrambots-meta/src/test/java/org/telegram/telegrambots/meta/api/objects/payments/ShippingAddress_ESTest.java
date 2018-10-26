/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:49:21 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.payments;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.payments.ShippingAddress;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShippingAddress_ESTest extends ShippingAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.toString();
      assertEquals("ShippingAddress{countryCode='null', state='null', city='null', streetLine1='null', streetLine2='null', postCode='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.getStreetLine2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.getStreetLine1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.getCity();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.getCountryCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.getState();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ShippingAddress shippingAddress0 = new ShippingAddress();
      String string0 = shippingAddress0.getPostCode();
      assertNull(string0);
  }
}
