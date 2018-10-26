/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:32:54 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.groupadministration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.groupadministration.KickChatMember;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KickChatMember_ESTest extends KickChatMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = Long.valueOf(1L);
      Integer integer0 = new Integer(0);
      KickChatMember kickChatMember0 = new KickChatMember(long0, integer0);
      Integer integer1 = kickChatMember0.getUserId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Integer integer0 = new Integer(125);
      KickChatMember kickChatMember1 = kickChatMember0.setUserId(integer0);
      Integer integer1 = kickChatMember1.getUserId();
      assertEquals(125, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Integer integer0 = Integer.getInteger("kickchatmember", (-1558));
      kickChatMember0.setUserId(integer0);
      Integer integer1 = kickChatMember0.getUserId();
      assertEquals((-1558), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Long long0 = new Long((-3655L));
      Integer integer0 = new Integer(1086);
      KickChatMember kickChatMember0 = new KickChatMember(long0, integer0);
      KickChatMember kickChatMember1 = kickChatMember0.setUntilDate(integer0);
      Integer integer1 = kickChatMember1.getUntilDate();
      assertEquals(1086, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long((-3655L));
      Integer integer0 = new Integer(1086);
      KickChatMember kickChatMember0 = new KickChatMember(long0, integer0);
      Integer integer1 = new Integer(0);
      kickChatMember0.setUntilDate(integer1);
      Integer integer2 = kickChatMember0.getUntilDate();
      assertFalse(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Integer integer0 = new Integer((-1009));
      kickChatMember0.setUntilDate(integer0);
      Integer integer1 = kickChatMember0.getUntilDate();
      assertEquals((-1009), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(0L);
      Integer integer0 = new Integer((-1370));
      KickChatMember kickChatMember0 = new KickChatMember(long0, integer0);
      kickChatMember0.setUntilDate(integer0);
      Integer integer1 = kickChatMember0.getUntilDate();
      assertEquals((-1370), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      kickChatMember0.setChatId("kickchatmember");
      String string0 = kickChatMember0.getChatId();
      assertEquals("kickchatmember", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      KickChatMember kickChatMember0 = new KickChatMember("", integer0);
      String string0 = kickChatMember0.getChatId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      // Undeclared exception!
      try { 
        kickChatMember0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      // Undeclared exception!
      try { 
        kickChatMember0.deserializeResponse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.JsonFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KickChatMember kickChatMember0 = null;
      try {
        kickChatMember0 = new KickChatMember("1NqIJm-S7.]oO?'ln", (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer((-17));
      KickChatMember kickChatMember0 = new KickChatMember("", integer0);
      try { 
        kickChatMember0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.KickChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      try { 
        kickChatMember0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.KickChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Integer integer0 = kickChatMember0.getUntilDate();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Integer integer0 = Integer.getInteger("kickchatmember", (-1558));
      KickChatMember kickChatMember1 = kickChatMember0.setUserId(integer0);
      KickChatMember kickChatMember2 = kickChatMember1.setChatId("kickchatmember");
      kickChatMember0.validate();
      assertSame(kickChatMember0, kickChatMember2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      kickChatMember0.setChatId("kickchatmember");
      try { 
        kickChatMember0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // UserId can't be null
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.KickChatMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      String string0 = kickChatMember0.getMethod();
      assertEquals("kickchatmember", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long long0 = new Long((-42));
      KickChatMember kickChatMember0 = null;
      try {
        kickChatMember0 = new KickChatMember(long0, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer((-17));
      KickChatMember kickChatMember0 = new KickChatMember("", integer0);
      String string0 = kickChatMember0.toString();
      assertEquals("KickChatMember{chatId='', userId=-17, untilDate=null}", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Long long0 = new Long(136L);
      KickChatMember kickChatMember1 = kickChatMember0.setChatId(long0);
      assertNull(kickChatMember1.getUntilDate());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      String string0 = kickChatMember0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      Integer integer0 = kickChatMember0.getUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KickChatMember kickChatMember0 = new KickChatMember();
      try { 
        kickChatMember0.deserializeResponse("kickchatmember");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.KickChatMember", e);
      }
  }
}
