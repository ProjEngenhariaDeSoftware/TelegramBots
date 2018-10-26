/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:15:34 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PassportElementErrorSelfie_ESTest extends PassportElementErrorSelfie_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie(")P:Z<;`2_Afd6>", "'5h", ")P:Z<;`2_Afd6>");
      String string0 = passportElementErrorSelfie0.getType();
      assertEquals(")P:Z<;`2_Afd6>", string0);
      assertEquals("'5h", passportElementErrorSelfie0.getFileHash());
      assertEquals(")P:Z<;`2_Afd6>", passportElementErrorSelfie0.getMessage());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      passportElementErrorSelfie0.setType("");
      String string0 = passportElementErrorSelfie0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie("%", "%", "%");
      String string0 = passportElementErrorSelfie0.getMessage();
      assertEquals("%", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie("", "", "");
      String string0 = passportElementErrorSelfie0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      PassportElementErrorSelfie passportElementErrorSelfie1 = passportElementErrorSelfie0.setFileHash("type");
      String string0 = passportElementErrorSelfie1.getFileHash();
      assertEquals("type", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie("", "", "");
      String string0 = passportElementErrorSelfie0.getFileHash();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      // Undeclared exception!
      try { 
        passportElementErrorSelfie0.setType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      // Undeclared exception!
      try { 
        passportElementErrorSelfie0.setMessage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = null;
      try {
        passportElementErrorSelfie0 = new PassportElementErrorSelfie("_G60_]$#", "_G60_]$#", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie("%", "%", "%");
      passportElementErrorSelfie0.validate();
      assertEquals("%", passportElementErrorSelfie0.getMessage());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie("", "oO6Q_c3>V", "");
      try { 
        passportElementErrorSelfie0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Message parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie("", "", "");
      try { 
        passportElementErrorSelfie0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // File hash parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      try { 
        passportElementErrorSelfie0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // File hash parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      passportElementErrorSelfie0.setMessage("type");
      PassportElementErrorSelfie passportElementErrorSelfie1 = passportElementErrorSelfie0.setFileHash("type");
      try { 
        passportElementErrorSelfie1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Type parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      PassportElementErrorSelfie passportElementErrorSelfie1 = passportElementErrorSelfie0.setFileHash("type");
      try { 
        passportElementErrorSelfie1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Message parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      String string0 = passportElementErrorSelfie0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      String string0 = passportElementErrorSelfie0.getFileHash();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      passportElementErrorSelfie0.setType("");
      passportElementErrorSelfie0.setMessage("type");
      PassportElementErrorSelfie passportElementErrorSelfie1 = passportElementErrorSelfie0.setFileHash("type");
      try { 
        passportElementErrorSelfie1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Type parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      String string0 = passportElementErrorSelfie0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      String string0 = passportElementErrorSelfie0.getSource();
      assertEquals("selfie", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PassportElementErrorSelfie passportElementErrorSelfie0 = new PassportElementErrorSelfie();
      String string0 = passportElementErrorSelfie0.toString();
      assertEquals("PassportElementErrorSelfie{source='selfie', type='null', fileHash='null', message='null'}", string0);
  }
}
