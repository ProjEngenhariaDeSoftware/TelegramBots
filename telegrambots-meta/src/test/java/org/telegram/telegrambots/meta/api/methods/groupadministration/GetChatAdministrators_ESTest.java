/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:35:00 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.groupadministration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetChatAdministrators_ESTest extends GetChatAdministrators_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      Long long0 = new Long(0L);
      GetChatAdministrators getChatAdministrators1 = getChatAdministrators0.setChatId(long0);
      assertSame(getChatAdministrators0, getChatAdministrators1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      GetChatAdministrators getChatAdministrators1 = getChatAdministrators0.setChatId("getChatAdministrators");
      String string0 = getChatAdministrators1.getChatId();
      assertEquals("getChatAdministrators", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      getChatAdministrators0.setChatId("");
      String string0 = getChatAdministrators0.getChatId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      try { 
        getChatAdministrators0.deserializeResponse("g");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      GetChatAdministrators getChatAdministrators1 = getChatAdministrators0.setChatId("");
      try { 
        getChatAdministrators1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      try { 
        getChatAdministrators0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      // Undeclared exception!
      try { 
        getChatAdministrators0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      String string0 = getChatAdministrators0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      String string0 = getChatAdministrators0.getMethod();
      assertEquals("getChatAdministrators", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      getChatAdministrators0.setChatId("GetChatAdministrators{chatId='null'}");
      getChatAdministrators0.validate();
      assertEquals("GetChatAdministrators{chatId='null'}", getChatAdministrators0.getChatId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      String string0 = getChatAdministrators0.toString();
      assertEquals("GetChatAdministrators{chatId='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GetChatAdministrators getChatAdministrators0 = new GetChatAdministrators();
      // Undeclared exception!
      try { 
        getChatAdministrators0.deserializeResponse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.JsonFactory", e);
      }
  }
}
