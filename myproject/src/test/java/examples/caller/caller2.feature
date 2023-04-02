
Feature: put caller

Background:
    * url 'https://jsonplaceholder.typicode.com'

Scenario: caller feature usage
    And def getFeature = call read('./caller1.feature')
    And path 'posts', getFeature.response.id
    And getFeature.response.title = 'title update with put method'
    And request getFeature.response
    When method PUT
    Then status 200
    And print 'after put', response