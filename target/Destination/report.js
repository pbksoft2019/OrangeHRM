$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/logInInVadilData.feature");
formatter.feature({
  "name": "user should not be able to log in with invalid credentials or empty field",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user should not be able to log in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user enters username as\"\u003cUsername\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on Login",
  "keyword": "And "
});
formatter.step({
  "name": "user should see \"\u003cErrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "ErrorMessage"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin1234",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "admin",
        "admin1234",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin1234",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "admin",
        "Admin123",
        "Invalid credentials"
      ]
    },
    {
      "cells": [
        "",
        "admin123",
        "Username cannot be empty"
      ]
    },
    {
      "cells": [
        "Admin",
        "",
        "Password cannot be empty"
      ]
    },
    {
      "cells": [
        "",
        "",
        "Username cannot be empty"
      ]
    },
    {
      "cells": [
        "",
        "Admin123",
        "Username cannot be empty"
      ]
    },
    {
      "cells": [
        "admin",
        "",
        "Password cannot be empty"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user should not be able to log in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user enters username as\"Admin\" and password as \"admin1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userEntersUsernameAsAndPasswordAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userClicksOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userShouldSeeErrorMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user should not be able to log in with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user enters username as\"admin\" and password as \"admin1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userEntersUsernameAsAndPasswordAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userClicksOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userShouldSeeErrorMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
