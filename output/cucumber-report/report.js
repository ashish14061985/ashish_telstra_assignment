$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Invalid_Email_Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Incorrect user email verification",
  "description": "",
  "id": "incorrect-user-email-verification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression1"
    }
  ]
});
formatter.before({
  "duration": 6454454263,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate user is able to register successfully",
  "description": "",
  "id": "incorrect-user-email-verification;validate-user-is-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@validate_invlaid_emailId"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User open automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user clicks on the SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be directed to \"AUTHENTICATION\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should provide an Invalid email address",
  "rows": [
    {
      "cells": [
        "jane"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the \"Create an account\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user should see the following error message",
  "rows": [
    {
      "cells": [
        "Invalid email address."
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRegistration.userOpenAutomationpracticeWebsite()"
});
formatter.result({
  "duration": 9354469462,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.theUserClicksOnTheSignInLink()"
});
formatter.result({
  "duration": 2811317945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTHENTICATION",
      "offset": 28
    }
  ],
  "location": "NewUserRegistration.userShouldBeDirectedToPage(String)"
});
formatter.result({
  "duration": 3537774,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.userShouldProvideAnInvalidEmailAddress(DataTable)"
});
formatter.result({
  "duration": 199687823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create an account",
      "offset": 20
    }
  ],
  "location": "NewUserRegistration.userClicksOnTheButton(String)"
});
formatter.result({
  "duration": 250110000,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.userShouldSeeTheFollowingErrorMessage(DataTable)"
});
formatter.result({
  "duration": 991549341,
  "status": "passed"
});
formatter.after({
  "duration": 1161048745,
  "status": "passed"
});
});