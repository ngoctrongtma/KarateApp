
@delete
Feature: sample karate test script for get request

Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: Delete request
   
    Given url url
    And path 'posts', 1
    When method Delete
    Then status 200