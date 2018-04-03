Feature: New user registration

  @positive
  Scenario Outline: Verify that the new user registration is successful after passing correct inputs.
    Given user open demoqa website
    When user click on registration link
    When user enter "<First Name>" "<Last Name>" in input box
    And user select Single radio button
    And user select Cricket check box
    And user select Country from dropdown
    And user select Date of Birth from dropdown
    And user enter "<Phone Number>" "<Username>" "<E-mail>" "<Password>" "<Confirm Password>" in input box
    And user click on submit button
    Then user should be able to login successfully

    Examples: 
      | First Name | Last Name | Phone Number | Username | E-mail                  | Password   | Confirm Password |
      | Satish     | N         |   8309713319 | Satishnj | sksatishreddy@gmail.com | Satish@123 | Satish@123       |
      
      
  @negative
  Scenario Outline: Verify that the new user registration is unsuccessful after passing incorrect inputs.
    Given user open demoqa website
    When user click on registration link
    When user enter "<First Name>" "<Last Name>" in input box
    And user select Single radio button
    And user select Cricket check box
    And user select Country from dropdown
    And user select Date of Birth from dropdown
    And user enter "<Phone Number>" "<Username>" "<E-mail>" "<Password>" "<Confirm Password>" in input box
    And user click on submit button
    Then user should not be able to login

    Examples: 
      | First Name | Last Name | Phone Number | Username | E-mail                  | Password   | Confirm Password |
      |            |           |   8309713319 | Satishnj | sksatishreddy@gmail.com | Satish@123 | Satish@123       |
