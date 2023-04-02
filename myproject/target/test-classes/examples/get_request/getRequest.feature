Feature: sample karate test script for get request

Background:
    * url 'https://jsonplaceholder.typicode.com'

Scenario: get all users and then get the first user by id

    * def companyExpected = 
    """
    {
        "name": "Romaguera-Crona",
        "catchPhrase": "Multi-layered client-server neural-net",
        "bs": "harness real-time e-markets"
    }
    """

    Given path 'users'
    When method get
    Then status 200

    * def first = response[0]

    Given path 'users', first.id
    When method get
    Then status 200
    And match response.id == 1
    And match response.company == companyExpected
