@regression
Feature: Validate customer able to create account and register successfully
  @registeruser
  Scenario: Validate user is able to register successfully
    Given User open automationpractice website
    When the user clicks on the SignIn link
    Then user should be directed to "AUTHENTICATION" page

    Then user should provide a valid email address
    Then user clicks on the "Create an account" button

    Then user click and select the "Title"
      |Mr.|
    Then user enters the "First Name"
      |Jane|
    Then user enters the "Last Name"
      |Merchant|
    Then user enters the "password"
      |password|
    Then user enters selects the "DOB" as day, month and yeat
      |Day|Month|Year|
      | 14 |June |1985|
    Then user enters the "Address"
      |5/21 Hart St.|
    Then user enters the "city"
      |Kew|
    Then user selects the "State"
      |New York|
    Then user enters the "Postcode"
      |04040|
    Then user enters the "Mobile phone"
      |0412579402|

    Then user clicks the "Register" button
    Then user should be directed to "MY ACCOUNT" page