Feature: To fill the registration form

Scenario: The user fill the resgistration form and ignore the confirm password

Given User launch the browser
When User launch the url of the application
And User click the account button
And User pass the valid name in name field
And User pass the valid email in email field
And User pass the valid phone number in phone number field
And User pass the password field
And User click the register button
Then User close the browser