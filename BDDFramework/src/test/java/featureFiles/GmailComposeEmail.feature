Feature: Verify Gmail home page features

Scenario: TC001 Verify Gmail home page title
Given I navigate to gmail home page
Then I see gmail home page title is displaying as "Gmail"

Scenario: TC002 Verify gmail home page log in application
Given I navigate to gmail home page
Then I see email text box is displaying
Then I see next button is displaying
Then I see password text box is displaying
Then I see next button is displaying

Scenario Outline: TC003 Verify user name and password combination for log in
Given I navigate to gmail home page
Then I enter email "<Email>" 
Then I click on next button
Then I enter password "<Password>"
Then I click on next button
Examples:
|Email                    |Password |
|mailto:asafsd@gmail.com  |sdfsdfq  |

Scenario Outline: TC004 Compose email
Given I navigate to gmail home page
Then I click on compose button
Then I enter valid reveiver email address
Then I enter subject line as "<Subject>"
Then I enter email body as "<EmailBody>"
Then I click on send button
Examples:
|ReceiverEmail          |Subject   |EmailBody                      |
|fbdfgasdvsvd@gmail.com |Incubyte  |Automation QA test for Incubyte|