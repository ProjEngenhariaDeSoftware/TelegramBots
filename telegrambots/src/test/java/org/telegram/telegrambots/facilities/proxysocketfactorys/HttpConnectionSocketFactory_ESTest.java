/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 22 18:26:08 GMT 2018
 */

package org.telegram.telegrambots.facilities.proxysocketfactorys;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import org.apache.http.HttpHost;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.telegram.telegrambots.facilities.proxysocketfactorys.HttpConnectionSocketFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnectionSocketFactory_ESTest extends HttpConnectionSocketFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      // Undeclared exception!
      try { 
        httpConnectionSocketFactory0.createSocket((HttpContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.facilities.proxysocketfactorys.HttpConnectionSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      BasicHttpContext basicHttpContext0 = new BasicHttpContext();
      basicHttpContext0.setAttribute("socketAddress", "socketAddress");
      // Undeclared exception!
      try { 
        httpConnectionSocketFactory0.createSocket(basicHttpContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.net.InetSocketAddress
         //
         verifyException("org.telegram.telegrambots.facilities.proxysocketfactorys.HttpConnectionSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      HttpCoreContext httpCoreContext0 = new HttpCoreContext();
      PlainConnectionSocketFactory plainConnectionSocketFactory0 = PlainConnectionSocketFactory.getSocketFactory();
      Socket socket0 = plainConnectionSocketFactory0.createSocket(httpCoreContext0);
      HttpHost httpHost0 = new HttpHost("http.target_host", 0, "");
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("O0X~EO-N)%%cq#9", 489);
      try { 
        httpConnectionSocketFactory0.connectSocket(0, socket0, httpHost0, inetSocketAddress0, inetSocketAddress0, httpCoreContext0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Unresolved address
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("A<SLE4Z%!xM`rwc:u4", 0);
      HttpCoreContext httpCoreContext0 = new HttpCoreContext();
      // Undeclared exception!
      try { 
        httpConnectionSocketFactory0.connectSocket(17, (Socket) null, (HttpHost) null, mockInetSocketAddress0, mockInetSocketAddress0, httpCoreContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.telegram.telegrambots.facilities.proxysocketfactorys.HttpConnectionSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(56);
      HttpCoreContext httpCoreContext0 = new HttpCoreContext();
      Object object0 = new Object();
      httpCoreContext0.setAttribute("socketAddress", object0);
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      HttpHost httpHost0 = new HttpHost("http.response", 56);
      // Undeclared exception!
      try { 
        httpConnectionSocketFactory0.connectSocket(56, (Socket) null, httpHost0, mockInetSocketAddress0, mockInetSocketAddress0, httpCoreContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.net.InetSocketAddress
         //
         verifyException("org.telegram.telegrambots.facilities.proxysocketfactorys.HttpConnectionSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      BasicHttpContext basicHttpContext0 = new BasicHttpContext();
      // Undeclared exception!
      try { 
        httpConnectionSocketFactory0.createSocket(basicHttpContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // type HTTP is not compatible with address null
         //
         verifyException("java.net.Proxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      HttpHost httpHost0 = new HttpHost(inetAddress0, (-844));
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("http", 0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 0);
      HttpCoreContext httpCoreContext0 = HttpCoreContext.create();
      // Undeclared exception!
      try { 
        httpConnectionSocketFactory0.connectSocket((-844), (Socket) null, httpHost0, inetSocketAddress0, mockInetSocketAddress0, httpCoreContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // type HTTP is not compatible with address null
         //
         verifyException("java.net.Proxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HttpConnectionSocketFactory httpConnectionSocketFactory0 = new HttpConnectionSocketFactory();
      MockSocket mockSocket0 = new MockSocket();
      HttpHost httpHost0 = new HttpHost("(k8F1*'/<?a39n", 1, "(k8F1*'/<?a39n");
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("org.telegram.telegrambots.facilities.proxysocketfactorys.HttpConnectionSocketFactory", 0);
      HttpCoreContext httpCoreContext0 = HttpCoreContext.create();
      try { 
        httpConnectionSocketFactory0.connectSocket(0, mockSocket0, httpHost0, mockInetSocketAddress0, mockInetSocketAddress0, httpCoreContext0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // (k8F1*'/<?a39n
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }
}
