@activity1
Feature: First Test

@google-search
Scenario: Opening a webpage using Selenium
    Given User on GooglePage
    When User Types in cheese and enter
    Then Show how many search results where shown
    And Close the browser

