/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 12:47:47 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputContactMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputLocationMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InlineQueryResultLocation_ESTest extends InlineQueryResultLocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(1.0);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setLatitude(float0);
      InlineQueryResultLocation inlineQueryResultLocation2 = inlineQueryResultLocation1.setTitle("thumb_url");
      InlineQueryResultLocation inlineQueryResultLocation3 = inlineQueryResultLocation2.setId("?zbN!etp_f4#");
      InlineQueryResultLocation inlineQueryResultLocation4 = inlineQueryResultLocation3.setLongitude(float0);
      Integer integer0 = new Integer(86400);
      inlineQueryResultLocation1.setLivePeriod(integer0);
      inlineQueryResultLocation2.validate();
      assertSame(inlineQueryResultLocation2, inlineQueryResultLocation4);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(1894.14709);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setId("FI<Ni*e\"J>");
      inlineQueryResultLocation1.setLongitude(float0);
      inlineQueryResultLocation0.setTitle("P");
      Integer integer0 = new Integer(60);
      InlineQueryResultLocation inlineQueryResultLocation2 = inlineQueryResultLocation0.setLivePeriod(integer0);
      inlineQueryResultLocation2.setLatitude(float0);
      inlineQueryResultLocation0.validate();
      assertNull(inlineQueryResultLocation0.getThumbWidth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      inlineQueryResultLocation0.setTitle("O\"");
      String string0 = inlineQueryResultLocation0.getTitle();
      assertEquals("O\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setTitle("");
      String string0 = inlineQueryResultLocation1.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer(0);
      inlineQueryResultLocation0.setThumbWidth(integer0);
      Integer integer1 = inlineQueryResultLocation0.getThumbWidth();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer((-2490));
      inlineQueryResultLocation0.setThumbWidth(integer0);
      Integer integer1 = inlineQueryResultLocation0.getThumbWidth();
      assertEquals((-2490), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer(402);
      inlineQueryResultLocation0.setThumbWidth(integer0);
      Integer integer1 = inlineQueryResultLocation0.getThumbWidth();
      assertEquals(402, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      inlineQueryResultLocation0.setThumbUrl(", livePeriod=");
      String string0 = inlineQueryResultLocation0.getThumbUrl();
      assertEquals(", livePeriod=", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer(2605);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultLocation1.getThumbHeight();
      assertEquals(2605, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer(0);
      inlineQueryResultLocation0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultLocation0.getThumbHeight();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer((-1443));
      inlineQueryResultLocation0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultLocation0.getThumbHeight();
      assertEquals((-1443), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer((-2347));
      inlineQueryResultLocation0.setThumbHeight(integer0);
      Integer integer1 = inlineQueryResultLocation0.getThumbHeight();
      assertEquals((-2347), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(0.0);
      inlineQueryResultLocation0.setLongitude(float0);
      Float float1 = inlineQueryResultLocation0.getLongitude();
      assertEquals(0.0F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float((float) (-953));
      inlineQueryResultLocation0.setLongitude(float0);
      Float float1 = inlineQueryResultLocation0.getLongitude();
      assertEquals((-953.0F), (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float((float) 457);
      inlineQueryResultLocation0.setLongitude(float0);
      Float float1 = inlineQueryResultLocation0.getLongitude();
      assertEquals(457.0F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer(0);
      inlineQueryResultLocation0.setLivePeriod(integer0);
      Integer integer1 = inlineQueryResultLocation0.getLivePeriod();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer(2149);
      inlineQueryResultLocation0.setLivePeriod(integer0);
      Integer integer1 = inlineQueryResultLocation0.getLivePeriod();
      assertEquals(2149, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = new Integer((-3641));
      inlineQueryResultLocation0.setLivePeriod(integer0);
      Integer integer1 = inlineQueryResultLocation0.getLivePeriod();
      assertEquals((-3641), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(0.0);
      inlineQueryResultLocation0.setLatitude(float0);
      Float float1 = inlineQueryResultLocation0.getLatitude();
      assertEquals(0.0F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(280.0);
      inlineQueryResultLocation0.setLatitude(float0);
      Float float1 = inlineQueryResultLocation0.getLatitude();
      assertEquals(280.0F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float((double) (-1036));
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setLatitude(float0);
      Float float1 = inlineQueryResultLocation1.getLatitude();
      assertEquals((-1036.0F), (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InputLocationMessageContent inputLocationMessageContent0 = new InputLocationMessageContent();
      inlineQueryResultLocation0.setInputMessageContent(inputLocationMessageContent0);
      InputLocationMessageContent inputLocationMessageContent1 = (InputLocationMessageContent)inlineQueryResultLocation0.getInputMessageContent();
      assertNull(inputLocationMessageContent1.getLivePeriod());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      inlineQueryResultLocation0.setId("[K5_r\"N LR");
      String string0 = inlineQueryResultLocation0.getId();
      assertEquals("[K5_r\"N LR", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      inlineQueryResultLocation0.setId("");
      String string0 = inlineQueryResultLocation0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(1894.14709);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setId("FI<Ni*e\"J>");
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      InlineQueryResultLocation inlineQueryResultLocation2 = inlineQueryResultLocation1.setReplyMarkup(inlineKeyboardMarkup0);
      inlineQueryResultLocation1.setLongitude(float0);
      inlineQueryResultLocation2.setTitle("P");
      inlineQueryResultLocation1.setLatitude(float0);
      inlineQueryResultLocation0.validate();
      assertNull(inlineQueryResultLocation0.getThumbHeight());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(1894.14709);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setLatitude(float0);
      inlineQueryResultLocation1.setId("FI<Ni*e\"J>");
      InlineQueryResultLocation inlineQueryResultLocation2 = inlineQueryResultLocation0.setTitle("FI<Ni*e\"J>");
      InputContactMessageContent inputContactMessageContent0 = new InputContactMessageContent();
      InlineQueryResultLocation inlineQueryResultLocation3 = inlineQueryResultLocation0.setInputMessageContent(inputContactMessageContent0);
      inlineQueryResultLocation2.setLongitude(float0);
      try { 
        inlineQueryResultLocation3.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // PhoneNumber parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputContactMessageContent", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setId(", title='");
      Integer integer0 = new Integer((-1));
      InlineQueryResultLocation inlineQueryResultLocation2 = inlineQueryResultLocation1.setLivePeriod(integer0);
      Float float0 = new Float((float) (-1));
      InlineQueryResultLocation inlineQueryResultLocation3 = inlineQueryResultLocation2.setLatitude(float0);
      inlineQueryResultLocation3.setLongitude(float0);
      inlineQueryResultLocation3.setTitle(", title='");
      try { 
        inlineQueryResultLocation1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Live period parameter must be between 60 and 86400
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(1894.14709);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setId("FI<Ni*e\"J>");
      inlineQueryResultLocation0.setTitle("P");
      inlineQueryResultLocation1.setLatitude(float0);
      try { 
        inlineQueryResultLocation0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Longitude parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setId("/");
      inlineQueryResultLocation1.setTitle("");
      try { 
        inlineQueryResultLocation0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Title parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setId(", title='");
      inlineQueryResultLocation1.setTitle(", title='");
      try { 
        inlineQueryResultLocation1.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Latitude parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      inlineQueryResultLocation0.setId("");
      try { 
        inlineQueryResultLocation0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ID parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      try { 
        inlineQueryResultLocation0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ID parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = inlineQueryResultLocation0.getLongitude();
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = inlineQueryResultLocation0.getThumbHeight();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = inlineQueryResultLocation0.getThumbWidth();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setThumbUrl("");
      String string0 = inlineQueryResultLocation1.getThumbUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      String string0 = inlineQueryResultLocation0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InputMessageContent inputMessageContent0 = inlineQueryResultLocation0.getInputMessageContent();
      assertNull(inputMessageContent0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Integer integer0 = inlineQueryResultLocation0.getLivePeriod();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      String string0 = inlineQueryResultLocation0.getType();
      assertEquals("location", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      String string0 = inlineQueryResultLocation0.toString();
      assertEquals("InlineQueryResultLocation{type='location', id='null', title='null', latitude=null, longitude=null, replyMarkup=null, inputMessageContent=null, thumbUrl='null', thumbWidth=null, thumbHeight=null, livePeriod=null}", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      inlineQueryResultLocation0.setId("FI<Ni*e\"J>");
      try { 
        inlineQueryResultLocation0.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Title parameter can't be empty
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      String string0 = inlineQueryResultLocation0.getThumbUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = inlineQueryResultLocation0.getReplyMarkup();
      assertNull(inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = inlineQueryResultLocation0.getLatitude();
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      InlineKeyboardMarkup inlineKeyboardMarkup0 = new InlineKeyboardMarkup();
      inlineQueryResultLocation0.setReplyMarkup(inlineKeyboardMarkup0);
      InlineKeyboardMarkup inlineKeyboardMarkup1 = inlineQueryResultLocation0.getReplyMarkup();
      assertSame(inlineKeyboardMarkup1, inlineKeyboardMarkup0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      Float float0 = new Float(1.0);
      InlineQueryResultLocation inlineQueryResultLocation1 = inlineQueryResultLocation0.setLatitude(float0);
      InlineQueryResultLocation inlineQueryResultLocation2 = inlineQueryResultLocation1.setTitle("thumb_url");
      InlineQueryResultLocation inlineQueryResultLocation3 = inlineQueryResultLocation2.setId("thumb_url");
      InlineQueryResultLocation inlineQueryResultLocation4 = inlineQueryResultLocation3.setLongitude(float0);
      Integer integer0 = new Integer(86411);
      inlineQueryResultLocation1.setLivePeriod(integer0);
      try { 
        inlineQueryResultLocation4.validate();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Live period parameter must be between 60 and 86400
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InlineQueryResultLocation inlineQueryResultLocation0 = new InlineQueryResultLocation();
      String string0 = inlineQueryResultLocation0.getTitle();
      assertNull(string0);
  }
}
