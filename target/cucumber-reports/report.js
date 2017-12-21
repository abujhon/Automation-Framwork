$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com.fourStay.feature");
formatter.feature({
  "line": 2,
  "name": "Search accross states",
  "description": "",
  "id": "search-accross-states",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoketest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify results in DC metro area using list",
  "description": "",
  "id": "search-accross-states;verify-results-in-dc-metro-area-using-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the fourstay homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter school name \"Georgetown university\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter available start and end dates",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I choose bed option for two beds",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the search button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the result count",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the results should contain price tag, availablity tag, minimum stay tag as follows",
  "rows": [
    {
      "cells": [
        "$"
      ],
      "line": 13
    },
    {
      "cells": [
        "Available From"
      ],
      "line": 14
    },
    {
      "cells": [
        "Minimum Stay"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "actual results should match the result count",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});