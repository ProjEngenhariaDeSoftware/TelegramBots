/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 12:57:06 GMT 2018
 */

package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EditMessageMedia_ESTest extends EditMessageMedia_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Integer integer0 = new Integer(1628);
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setMessageId(integer0);
      Integer integer1 = editMessageMedia1.getMessageId();
      assertEquals(1628, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Integer integer0 = new Integer((-1623));
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setMessageId(integer0);
      Integer integer1 = editMessageMedia1.getMessageId();
      assertEquals((-1623), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      editMessageMedia0.setInlineMessageId("reply_markup");
      String string0 = editMessageMedia0.getInlineMessageId();
      assertEquals("reply_markup", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      editMessageMedia0.setInlineMessageId("");
      String string0 = editMessageMedia0.getInlineMessageId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setChatId("chat_id");
      String string0 = editMessageMedia1.getChatId();
      assertEquals("chat_id", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setChatId("");
      String string0 = editMessageMedia1.getChatId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      // Undeclared exception!
      try { 
        editMessageMedia0.setChatId((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      // Undeclared exception!
      try { 
        editMessageMedia0.deserializeResponse("{}74s}.S6mM0#wx0G>:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Long long0 = new Long(1049L);
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setChatId(long0);
      InputMedia<String> inputMedia0 = (InputMedia<String>) mock(InputMedia.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(inputMedia0).toString();
      editMessageMedia1.setMedia(inputMedia0);
      Integer integer0 = new Integer(0);
      EditMessageMedia editMessageMedia2 = editMessageMedia1.setMessageId(integer0);
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      editMessageMedia0.setReplyMarkup(inlineKeyboardMarkup0);
      editMessageMedia0.validate();
      assertSame(editMessageMedia0, editMessageMedia2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Long long0 = new Long(1049L);
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setChatId(long0);
      InputMedia<String> inputMedia0 = (InputMedia<String>) mock(InputMedia.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(inputMedia0).toString();
      editMessageMedia1.setMedia(inputMedia0);
      Integer integer0 = new Integer(0);
      editMessageMedia1.setMessageId(integer0);
      editMessageMedia0.validate();
      assertEquals(0, (int)editMessageMedia0.getMessageId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setInlineMessageId("message_id");
      Integer integer0 = new Integer(102);
      editMessageMedia1.setMessageId(integer0);
      try { 
        editMessageMedia1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // MessageId parameter must be empty if inlineMessageId is provided
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setInlineMessageId("inline_message_id");
      Long long0 = new Long(3275);
      editMessageMedia1.setChatId(long0);
      try { 
        editMessageMedia0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId parameter must be empty if inlineMessageId is provided
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Long long0 = new Long(1049L);
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setChatId(long0);
      Integer integer0 = new Integer(0);
      editMessageMedia1.setMessageId(integer0);
      try { 
        editMessageMedia0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Text parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Long long0 = new Long(1049L);
      editMessageMedia0.setChatId(long0);
      try { 
        editMessageMedia0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // MessageId parameter can't be empty if inlineMessageId is not present
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      try { 
        editMessageMedia0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ChatId parameter can't be empty if inlineMessageId is not present
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      try { 
        editMessageMedia0.deserializeResponse("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to deserialize response
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      editMessageMedia0.setInlineMessageId("inline_message_id");
      try { 
        editMessageMedia0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Text parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = editMessageMedia0.getReplyMarkup();
      assertNull(inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      String string0 = editMessageMedia0.toString();
      assertEquals("EditMessageMedia{chatId='null', messageId=null, inlineMessageId='null', media=null, replyMarkup=null}", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Integer integer0 = new Integer(0);
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setMessageId(integer0);
      Integer integer1 = editMessageMedia1.getMessageId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      InputMedia<Object> inputMedia0 = editMessageMedia0.getMedia();
      assertNull(inputMedia0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      String string0 = editMessageMedia0.getChatId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      Integer integer0 = editMessageMedia0.getMessageId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      String string0 = editMessageMedia0.getInlineMessageId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EditMessageMedia editMessageMedia0 = new EditMessageMedia();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      EditMessageMedia editMessageMedia1 = editMessageMedia0.setReplyMarkup(inlineKeyboardMarkup0);
      InlineKeyboardMarkup inlineKeyboardMarkup1 = editMessageMedia1.getReplyMarkup();
      assertSame(inlineKeyboardMarkup1, inlineKeyboardMarkup0);
  }
}
