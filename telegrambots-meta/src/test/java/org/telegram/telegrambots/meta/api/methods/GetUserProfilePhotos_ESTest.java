/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:37:24 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.GetUserProfilePhotos;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetUserProfilePhotos_ESTest extends GetUserProfilePhotos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(0);
      GetUserProfilePhotos getUserProfilePhotos1 = getUserProfilePhotos0.setUserId(integer0);
      Integer integer1 = getUserProfilePhotos1.getUserId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer((-1945));
      getUserProfilePhotos0.setUserId(integer0);
      Integer integer1 = getUserProfilePhotos0.getUserId();
      assertEquals((-1945), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(491);
      getUserProfilePhotos0.setUserId(integer0);
      Integer integer1 = getUserProfilePhotos0.getUserId();
      assertEquals(491, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(3);
      GetUserProfilePhotos getUserProfilePhotos1 = getUserProfilePhotos0.setOffset(integer0);
      Integer integer1 = getUserProfilePhotos1.getOffset();
      assertEquals(3, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer((-1220));
      GetUserProfilePhotos getUserProfilePhotos1 = getUserProfilePhotos0.setOffset(integer0);
      Integer integer1 = getUserProfilePhotos1.getOffset();
      assertEquals((-1220), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer((-1));
      getUserProfilePhotos0.setOffset(integer0);
      Integer integer1 = getUserProfilePhotos0.getOffset();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(125);
      getUserProfilePhotos0.setLimit(integer0);
      Integer integer1 = getUserProfilePhotos0.getLimit();
      assertEquals(125, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer((-1));
      getUserProfilePhotos0.setLimit(integer0);
      Integer integer1 = getUserProfilePhotos0.getLimit();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      // Undeclared exception!
      try { 
        getUserProfilePhotos0.deserializeResponse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.JsonFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(3);
      GetUserProfilePhotos getUserProfilePhotos1 = getUserProfilePhotos0.setOffset(integer0);
      getUserProfilePhotos1.setUserId(integer0);
      getUserProfilePhotos0.validate();
      assertSame(getUserProfilePhotos0, getUserProfilePhotos1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      try { 
        getUserProfilePhotos0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // UserId parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.GetUserProfilePhotos", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = getUserProfilePhotos0.getLimit();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      String string0 = getUserProfilePhotos0.getMethod();
      assertEquals("getuserprofilephotos", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(0);
      GetUserProfilePhotos getUserProfilePhotos1 = getUserProfilePhotos0.setLimit(integer0);
      Integer integer1 = getUserProfilePhotos1.getLimit();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = getUserProfilePhotos0.getOffset();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = getUserProfilePhotos0.getUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(0);
      getUserProfilePhotos0.setOffset(integer0);
      Integer integer1 = getUserProfilePhotos0.getOffset();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      String string0 = getUserProfilePhotos0.toString();
      assertEquals("GetUserProfilePhotos{userId=null, offset=null, limit=null}", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      Integer integer0 = new Integer(0);
      getUserProfilePhotos0.setUserId(integer0);
      try { 
        getUserProfilePhotos0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Offset parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.GetUserProfilePhotos", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GetUserProfilePhotos getUserProfilePhotos0 = new GetUserProfilePhotos();
      try { 
        getUserProfilePhotos0.deserializeResponse("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.GetUserProfilePhotos", e);
      }
  }
}
