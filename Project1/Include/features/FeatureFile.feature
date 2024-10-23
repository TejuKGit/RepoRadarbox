@tag
Feature: Give details in airport view
 
  @tag1
  Scenario Outline: Title of your scenario outline
    Given User navigates to the radarbox page
    When User Click on solutions and navigate to airport view
    And The details are entered in the form for <user> and <email>
    Then User close the browser

    Examples: 
      | user | email |
      | name | mail  |
