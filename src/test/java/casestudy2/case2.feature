Feature: Login
 
Scenario Outline: SignIn
    Given user open testmeapp
    When user click signIn button
    And user Enter "<username>" in the user id field
    And enter "<password>" in the password field
    And click on login
    Then Homepage is displayed

    Examples: 
      | username | password |
      |  Lalitha |  Password123|
