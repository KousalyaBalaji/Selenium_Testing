Feature: Checking The Hotel Booking Functionality Of Adactin Application
Scenario Outline: Login Functionality
Given user Should Launch The URL
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Will Click On Login Button

Examples:
|username|password|
|abc|9876|
|hij|0987|
|KousalyaB|roHanvika|


Scenario: Search Hotel Functionality
When user Select "New York" In The Location Field
And user Select  "3" In The Hotel Field
And user Select  "Super Deluxe" In The Room Type Field
And user Select "2" In The No Of Rooms Field
And user Select "1 - One" In The Adults Field
And user Select "1 - One" In The Children Field
Then user Will Click On Search Button

Scenario: Select Hotel Functionality
When user Select The Hotel Information
Then user Will Click On Continue Button

Scenario: Book Hotel Functionality
When user Enters The First Name In The Firstname Field
And user Enters The Last Name In The Lastname Field
And user Enters The Address In The Address Field
And user Enters The Creditcard No In The Creditcard Field
And user Select The "VISA" Type In The Creditcard Type  Field
And user Select The "January" In The Expiry Date  Field
And user Select The "2012" In The Expiry Year  Field
And user Enters The Cvv Number No In The Cvv Number Field
Then user Will Click On Booknow Button

Scenario: Logout Functionality
When user Will Click On Logout Button
