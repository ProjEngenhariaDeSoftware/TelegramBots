/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:14:00 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.inlinequery.result.chached;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputContactMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputVenueMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.chached.InlineQueryResultCachedAudio;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InlineQueryResultCachedAudio_ESTest extends InlineQueryResultCachedAudio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setParseMode(", caption='");
      String string0 = inlineQueryResultCachedAudio0.getParseMode();
      assertEquals(", caption='", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setParseMode("");
      String string0 = inlineQueryResultCachedAudio0.getParseMode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InputContactMessageContent inputContactMessageContent0 = new InputContactMessageContent();
      inlineQueryResultCachedAudio0.setInputMessageContent(inputContactMessageContent0);
      InputContactMessageContent inputContactMessageContent1 = (InputContactMessageContent)inlineQueryResultCachedAudio0.getInputMessageContent();
      assertNull(inputContactMessageContent1.getLastName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setId("= $hb1");
      String string0 = inlineQueryResultCachedAudio0.getId();
      assertEquals("= $hb1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setId("");
      String string0 = inlineQueryResultCachedAudio1.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setCaption("");
      String string0 = inlineQueryResultCachedAudio1.getCaption();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setAudioFileId("\"h5BXlFJH}PML?q");
      String string0 = inlineQueryResultCachedAudio0.getAudioFileId();
      assertEquals("\"h5BXlFJH}PML?q", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setAudioFileId("");
      String string0 = inlineQueryResultCachedAudio0.getAudioFileId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setAudioFileId("Longitude parameter can't be empty");
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio2 = inlineQueryResultCachedAudio1.setId("longitude");
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      LinkedList<List<InlineKeyboardButton>> linkedList0 = new LinkedList<List<InlineKeyboardButton>>();
      InlineKeyboardMarkup inlineKeyboardMarkup1 = inlineKeyboardMarkup0.setKeyboard(linkedList0);
      inlineQueryResultCachedAudio2.setReplyMarkup(inlineKeyboardMarkup1);
      linkedList0.add((List<InlineKeyboardButton>) null);
      // Undeclared exception!
      try { 
        inlineQueryResultCachedAudio1.validate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setAudioFileId("UkFDh>xiWlYK2");
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio2 = inlineQueryResultCachedAudio1.setReplyMarkup(inlineKeyboardMarkup0);
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio3 = inlineQueryResultCachedAudio2.setId("UkFDh>xiWlYK2");
      inlineQueryResultCachedAudio0.validate();
      assertSame(inlineQueryResultCachedAudio0, inlineQueryResultCachedAudio3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setAudioFileId("9`");
      InputVenueMessageContent inputVenueMessageContent0 = new InputVenueMessageContent();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setInputMessageContent(inputVenueMessageContent0);
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio2 = inlineQueryResultCachedAudio1.setId("9`");
      try { 
        inlineQueryResultCachedAudio2.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Latitude parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputVenueMessageContent", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setId("[+:");
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio2 = inlineQueryResultCachedAudio1.setAudioFileId("");
      try { 
        inlineQueryResultCachedAudio2.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // AudioFileId parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.chached.InlineQueryResultCachedAudio", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setId("");
      try { 
        inlineQueryResultCachedAudio1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ID parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.chached.InlineQueryResultCachedAudio", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      try { 
        inlineQueryResultCachedAudio0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ID parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.chached.InlineQueryResultCachedAudio", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setCaption("UkFDh>xiWlYK2");
      String string0 = inlineQueryResultCachedAudio0.getCaption();
      assertEquals("UkFDh>xiWlYK2", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      String string0 = inlineQueryResultCachedAudio0.getCaption();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      String string0 = inlineQueryResultCachedAudio0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      String string0 = inlineQueryResultCachedAudio0.getType();
      assertEquals("audio", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      String string0 = inlineQueryResultCachedAudio0.toString();
      assertEquals("InlineQueryResultCachedAudio{type='audio', id='null', audioFileId='null', inputMessageContent=null, replyMarkup=null, caption='null', parseMode='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      String string0 = inlineQueryResultCachedAudio0.getParseMode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = inlineQueryResultCachedAudio0.getReplyMarkup();
      assertNull(inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio1 = inlineQueryResultCachedAudio0.setAudioFileId("UkFDh>xiWlYK2");
      inlineQueryResultCachedAudio1.setId("UkFDh>xiWlYK2");
      inlineQueryResultCachedAudio0.validate();
      assertSame(inlineQueryResultCachedAudio0, inlineQueryResultCachedAudio1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      inlineQueryResultCachedAudio0.setReplyMarkup(inlineKeyboardMarkup0);
      InlineKeyboardMarkup inlineKeyboardMarkup1 = inlineQueryResultCachedAudio0.getReplyMarkup();
      assertSame(inlineKeyboardMarkup1, inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      String string0 = inlineQueryResultCachedAudio0.getAudioFileId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      inlineQueryResultCachedAudio0.setId("UkFDh>xiWlYK2");
      try { 
        inlineQueryResultCachedAudio0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // AudioFileId parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.chached.InlineQueryResultCachedAudio", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InlineQueryResultCachedAudio inlineQueryResultCachedAudio0 = new InlineQueryResultCachedAudio();
      InputMessageContent inputMessageContent0 = inlineQueryResultCachedAudio0.getInputMessageContent();
      assertNull(inputMessageContent0);
  }
}
