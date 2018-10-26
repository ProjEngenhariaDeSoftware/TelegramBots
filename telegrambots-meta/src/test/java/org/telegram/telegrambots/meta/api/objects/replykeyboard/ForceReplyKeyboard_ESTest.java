/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:27:09 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ForceReplyKeyboard;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForceReplyKeyboard_ESTest extends ForceReplyKeyboard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      Boolean boolean0 = new Boolean("W$3L(Csz,EG4PmLDsd");
      forceReplyKeyboard0.setSelective(boolean0);
      forceReplyKeyboard0.getSelective();
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      Boolean boolean0 = Boolean.TRUE;
      ForceReplyKeyboard forceReplyKeyboard1 = new ForceReplyKeyboard();
      assertTrue(forceReplyKeyboard1.equals((Object)forceReplyKeyboard0));
      
      forceReplyKeyboard1.setSelective(boolean0);
      boolean boolean1 = forceReplyKeyboard0.equals(forceReplyKeyboard1);
      assertFalse(forceReplyKeyboard1.equals((Object)forceReplyKeyboard0));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      ForceReplyKeyboard forceReplyKeyboard1 = new ForceReplyKeyboard();
      boolean boolean0 = forceReplyKeyboard1.equals(forceReplyKeyboard0);
      assertTrue(boolean0);
      assertTrue(forceReplyKeyboard1.getForceReply());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      boolean boolean0 = forceReplyKeyboard0.equals(forceReplyKeyboard0);
      assertTrue(boolean0);
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = forceReplyKeyboard0.equals(boolean0);
      assertFalse(boolean1);
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      forceReplyKeyboard0.validate();
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      Boolean boolean0 = Boolean.TRUE;
      forceReplyKeyboard0.setSelective(boolean0);
      forceReplyKeyboard0.getSelective();
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      Boolean boolean0 = forceReplyKeyboard0.getForceReply();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      forceReplyKeyboard0.hashCode();
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      forceReplyKeyboard0.getSelective();
      assertTrue(forceReplyKeyboard0.getForceReply());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForceReplyKeyboard forceReplyKeyboard0 = new ForceReplyKeyboard();
      String string0 = forceReplyKeyboard0.toString();
      assertEquals("ForceReplyKeyboard{forceReply=true, selective=null}", string0);
  }
}
