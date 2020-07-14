Feature: Customer can search for Cars for sale (More Options)
  As a customer I want the ability to use more option to search for any car of my choice
  So that i can chose one to buy.



  Scenario Outline: Customer can use more options to Search for any car
    Given i navigate to Motors.co.uk Homepage
    And i enter "<Postcode>" into postcode field for buy
    And i select "<CarMake>" for buy
    And i select "<CarModel>"
    And i select "<MinPrice>" at for sell
    And i select "<MaxPrice>" in for sell
    When i click on more options on the page
    And i select "<Distance>" from location
    And i click "<Bodystyle>" from the list
    And i select "<Age&Mileage>" from Age and mileage
    And i select "<VehicleSpec>" from vehicle spec
    And i select "<RunningCost>" from running cost
    And i select "<Mileage>" from drop down
    And i select "<FuelType>" fuel type
    And i select "<CostOfAnnualTax>" from tax
    And i select colors
    And search result page is displayed
    Then i click on one of the results to view its detail




    Examples:
      |Postcode   | CarMake        | CarModel         | MinPrice          | MaxPrice    |Distance    |Bodystyle|Age&Mileage|VehicleSpec  |RunningCost|Mileage|FuelType|CostOfAnnualTax|
      |NE83DD    | Honda           |  Accord       |       £1,000      | £45,000    |Within 50 miles |estate|over 10 years old|Transmission (Any)|Insurance group 35 and under|up to 100,000 miles|Fuel Type (Any)|Tax £570 pa or less|
      |NE35 9NF   | Ford           |  Focus       |       £4,000      | £60,000    |Within 200 miles |  Coupe   |over 10 years old|Automatic|Insurance group 25 and under|up to 100,000 miles|Fuel Type (Any)|Tax £570 pa or less|
      |NE35 9NF   | Ford           |  Focus       |       £4,000      | £60,000    |Within 200 miles |  Coupe   |up to 7 years old|Manual|Insurance group 45 and under|up to 100,000 miles|petrol|Tax £570 pa or less|