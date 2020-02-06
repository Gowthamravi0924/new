Feature: Verify the validate functionality in facebook

  Scenario Outline: Verify and validate the login functionality with different combination of data
    Given Verify the user is on facebook login page
    When Verify the user  should enter the username "<username>" and password "<password>" .
    And Verify the user should click the login button
    Then Verify the success message

    Examples: 
      | username                  | password     |
      |                8438419098 | gowthambravo |
      |                8438419098 | jhfksahfkuef |
      | gowthamravi0924@gmail.com | gowthambravo |
      | gowthamravi@gamil.com     | jhfjeefkfh   |
