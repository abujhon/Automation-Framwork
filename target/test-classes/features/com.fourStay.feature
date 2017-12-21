@Smoketest
Feature: Search accross states


  Scenario: Verify results in DC metro area using list
    Given I am on the fourstay homepage
    And I enter school name "Georgetown university"
    And I enter available start and end dates
    And I choose bed option for two beds
    When I click the search button
    Then I should see the result count
    Then the results should contain price tag, availablity tag, minimum stay tag as follows
      | $              |
      | Available From |
      | Minimum Stay   |
    Then actual results should match the result count
