/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 12:56:19 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.games;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.games.SetGameScore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SetGameScore_ESTest extends SetGameScore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(398);
      setGameScore0.setUserId(integer0);
      Integer integer1 = setGameScore0.getUserId();
      assertEquals(398, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(0);
      SetGameScore setGameScore1 = setGameScore0.setUserId(integer0);
      Integer integer1 = setGameScore1.getUserId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer((-2534));
      setGameScore0.setUserId(integer0);
      Integer integer1 = setGameScore0.getUserId();
      assertEquals((-2534), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer((-4038));
      SetGameScore setGameScore1 = setGameScore0.setScore(integer0);
      Integer integer1 = setGameScore1.getScore();
      assertEquals((-4038), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(90);
      SetGameScore setGameScore1 = setGameScore0.setScore(integer0);
      Integer integer1 = setGameScore1.getScore();
      assertEquals(90, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(3832);
      SetGameScore setGameScore1 = setGameScore0.setScore(integer0);
      Integer integer1 = setGameScore1.getScore();
      assertEquals(3832, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(0);
      SetGameScore setGameScore1 = setGameScore0.setMessageId(integer0);
      Integer integer1 = setGameScore1.getMessageId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(2066);
      setGameScore0.setMessageId(integer0);
      Integer integer1 = setGameScore0.getMessageId();
      assertEquals(2066, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer((-1905));
      setGameScore0.setMessageId(integer0);
      Integer integer1 = setGameScore0.getMessageId();
      assertEquals((-1905), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      setGameScore0.setInlineMessageId(", disableEditMessage=");
      String string0 = setGameScore0.getInlineMessageId();
      assertEquals(", disableEditMessage=", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      setGameScore0.setInlineMessageId("");
      String string0 = setGameScore0.getInlineMessageId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Boolean boolean0 = Boolean.FALSE;
      setGameScore0.setForce(boolean0);
      Boolean boolean1 = setGameScore0.getForce();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Boolean boolean0 = new Boolean(false);
      setGameScore0.setDisableEditMessage(boolean0);
      Boolean boolean1 = setGameScore0.getDisableEditMessage();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Long long0 = new Long(290L);
      setGameScore0.setChatId(long0);
      String string0 = setGameScore0.getChatId();
      assertEquals("290", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      SetGameScore setGameScore1 = setGameScore0.setChatId("");
      String string0 = setGameScore1.getChatId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      // Undeclared exception!
      try { 
        setGameScore0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      // Undeclared exception!
      try { 
        setGameScore0.deserializeResponse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.JsonFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer((-1742));
      SetGameScore setGameScore1 = setGameScore0.setUserId(integer0);
      SetGameScore setGameScore2 = setGameScore1.setInlineMessageId("setGameScore");
      setGameScore2.setScore(integer0);
      SetGameScore setGameScore3 = setGameScore2.setMessageId(integer0);
      try { 
        setGameScore3.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // MessageId parameter must be empty if inlineMessageId is provided
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer((-90));
      SetGameScore setGameScore1 = setGameScore0.setUserId(integer0);
      SetGameScore setGameScore2 = setGameScore1.setInlineMessageId("setGameScore");
      setGameScore2.setScore(integer0);
      setGameScore2.setChatId("setGameScore");
      try { 
        setGameScore0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId parameter must be empty if inlineMessageId is provided
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Long long0 = new Long(5L);
      SetGameScore setGameScore1 = setGameScore0.setChatId(long0);
      Integer integer0 = new Integer(1552);
      setGameScore1.setUserId(integer0);
      setGameScore1.setMessageId(integer0);
      setGameScore0.setScore(integer0);
      setGameScore1.validate();
      assertEquals(1552, (int)setGameScore1.getUserId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer((-90));
      SetGameScore setGameScore1 = setGameScore0.setUserId(integer0);
      SetGameScore setGameScore2 = setGameScore1.setInlineMessageId("setGameScore");
      SetGameScore setGameScore3 = setGameScore2.setScore(integer0);
      setGameScore0.validate();
      assertSame(setGameScore0, setGameScore3);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(1552);
      SetGameScore setGameScore1 = setGameScore0.setUserId(integer0);
      setGameScore1.setScore(integer0);
      try { 
        setGameScore0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId parameter can't be empty if inlineMessageId is not present
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      try { 
        setGameScore0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // UserId parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      try { 
        setGameScore0.deserializeResponse("setGameScore");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      String string0 = setGameScore0.getMethod();
      assertEquals("setGameScore", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Boolean boolean0 = setGameScore0.getForce();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      String string0 = setGameScore0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Boolean boolean0 = Boolean.TRUE;
      setGameScore0.setForce(boolean0);
      Boolean boolean1 = setGameScore0.getForce();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = setGameScore0.getScore();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = setGameScore0.getUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(1552);
      setGameScore0.setUserId(integer0);
      try { 
        setGameScore0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Score parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      String string0 = setGameScore0.getInlineMessageId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      String string0 = setGameScore0.toString();
      assertEquals("SetGameScore{chatId='null', messageId=null, inlineMessageId='null', disableEditMessage=null, userId=null, score=null, force=null}", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Boolean boolean0 = Boolean.TRUE;
      setGameScore0.setDisableEditMessage(boolean0);
      Boolean boolean1 = setGameScore0.getDisableEditMessage();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Long long0 = new Long(5L);
      SetGameScore setGameScore1 = setGameScore0.setChatId(long0);
      Integer integer0 = new Integer(1552);
      setGameScore1.setUserId(integer0);
      setGameScore1.setScore(integer0);
      try { 
        setGameScore1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // MessageId parameter can't be empty if inlineMessageId is not present
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.games.SetGameScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = setGameScore0.getMessageId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Boolean boolean0 = setGameScore0.getDisableEditMessage();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SetGameScore setGameScore0 = new SetGameScore();
      Integer integer0 = new Integer(0);
      setGameScore0.setScore(integer0);
      Integer integer1 = setGameScore0.getScore();
      assertEquals(0, (int)integer1);
  }
}
