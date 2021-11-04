Feature: Sign up
  Scenario: Student should be able to register with valid email
    Given I am at talentTEK home page
    And I click on create Aew Account button
    And I enter valid student information
    When I click on Create my account button
    Then I should see Thank yo for sign up message
