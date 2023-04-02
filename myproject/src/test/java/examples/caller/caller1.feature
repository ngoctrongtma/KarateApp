Feature: get caller

Background:
    * url 'https://jsonplaceholder.typicode.com'

Scenario: get scenario with static id
  Given path 'posts', 1
  When method GET
  Then status 200
  And print 'after get', response
  