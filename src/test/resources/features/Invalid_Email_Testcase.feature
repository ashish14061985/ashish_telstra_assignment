@regression
Feature: Incorrect user email verification
  @validate_invlaid_emailId
  Scenario: Validate user is able to register successfully
    Given User open automationpractice website
    When the user clicks on the SignIn link
    Then user should be directed to "AUTHENTICATION" page

    Then user should provide an Invalid email address
      |jane_@|
    Then user clicks on the "Create an account" button
    Then user should see the following error message
      |Invalid email address.|