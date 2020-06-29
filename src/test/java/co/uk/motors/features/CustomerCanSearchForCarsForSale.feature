Feature: Customer can search for Cars for sale
  As a customer I want the ability to search for any car of my choice
  So that i can chose one to buy.



  Scenario Outline: Customer can Search for any car
    Given i navigate to Motors.co.uk Homepage
    And i enter "<Postcode>" into postcode field for buy
    And i select "<CarMake>" for buy
    And i select "<CarModel>"
    And i select "<MinPrice>" at for sell
    And i select "<MaxPrice>" in for sell
    When i click on Search
    And search result page is displayed
    Then i click on one of the results to view its detail




    Examples:
      |Postcode   | CarMake        | CarModel         | MinPrice          | MaxPrice    |
      |NE8 3DD    | BMW            |  X6              |       £6,000      | £100,000    |
#      |NE8 3DD    | Rolls-Royce    |  Ghost           |       £20,000     | £1,000,000  |
#      |NE8 3DD    | Make (Any)     |  Model (Any)     | MinPrice (Any)    | MinPrice (Any)  |


#@ignore
#
#  Scenario Outline: Customer cant Search for any car
#
#    Given i navigate to Motors.co.uk Homepage
#    And i do not input "<Postcode>" into postcode field for buy
#    And i select "<CarMake>" for buy
#    And i select "<CarModel>" for buy
#    And i select "<MinPrice>" for buy
#    And i select "<MaxPrice>" for buy
#    When i should not be able click on Search
#    Then a <"Message"> should be displayed
#
#    Examples:
#      |Postcode   | CarMake        | CarModel         | MinPrice          | MaxPrice    |Message|
#      |           | BMW            |  X6              |       £6,000      | £100,000    | Please Enter a valid UK Postcode|