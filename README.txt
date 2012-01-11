This small project is used for reproduce the bug in test ng 6.3.1

When you define a method inceptor listener in 6.3.1, it will be called twice. The related stack trace could be found as follows:

[TestNG] Running:
  C:\Users\etigwuu\workspace\methodinceptor-bugdemo\src\main\java\org\testng\bugreproduce\testng.xml

I was called 1 times
-------------STACK TRACE-------------
java.lang.Thread.getStackTrace(Unknown Source)
org.testng.bugreproduce.MyInceptor.intercept(MyInceptor.java:16)
org.testng.TestRunner.intercept(TestRunner.java:778)
org.testng.TestRunner.privateRun(TestRunner.java:724)
org.testng.TestRunner.run(TestRunner.java:613)
org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
org.testng.SuiteRunner.run(SuiteRunner.java:240)
org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:87)
org.testng.TestNG.runSuitesSequentially(TestNG.java:1137)
org.testng.TestNG.runSuitesLocally(TestNG.java:1062)
org.testng.TestNG.run(TestNG.java:974)
org.testng.TestNG.privateMain(TestNG.java:1282)
org.testng.TestNG.main(TestNG.java:1246)
org.testng.bugreproduce.Main.main(Main.java:9)
I was called 2 times
-------------STACK TRACE-------------
java.lang.Thread.getStackTrace(Unknown Source)
org.testng.bugreproduce.MyInceptor.intercept(MyInceptor.java:16)
org.testng.TestRunner.createClassBasedParallelWorkers(TestRunner.java:837)
org.testng.TestRunner.createWorkers(TestRunner.java:802)
org.testng.TestRunner.privateRun(TestRunner.java:756)
org.testng.TestRunner.run(TestRunner.java:613)
org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
org.testng.SuiteRunner.run(SuiteRunner.java:240)
org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:87)
org.testng.TestNG.runSuitesSequentially(TestNG.java:1137)
org.testng.TestNG.runSuitesLocally(TestNG.java:1062)
org.testng.TestNG.run(TestNG.java:974)
org.testng.TestNG.privateMain(TestNG.java:1282)
org.testng.TestNG.main(TestNG.java:1246)
org.testng.bugreproduce.Main.main(Main.java:9)

===============================================
Suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================

