/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:07:26 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.groupadministration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SetChatPhoto_ESTest extends SetChatPhoto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long(1L);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, pipedInputStream0, "");
      assertEquals("", setChatPhoto0.getPhotoName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      setChatPhoto0.setNewPhoto("{0_WyH6zha(Y4uugg:", sequenceInputStream0);
      setChatPhoto0.getPhotoStream();
      assertEquals("{0_WyH6zha(Y4uugg:", setChatPhoto0.getPhotoName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      setChatPhoto0.setNewPhoto("{0_WyH6zha(Y4uugg:", sequenceInputStream0);
      String string0 = setChatPhoto0.getPhotoName();
      assertEquals("{0_WyH6zha(Y4uugg:", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto$1", pipedInputStream0, "");
      String string0 = setChatPhoto0.getPhotoName();
      assertEquals("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto$1", setChatPhoto0.getChatId());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      File file0 = setChatPhoto0.getPhoto();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long long0 = new Long((-1503L));
      MockFile mockFile0 = new MockFile("#V$f37M[, ~tN");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("#V$f37M[, ~tN");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = setChatPhoto0.getPhoto();
      assertEquals("#V$f37M[, ~tN", file0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(0L);
      MockFile mockFile0 = new MockFile("Q>+i2", "Q>+i2");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      File file0 = setChatPhoto0.getPhoto();
      assertEquals("/home/felipe/eclipse-workspace/TelegramBots/telegrambots-meta/Q>+i2/Q>+i2", file0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      String string0 = setChatPhoto0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("", mockFileInputStream0, "iLfzO4{\"V7");
      String string0 = setChatPhoto0.getChatId();
      assertEquals("iLfzO4{\"V7", setChatPhoto0.getPhotoName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("yyyy-MM-dd", "yyyy-MM-dd");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("yyyy-MM-dd", file0);
      // Undeclared exception!
      try { 
        setChatPhoto0.setNewPhoto("p4e$", (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // inputStream cannot be null!
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      // Undeclared exception!
      try { 
        setChatPhoto0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      // Undeclared exception!
      try { 
        setChatPhoto0.deserializeResponse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.JsonFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = null;
      try {
        setChatPhoto0 = new SetChatPhoto("rOnVNve8Pd#fmU", (InputStream) null, "rOnVNve8Pd#fmU");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = null;
      try {
        setChatPhoto0 = new SetChatPhoto("t;(c^sg5", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Long long0 = new Long((-2098L));
      SetChatPhoto setChatPhoto0 = null;
      try {
        setChatPhoto0 = new SetChatPhoto(long0, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      SetChatPhoto setChatPhoto1 = setChatPhoto0.setChatId(" in character escape sequence");
      try { 
        setChatPhoto1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Photo parameter is required
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("dyZt+1", sequenceInputStream0, "");
      try { 
        setChatPhoto0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Photo name can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("EJu5H8IW");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("K@3qN'8Io=<", mockFile0);
      setChatPhoto0.validate();
      assertNull(setChatPhoto0.getPhotoName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long long0 = new Long((-1503L));
      MockFile mockFile0 = new MockFile("");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      String string0 = setChatPhoto0.toString();
      assertEquals("SetChatPhoto{chatId='-1503', photoName='null', photoStream=null, photo=}", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long long0 = new Long((-1503L));
      MockFile mockFile0 = new MockFile("");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      SetChatPhoto setChatPhoto1 = setChatPhoto0.setChatId(long0);
      assertEquals("-1503", setChatPhoto1.getChatId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("yyyy-MM-dd", "yyyy-MM-dd");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("yyyy-MM-dd", file0);
      String string0 = setChatPhoto0.getChatId();
      assertEquals("yyyy-MM-dd", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Long long0 = new Long((-1503L));
      MockFile mockFile0 = new MockFile("");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      SetChatPhoto setChatPhoto1 = setChatPhoto0.setChatId("");
      try { 
        setChatPhoto1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Long long0 = new Long((-1503L));
      MockFile mockFile0 = new MockFile("");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      File file0 = setChatPhoto0.getPhoto();
      assertEquals(0L, file0.getFreeSpace());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SetChatPhoto setChatPhoto0 = new SetChatPhoto();
      try { 
        setChatPhoto0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("EJu5H8IW");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("K@3qN'8Io=<", mockFile0);
      InputStream inputStream0 = setChatPhoto0.getPhotoStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SetChatPhoto setChatPhoto0 = null;
      try {
        setChatPhoto0 = new SetChatPhoto((Long) null, pipedInputStream0, "96r`IctKjd+&P");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Long long0 = new Long((-1503L));
      MockFile mockFile0 = new MockFile("");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto(long0, mockFile0);
      SetChatPhoto setChatPhoto1 = setChatPhoto0.setPhoto(mockFile0);
      assertEquals("-1503", setChatPhoto1.getChatId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      File file0 = MockFile.createTempFile("yyyy-MM-dd", "yyyy-MM-dd");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("yyyy-MM-dd", file0);
      String string0 = setChatPhoto0.getPhotoName();
      assertEquals("yyyy-MM-dd", setChatPhoto0.getChatId());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("dyZt+1", sequenceInputStream0, "");
      assertEquals("", setChatPhoto0.getPhotoName());
      
      setChatPhoto0.setNewPhoto("dyZt+1", sequenceInputStream0);
      setChatPhoto0.validate();
      assertEquals("dyZt+1", setChatPhoto0.getPhotoName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("EJu5H8IW");
      SetChatPhoto setChatPhoto0 = new SetChatPhoto("K@3qN'8Io=<", mockFile0);
      try { 
        setChatPhoto0.deserializeResponse("pg%FfjMGZ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto", e);
      }
  }
}
