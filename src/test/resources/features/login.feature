Feature: amazon app login
  User Story:
  As a user, I should be able to login with correct credentials
@wip
  Scenario: login as a user
    Given user is on main page
    When  user navigates to sign in button in upper right corner
    When user enters username
    And user enters password
    Then user should see dashboard





