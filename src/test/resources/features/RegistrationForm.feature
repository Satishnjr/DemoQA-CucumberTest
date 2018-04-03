Feature: New user registration

  Scenario Outline: Verify that the new user registration is successful after passing correct inputs.
    Given I open demoqa website
    When I click on registration link
    When I enter "<First Name>" "<Last Name>" in input box
    And I select Single radio button
    And I select Cricket check box
    And I select Country from dropdown
    And I select Date of Birth from dropdown
    And I enter "<Phone Number>" "<Username>" "<E-mail>" "<Password>" "<Confirm Password>" in input box
    Then I click on submit button, then the user registration should be successful

    Examples: 
      | First Name | Last Name | Phone Number | Username | E-mail                  | Password   | Confirm Password |
      | Satish     | N         |   8309713319 | Satishnj | sksatishreddy@gmail.com | Satish@123 | Satish@123       |

  Scenario Outline: Verify that the new user registration is successful after passing correct inputs.
    Given I open demoqa website
    When I click on registration link
    When I enter "<First Name>" "<Last Name>" in input box
    And I select Single radio button
    And I select Cricket check box
    And I select Country from dropdown
    And I select Date of Birth from dropdown
    And I enter "<Phone Number>" "<Username>" "<E-mail>" "<Password>" "<Confirm Password>" in input box
    Then I click on submit button, then the user registration should be successful

    Examples: 
      | First Name | Last Name | Phone Number | Username | E-mail                  | Password   | Confirm Password |
      |            |           |   8309713319 | Satishnj | sksatishreddy@gmail.com | Satish@123 | Satish@123       |
