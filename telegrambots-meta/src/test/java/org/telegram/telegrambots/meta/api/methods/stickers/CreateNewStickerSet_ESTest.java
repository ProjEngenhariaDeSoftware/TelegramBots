/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 12:46:52 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.stickers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.stickers.MaskPosition;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreateNewStickerSet_ESTest extends CreateNewStickerSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "]D02v", " <Mm", " <Mm");
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // userId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer((-1178));
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "Kx{55  0X%", "Kx{55  0X%", "Kx{55  0X%");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      CreateNewStickerSet createNewStickerSet1 = createNewStickerSet0.setPngStickerStream("M<{8a+Kt", pipedInputStream0);
      assertEquals("Kx{55  0X%", createNewStickerSet1.getEmojis());
      assertEquals("Kx{55  0X%", createNewStickerSet1.getTitle());
      assertEquals("Kx{55  0X%", createNewStickerSet1.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "\">'7#~f#3c-U1]yAlm", "", " sets of annotations");
      createNewStickerSet0.getUserId();
      assertEquals("\">'7#~f#3c-U1]yAlm", createNewStickerSet0.getName());
      assertEquals("", createNewStickerSet0.getTitle());
      assertEquals(" sets of annotations", createNewStickerSet0.getEmojis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      Integer integer0 = new Integer(39);
      createNewStickerSet0.setUserId(integer0);
      Integer integer1 = createNewStickerSet0.getUserId();
      assertEquals(39, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-813));
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, ",8jzVG3zc", "", "T@|m");
      createNewStickerSet0.getUserId();
      assertEquals("", createNewStickerSet0.getTitle());
      assertEquals("T@|m", createNewStickerSet0.getEmojis());
      assertEquals(",8jzVG3zc", createNewStickerSet0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      String string0 = createNewStickerSet0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      createNewStickerSet0.setTitle("'z`0uJ%n");
      String string0 = createNewStickerSet0.getTitle();
      assertEquals("'z`0uJ%n", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      MockFile mockFile0 = new MockFile((File) null, "void");
      CreateNewStickerSet createNewStickerSet1 = createNewStickerSet0.setPngStickerFile((File) mockFile0);
      InputFile inputFile0 = createNewStickerSet1.getPngSticker();
      assertEquals("attach://void", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      CreateNewStickerSet createNewStickerSet1 = createNewStickerSet0.setPngSticker(", title='");
      InputFile inputFile0 = createNewStickerSet1.getPngSticker();
      assertEquals(", title='", inputFile0.getAttachName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      String string0 = createNewStickerSet0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "9n)}Zfz?Vjn)=3`(Z", " starting at ", "9n)}Zfz?Vjn)=3`(Z");
      String string0 = createNewStickerSet0.getName();
      assertEquals("9n)}Zfz?Vjn)=3`(Z", string0);
      assertEquals("9n)}Zfz?Vjn)=3`(Z", createNewStickerSet0.getEmojis());
      assertEquals(" starting at ", createNewStickerSet0.getTitle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "\">'7#~f#3c-U1]yAlm", "", " sets of annotations");
      MaskPosition maskPosition0 = new MaskPosition();
      createNewStickerSet0.setMaskPosition(maskPosition0);
      createNewStickerSet0.getMaskPosition();
      assertEquals("\">'7#~f#3c-U1]yAlm", createNewStickerSet0.getName());
      assertEquals("", createNewStickerSet0.getTitle());
      assertEquals(" sets of annotations", createNewStickerSet0.getEmojis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      String string0 = createNewStickerSet0.getEmojis();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(789);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "", "", "");
      String string0 = createNewStickerSet0.getEmojis();
      assertEquals("", string0);
      assertEquals("", createNewStickerSet0.getTitle());
      assertEquals("", createNewStickerSet0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      Boolean boolean0 = Boolean.TRUE;
      createNewStickerSet0.setContainsMasks(boolean0);
      Boolean boolean1 = createNewStickerSet0.getContainsMasks();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      Boolean boolean0 = Boolean.valueOf("contains_masks");
      createNewStickerSet0.setContainsMasks(boolean0);
      Boolean boolean1 = createNewStickerSet0.getContainsMasks();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      // Undeclared exception!
      try { 
        createNewStickerSet0.setPngStickerFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pngStickerFile cannot be null!
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      // Undeclared exception!
      try { 
        createNewStickerSet0.deserializeResponse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.JsonFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(1821);
      CreateNewStickerSet createNewStickerSet0 = null;
      try {
        createNewStickerSet0 = new CreateNewStickerSet(integer0, (String) null, (String) null, (String) null);
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
      Integer integer0 = new Integer(1871);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "IWacpCP`[", "IWacpCP`[", "IWacpCP`[");
      MaskPosition maskPosition0 = new MaskPosition();
      MockFile mockFile0 = new MockFile("contains_masks", "emojis");
      createNewStickerSet0.setPngStickerFile((File) mockFile0);
      createNewStickerSet0.setMaskPosition(maskPosition0);
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // point can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.stickers.MaskPosition", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(1871);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket");
      InputFile inputFile0 = new InputFile("mask_position");
      createNewStickerSet0.setPngStickerFile(inputFile0);
      createNewStickerSet0.validate();
      assertEquals("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", createNewStickerSet0.getTitle());
      assertEquals("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", createNewStickerSet0.getName());
      assertEquals("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", createNewStickerSet0.getEmojis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(585);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "Ss9mv5h'", "Ss9mv5h'", "");
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // emojis can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(37);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "K", "K", "K");
      createNewStickerSet0.setEmojis((String) null);
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // emojis can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer(3094);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "B5n8Tmw0z#,6j_", "", "B5n8Tmw0z#,6j_");
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // userId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(1871);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket");
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // PngSticker parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(789);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "", "", "");
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // name can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer((-1771));
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "}", "}", "}");
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // userId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // userId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "9n)}Zfz?Vjn)=3`(Z", " starting at ", "9n)}Zfz?Vjn)=3`(Z");
      try { 
        createNewStickerSet0.deserializeResponse("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      String string0 = createNewStickerSet0.toString();
      assertEquals("CreateNewStickerSet{userId=null, name='null', title='null', emojis='null', containsMasks=null, maskPosition=null, pngSticker=null}", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      // Undeclared exception!
      try { 
        createNewStickerSet0.setPngStickerStream("name", (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pngStickerStream cannot be null!
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      InputFile inputFile0 = createNewStickerSet0.getPngSticker();
      assertNull(inputFile0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      Integer integer0 = createNewStickerSet0.getUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Integer integer0 = new Integer(789);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "", "", "");
      String string0 = createNewStickerSet0.getName();
      assertEquals("", createNewStickerSet0.getTitle());
      assertEquals("", createNewStickerSet0.getEmojis());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      Integer integer0 = new Integer(1802);
      createNewStickerSet0.setUserId(integer0);
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // name can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Integer integer0 = new Integer(1871);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket");
      createNewStickerSet0.getMaskPosition();
      assertEquals("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", createNewStickerSet0.getEmojis());
      assertEquals("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", createNewStickerSet0.getName());
      assertEquals("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Buaket", createNewStickerSet0.getTitle());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Integer integer0 = new Integer(37);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "K", "K", "K");
      String string0 = createNewStickerSet0.getEmojis();
      assertEquals("K", createNewStickerSet0.getName());
      assertEquals("K", createNewStickerSet0.getTitle());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      createNewStickerSet0.setName("?,=a");
      Integer integer0 = new Integer(1802);
      createNewStickerSet0.setUserId(integer0);
      try { 
        createNewStickerSet0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // userId can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer(789);
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "", "", "");
      String string0 = createNewStickerSet0.getTitle();
      assertEquals("", createNewStickerSet0.getEmojis());
      assertEquals("", string0);
      assertEquals("", createNewStickerSet0.getName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet();
      Boolean boolean0 = createNewStickerSet0.getContainsMasks();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer((-1381));
      CreateNewStickerSet createNewStickerSet0 = new CreateNewStickerSet(integer0, "zUuQn }41DDU(tIK4a", "zUuQn }41DDU(tIK4a", "zUuQn }41DDU(tIK4a");
      // Undeclared exception!
      try { 
        createNewStickerSet0.setPngStickerFile((InputFile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pngStickerFile cannot be null!
         //
         verifyException("java.util.Objects", e);
      }
  }
}
