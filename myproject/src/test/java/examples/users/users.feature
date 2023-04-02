Feature: sample karate test script
  for help, see: https://github.com/intuit/karate/wiki/IDE-Support

  Background:
    * url 'https://jsonplaceholder.typicode.com'

  @getUser
  Scenario: get all users and then get the first user by id
    Given path 'users'
    When method get
    Then status 200

    * def first = response[0]

    Given path 'users', first.id
    When method get
    Then status 200

  @postUser
  Scenario: create a user and then get it by id
    * def user = read('classpath:data/post_request/user.json')
      
    Given url 'https://jsonplaceholder.typicode.com/users'
    And request user
    When method post
    Then status 201

  @deleteUser
  Scenario: Delete request
   
    Given path 'users', 1
    When method Delete
    Then status 200
  
  @postUser
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
  