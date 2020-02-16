$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UndosTres_Payment.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open the site \"https://prueba.undostres.com.mx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.HomePage.open_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Operador as \"Telcel\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.HomePage.select_Operador_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Mobile number as \"5523261151\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePage.enter_Mobile_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Recharge amount as \"$10\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePage.enter_Recharge_amount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Siguiente",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePage.click_on_Siguiente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Payment Page landed",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.verify_Payment_Page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(@class,\u0027messageShowTop\u0027)]//b[text()\u003d\u00275523261151\u0027 or text()\u003d\u0027Telcel\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.106)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027ABHII-PC\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002711.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.106, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\Abhii\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50231}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 92e3d217809c45d236392fa5f741ad78\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(@class,\u0027messageShowTop\u0027)]//b[text()\u003d\u00275523261151\u0027 or text()\u003d\u0027Telcel\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepDefinitions.PaymentPage.verify_Payment_Page(PaymentPage.java:19)\r\n\tat ✽.Verify Payment Page landed(file:///C:/Users/Abhii/eclipse-workspace/SampleGradle/src/test/resources/features/UndosTres_Payment.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter cardname as \"Test\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.enter_cardname(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter cardnumber as \"4111111111111111\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.enter_cardnumber(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter month as \"11\" and year as \"2025\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.enter_month_and_year(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter CVV as \"111\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.enter_CVV(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter cardmail as \"test@test.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.enter_cardmail(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Pagar con Tarjeta",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PaymentPage.click_on_Pagar_con_Tarjeta()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter email as \"marze.zr@gmail.com\"",
  "keyword": "* "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter password as \"123456\"",
  "keyword": "* "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});