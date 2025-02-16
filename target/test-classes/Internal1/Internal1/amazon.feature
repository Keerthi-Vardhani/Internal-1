Feature: Searching different products after login

Scenario Outline: Searching different products after login
    Given I am on the Login page URL "https://www.amazon.in/"
    Then I click on sign in button and wait for sign in page
    When I enter username as "testusername"
    And I Click on Continue button
    And I enter password as "testpassword"
    And click on login button
    Then I am logged in
    And I search different "<products>" from the search bar

Examples:
    | products  |
    | laptops   |
    | pendrive  |
    | led tv    |
