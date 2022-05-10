$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking The Hotel Booking Functionality Of Adactin Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Should Launch The URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Will Click On Login Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "abc",
        "9876"
      ],
      "line": 10,
      "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "hij",
        "0987"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1766600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Should Launch The URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"abc\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"9876\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Will Click On Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Should_Launch_The_URL()"
});
formatter.result({
  "duration": 85103790800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 208651000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9876",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 89652100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Will_Click_On_Login_Button()"
});
formatter.result({
  "duration": 1736281300,
  "status": "passed"
});
formatter.after({
  "duration": 230500,
  "status": "passed"
});
formatter.before({
  "duration": 693100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Should Launch The URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"hij\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"0987\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Will Click On Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Should_Launch_The_URL()"
});
formatter.result({
  "duration": 370810800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hij",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 118447200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0987",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 84249100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Will_Click_On_Login_Button()"
});
formatter.result({
  "duration": 456929600,
  "status": "passed"
});
formatter.after({
  "duration": 132500,
  "status": "passed"
});
formatter.before({
  "duration": 280500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user Select \"New York\" In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Select  \"3\" In The Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select  \"Super Deluxe\" In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select \"2\" In The No Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select \"1 - One\" In The Adults Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select \"1 - One\" In The Children Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Will Click On Search Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Select_In_The_Location_Field(String)"
});
formatter.result({
  "duration": 45570900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#location\"}\n  (Session info: chrome\u003d101.0.4951.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-UAOKD3K\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.54, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50976}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b030f19ee3214e6bd704a8d9c6da538\n*** Element info: {Using\u003did, value\u003dlocation}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.Maven_Cuc.BaseClass.selectByValue(BaseClass.java:184)\r\n\tat com.stepdefinition.Step_Definition.user_Select_In_The_Location_Field(Step_Definition.java:60)\r\n\tat ✽.When user Select \"New York\" In The Location Field(Adactin.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Select_In_The_Hotel_Field(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Select_In_The_Room_Type_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Select_In_The_No_Of_Rooms_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Select_In_The_Adults_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Select_In_The_Children_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.user_Will_Click_On_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 466849800,
  "status": "passed"
});
formatter.before({
  "duration": 139900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Select The Hotel Information",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Will Click On Continue Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_Information()"
});
formatter.result({
  "duration": 20917300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#radiobutton_0\"}\n  (Session info: chrome\u003d101.0.4951.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-UAOKD3K\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.54, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50976}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b030f19ee3214e6bd704a8d9c6da538\n*** Element info: {Using\u003did, value\u003dradiobutton_0}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.Maven_Cuc.BaseClass.clickOnElement(BaseClass.java:72)\r\n\tat com.stepdefinition.Step_Definition.user_Select_The_Hotel_Information(Step_Definition.java:95)\r\n\tat ✽.When user Select The Hotel Information(Adactin.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step_Definition.user_Will_Click_On_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 428942300,
  "status": "passed"
});
formatter.before({
  "duration": 118300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Book Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;book-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user Enters The First Name In The Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enters The Last Name In The Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enters The Address In The Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enters The Creditcard No In The Creditcard Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select The \"VISA\" Type In The Creditcard Type  Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The \"January\" In The Expiry Date  Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The \"2012\" In The Expiry Year  Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enters The Cvv Number No In The Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Will Click On Booknow Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_First_Name_In_The_Firstname_Field()"
});
formatter.result({
  "duration": 41295900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#first_name\"}\n  (Session info: chrome\u003d101.0.4951.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-UAOKD3K\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.54, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50976}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b030f19ee3214e6bd704a8d9c6da538\n*** Element info: {Using\u003did, value\u003dfirst_name}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat com.Maven_Cuc.BaseClass.passInput(BaseClass.java:67)\r\n\tat com.stepdefinition.Step_Definition.user_Enters_The_First_Name_In_The_Firstname_Field(Step_Definition.java:106)\r\n\tat ✽.When user Enters The First Name In The Firstname Field(Adactin.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Last_Name_In_The_Lastname_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Address_In_The_Address_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Creditcard_No_In_The_Creditcard_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Type_In_The_Creditcard_Type_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "January",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Expiry_Date_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2012",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Expiry_Year_Field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Cvv_Number_No_In_The_Cvv_Number_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.user_Will_Click_On_Booknow_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 480711700,
  "status": "passed"
});
formatter.before({
  "duration": 123100,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Logout Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-adactin-application;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "user Will Click On Logout Button",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Will_Click_On_Logout_Button()"
});
formatter.result({
  "duration": 42029500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Logout\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-UAOKD3K\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.54, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50976}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b030f19ee3214e6bd704a8d9c6da538\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Logout\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.Maven_Cuc.BaseClass.clickOnElement(BaseClass.java:72)\r\n\tat com.stepdefinition.Step_Definition.user_Will_Click_On_Logout_Button(Step_Definition.java:155)\r\n\tat ✽.When user Will Click On Logout Button(Adactin.feature:40)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 469262500,
  "status": "passed"
});
});