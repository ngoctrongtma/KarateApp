Feature: test scenario outline


Background:
  * url 'https://jsonplaceholder.typicode.com'

Scenario Outline: GET request with example table - <id>

  And path 'users', id
  When method GET
  Then status 200
  Examples:
  |read('classpath:data/scenario_outline.csv')|

