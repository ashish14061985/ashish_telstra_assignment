$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/EclipseWorkspace/telstra_project/src/test/resources/features/Register_Account_Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Validate customer able to create account and register successfully",
  "description": "",
  "id": "validate-customer-able-to-create-account-and-register-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 7120298116,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate user is able to register successfully",
  "description": "",
  "id": "validate-customer-able-to-create-account-and-register-successfully;validate-user-is-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@registeruser"
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
  "name": "user should provide a valid email address",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the \"Create an account\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click and select the \"Title\"",
  "rows": [
    {
      "cells": [
        "Mr."
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters the \"First Name\"",
  "rows": [
    {
      "cells": [
        "Jane"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enters the \"Last Name\"",
  "rows": [
    {
      "cells": [
        "Merchant"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters the \"password\"",
  "rows": [
    {
      "cells": [
        "password"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enters selects the \"DOB\" as day, month and yeat",
  "rows": [
    {
      "cells": [
        "Day",
        "Month",
        "Year"
      ],
      "line": 21
    },
    {
      "cells": [
        "14",
        "June",
        "1985"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user enters the \"Address\"",
  "rows": [
    {
      "cells": [
        "5/21 Hart St."
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user enters the \"city\"",
  "rows": [
    {
      "cells": [
        "Kew"
      ],
      "line": 26
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user selects the \"State\"",
  "rows": [
    {
      "cells": [
        "New York"
      ],
      "line": 28
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user enters the \"Postcode\"",
  "rows": [
    {
      "cells": [
        "04040"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user enters the \"Mobile phone\"",
  "rows": [
    {
      "cells": [
        "0412579402"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks the \"Register\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user should be directed to \"MY ACCOUNT\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRegistration.userOpenAutomationpracticeWebsite()"
});
formatter.result({
  "duration": 12629787440,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.theUserClicksOnTheSignInLink()"
});
formatter.result({
  "duration": 3955563151,
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
  "duration": 371934780,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.userShouldProvideAValidEmailAddress()"
});
formatter.result({
  "duration": 1050951066,
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
  "duration": 223058913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Title",
      "offset": 27
    }
  ],
  "location": "NewUserRegistration.userSelectsThe(String,DataTable)"
});
formatter.result({
  "duration": 1902639197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First Name",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 420843182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Last Name",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 255805995,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 404989417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DOB",
      "offset": 25
    }
  ],
  "location": "NewUserRegistration.userEntersSelectsTheAsDayMonthAndYeat(String,DataTable)"
});
formatter.result({
  "duration": 466564474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 316633497,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "city",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 122856779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "State",
      "offset": 18
    }
  ],
  "location": "NewUserRegistration.userSelectsTheList(String,DataTable)"
});
formatter.result({
  "duration": 306751283,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Postcode",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 160054969,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile phone",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userEntersThe(String,DataTable)"
});
formatter.result({
  "duration": 316987274,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 17
    }
  ],
  "location": "NewUserRegistration.userClicksTheButton(String)"
});
formatter.result({
  "duration": 3147283869,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY ACCOUNT",
      "offset": 28
    }
  ],
  "location": "NewUserRegistration.userShouldBeDirectedToPage(String)"
});
formatter.result({
  "duration": 95111,
  "status": "passed"
});
formatter.after({
  "duration": 1164632298,
  "status": "passed"
});
});