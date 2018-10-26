/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 26 13:43:19 GMT 2018
 */

package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.meta.api.objects.ResponseParameters;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ApiResponse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ApiResponse_ESTest extends ApiResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApiResponse<Object> apiResponse0 = new ApiResponse<Object>();
      // Undeclared exception!
      try { 
        apiResponse0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.meta.api.objects.replykeyboard.ApiResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApiResponse<Object> apiResponse0 = new ApiResponse<Object>();
      Integer integer0 = apiResponse0.getErrorCode();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ApiResponse<String> apiResponse0 = new ApiResponse<String>();
      ResponseParameters responseParameters0 = apiResponse0.getParameters();
      assertNull(responseParameters0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ApiResponse<String> apiResponse0 = new ApiResponse<String>();
      String string0 = apiResponse0.getResult();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ApiResponse<String> apiResponse0 = new ApiResponse<String>();
      String string0 = apiResponse0.getErrorDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ApiResponse<String> apiResponse0 = new ApiResponse<String>();
      Boolean boolean0 = apiResponse0.getOk();
      assertNull(boolean0);
  }
}
