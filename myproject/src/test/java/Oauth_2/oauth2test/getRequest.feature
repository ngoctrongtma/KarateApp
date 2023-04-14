Feature: sample karate test script for get request

Background:
    * url 'https://login-demo.curity.io/oauth/v2/oauth-authorize'

Scenario: access to token service

    * def companyExpected = 
    """
    {
        "name": "Romaguera-Crona",
        "catchPhrase": "Multi-layered client-server neural-net",
        "bs": "harness real-time e-markets"
    }
    """
    And param client_id = 'demo-web-client'
    And param response_type = 'code%20id_token%20token'
    And param redirect_uri = 'https://oauth.tools/callback/hybrid'
    And param state = '1599045202487-sVG'
    And param scope = 'openid%20profile%20read'
    And param nonce = '1599045229829-DpV'

    And request {}
    When method POST
    Then status 200

#    * def first = response[0]
#
#    Given path 'users', first.id
#    When method get
#    Then status 200
#    And match response.id == 1
#    And match response.company == companyExpected
