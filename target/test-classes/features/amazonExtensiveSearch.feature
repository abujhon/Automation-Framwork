Feature: amazon search result againt database

  @Regression
  Scenario Outline: verify the search result for given testdata againt database result
    Given I am on the amazon home page
    When I enter the "<items>" into search box
    And click search button
    Then I should be able to see result set and the result count
    And get the result count and fill the count, status and time columns in the excel sheet

    Examples: 
      | items        |
      | seven friday |
      | rolex        |
      | tag heuer    |
      | bulova       |
      | alpina       |
      | omega        |
      | cartier      |
