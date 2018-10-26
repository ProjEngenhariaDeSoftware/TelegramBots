/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:07:39 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.InputFile;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InputFile_ESTest extends InputFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "attach://");
      boolean boolean0 = inputFile0.isNew();
      assertEquals("attach://attach://", inputFile0.getAttachName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InputFile inputFile0 = new InputFile((InputStream) null, (String) null);
      inputFile0.getNewMediaStream();
      assertEquals("attach://null", inputFile0.getAttachName());
      assertTrue(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InputFile inputFile0 = new InputFile(">UJTe(q>~)~B>L");
      java.io.File file0 = MockFile.createTempFile(".<AkXqh\"s5tGJ", "jaFa");
      InputFile inputFile1 = inputFile0.setMedia(file0, (String) null);
      inputFile1.getNewMediaFile();
      assertTrue(inputFile0.isNew());
      assertEquals("attach://null", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InputFile inputFile0 = new InputFile("");
      MockFile mockFile0 = new MockFile("");
      inputFile0.setMedia((java.io.File) mockFile0, (String) null);
      inputFile0.getNewMediaFile();
      assertEquals("attach://null", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "attach://");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("attach:");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile("attach://");
      InputFile inputFile1 = inputFile0.setMedia((java.io.File) mockFile0, "!~(2#%u>xO^?_VmMi,G");
      inputFile1.getNewMediaFile();
      assertEquals("attach://!~(2#%u>xO^?_VmMi,G", inputFile0.getAttachName());
      assertTrue(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InputFile inputFile0 = new InputFile();
      MockFile mockFile0 = new MockFile("PFZ", "\"ybS]>TVu)c/EnpM$Y");
      InputFile inputFile1 = inputFile0.setMedia((java.io.File) mockFile0, (String) null);
      inputFile1.getNewMediaFile();
      assertTrue(inputFile0.isNew());
      assertEquals("attach://null", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InputFile inputFile0 = new InputFile();
      java.io.File file0 = MockFile.createTempFile("ALWAYS", "STATIC");
      inputFile0.setMedia(file0, "STATIC");
      inputFile0.getMediaName();
      assertTrue(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InputFile inputFile0 = new InputFile(",");
      inputFile0.setMedia((java.io.File) null, "");
      inputFile0.getMediaName();
      assertEquals("attach://", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InputFile inputFile0 = new InputFile();
      String string0 = inputFile0.getAttachName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InputFile inputFile0 = new InputFile();
      InputFile inputFile1 = inputFile0.setMedia("");
      String string0 = inputFile1.getAttachName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 27, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "G4wx.]P!MTyA+P=");
      inputFile0.setMedia((InputStream) byteArrayInputStream0, "H");
      assertEquals("attach://H", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InputFile inputFile0 = new InputFile();
      InputFile inputFile1 = inputFile0.setMedia("3");
      inputFile0.validate();
      assertSame(inputFile0, inputFile1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InputFile inputFile0 = new InputFile();
      try { 
        inputFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // File_id can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.InputFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 27, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "G4wx.]P!MTyA+P=");
      MockFile mockFile0 = new MockFile("G4wx.]P!MTyA+P=", "G4wx.]P!MTyA+P=");
      inputFile0.setMedia((java.io.File) mockFile0, "G4wx.]P!MTyA+P=");
      inputFile0.validate();
      assertEquals("attach://G4wx.]P!MTyA+P=", inputFile0.getAttachName());
      assertTrue(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 27, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "G4wx.]P!MTyA+P=");
      inputFile0.validate();
      assertTrue(inputFile0.isNew());
      assertEquals("attach://G4wx.]P!MTyA+P=", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InputFile inputFile0 = new InputFile("{'t:kl\u0001H+vR");
      MockFile mockFile0 = new MockFile("{'t:kl\u0001H+vR", "{'t:kl\u0001H+vR");
      InputFile inputFile1 = inputFile0.setMedia((java.io.File) mockFile0, "");
      try { 
        inputFile1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Media name can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.InputFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InputFile inputFile0 = new InputFile("");
      try { 
        inputFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // File_id can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.InputFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 27, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "G4wx.]P!MTyA+P=");
      inputFile0.getNewMediaStream();
      assertTrue(inputFile0.isNew());
      assertEquals("attach://G4wx.]P!MTyA+P=", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 27, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      InputFile inputFile0 = new InputFile(dataInputStream0, "G4wx.]P!MTyA+P=");
      String string0 = inputFile0.getAttachName();
      assertEquals("attach://G4wx.]P!MTyA+P=", string0);
      assertTrue(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputFile inputFile0 = new InputFile(pipedInputStream0, (String) null);
      try { 
        inputFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Media name can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.InputFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InputFile inputFile0 = new InputFile("{'t:kl\u0001H+vR");
      inputFile0.getNewMediaFile();
      assertFalse(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InputFile inputFile0 = new InputFile("{'t:kl\u0001H+vR");
      boolean boolean0 = inputFile0.isNew();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InputFile inputFile0 = new InputFile("{'t:kl\u0001H+vR");
      inputFile0.getMediaName();
      assertFalse(inputFile0.isNew());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InputFile inputFile0 = new InputFile((java.io.File) null, "File_id can't be empty");
      try { 
        inputFile0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Media can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.InputFile", e);
      }
  }
}
