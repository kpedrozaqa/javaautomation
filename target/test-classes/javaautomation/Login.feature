Feature: Jenkins login

  Background: Validate that Jenkins loads
    Given  i navigate to Jenkins
    
  Scenario: Validate that the elements are shown
    When   the page loads
    Then   the "username" input is displayed
  	Then   the "password" input is displayed
 	 	Then   the Sign In button is displayed
 	 
  	
  	
  	
  
  

    

