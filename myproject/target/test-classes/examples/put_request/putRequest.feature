Feature: sample karate test script for put request

Background: 
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: Put request
    * def post =
      """
        {
          "userId": 1,
          "id": 1,
          "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
          "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
        }
      """
   
    Given url 'https://jsonplaceholder.typicode.com/'
    And path 'posts', 1
    And request post
    When method PUT
    Then status 200