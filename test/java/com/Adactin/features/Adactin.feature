Feature: Hotel Room Booking

Scenario: Login page
	Given user can able to launch the URL
	When user can able to enter the username in the text box
	And user can able to enter the password in the password field
	Then user can able to click the login button and navigate to next page
	
	Scenario: Hotel Searching
	When user can able to search the location in the location field
	And user can able to search the hotels in the hotels field
	And user can able to search the Room Type in the Room Type field
	And user can able to select the No_of_room in the No_of_room field
	And user can able to choose the check in date in the check in date field
	And user can able to choose the check out date in the check out date field
	And user can able to select the Adults per Room in the Adults per Room field
	And user can able to select the Children per room in the Children per room field
	Then user can able to click the search button and navigate to next page
	
	Scenario: Select Hotel
	When user can click the Radio Icon 
	Then user can able to Click the Continue button and navigte to next page
	
	Scenario: Book a Hotel
	When user can able to enter the first name in the text box
	And user can able to enter the last name in the text box
	And user can able to enter the Billing Address in the Billing Address field
	And user can able to enter the Credit card no in the Credit card no field
	And user can able to select the Credit card type in the Credit card type field
	And user can able to select the Month of Expiry date in the Month of Expiry date field
	And user can able to select the year of Expiry date in the year of Expiry date field
	And user can able to enter the Cvv No in the Cvv No field
	Then user can able to click the Book Now button and navigate to next page
	
	Scenario: Booking Confirmation
	Then user can able to click the logout button and navigate to next page 
	
	Scenario: Logout Successfully
	Then user can able to click the click here to login again button and navigate to next page

	
 

	
