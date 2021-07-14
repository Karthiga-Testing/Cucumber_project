$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/amazon.feature");
formatter.feature({
  "name": "",
  "description": "To validate the searching functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To verify the search text field with some product",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has to launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition4.user_has_to_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter the url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition4.user_will_enter_the_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d91.0.4472.124)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:63558}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 29904c729371698f7976ff4ced09ddd0\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat org.pom.BaseClass.maximize(BaseClass.java:26)\r\n\tat org.step.StepDefinition4.user_will_enter_the_url(StepDefinition4.java:24)\r\n\tat ✽.user will enter the url(file:src/test/resources/amazon.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to enter some product name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition4.user_has_to_enter_some_product_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition4.user_have_to_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user get the product to visible",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition4.user_get_the_product_to_visible()"
});
formatter.result({
  "status": "skipped"
});
});