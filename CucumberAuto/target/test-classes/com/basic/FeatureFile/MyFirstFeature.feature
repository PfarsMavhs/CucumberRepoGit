Feature: Create account of Facebook
 As a user you need to open facebook home page and do the validations
 
Scenario: Validate First Name field
Given User need to be on Facebook login page
When  User enters user first name
Then  User checks user first name is present

Scenario: Validate Create user multiple fields 
Given User need to be on Facebook login page
When  Enter following data
	


#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When  User enters user first name
#And   user enters user surname
#Then  User checks user first name is present
#But   User Mobile field should be blank
