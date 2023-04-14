Feature: it is for creating pet in the API

Background:
  Given url "https://jsonplaceholder.typicode.com"

  Scenario: get all users and then get the first user by id

    Given path 'users'
    When method get
    Then status 200

