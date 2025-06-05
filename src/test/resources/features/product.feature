Feature: product data table practice

  @listOfMap @smoke @headless
  Scenario: verify each product price
    # practice List<Map<String, String>>
    Given User is on the HomePage
    Then User should be able to see expected prices in the following products
      | Category | Product           | expectedPrice |
      | Phones   | Samsung galaxy s6 | 360           |
      | Phones   | Nokia lumia 1520  | 820           |
      | Phones   | Nexus 6           | 650           |
      | Laptops  | Sony vaio i5      | 790           |
      | Laptops  | Sony vaio i7      | 790           |
      | Laptops  | MacBook air       | 700           |
      | Monitors | Apple monitor 24  | 400           |
      | Monitors | ASUS Full HD      | 230           |
#Feature: product data table practice
#
#  @listOfMap
#  Scenario: verify each product price
#    # practice List<Map<String, String>>
#    Given User is on the HomePage
#    Then User should be able to see expected prices in the following products
#      | Category | Product           | expectedPrice |
#      | Phones   | Samsung galaxy s6 | 360           |
#      | Phones   | Nokia lumia 1520  | 820           |
#      | Phones   | Nexus 6           | 650           |
#      | Laptops  | Sony vaio i5      | 790           |
#      | Laptops  | Sony vaio i7      | 790           |
#      | Laptops  | MacBook air       | 700           |
#      | Monitors | Apple monitor 24  | 400           |
#      | Monitors | ASUS Full HD      | 230           |

  @listOfList @headless
# practice List<List<String>>
  Scenario: verify each product price ListOfList
    Given User is on the HomePage
    Then User should be able to see expected prices in the following products with listOfLists
      | Phones   | Samsung galaxy s6 | 360           |
      | Phones   | Nokia lumia 1520  | 820           |
      | Phones   | Nexus 6           | 650           |
      | Laptops  | Sony vaio i5      | 790           |
      | Laptops  | Sony vaio i7      | 790           |
      | Laptops  | MacBook air       | 700           |
      | Monitors | Apple monitor 24  | 400           |
      | Monitors | ASUS Full HD      | 230           |

#  List Element 1 (List<String>): [Phones, Samsung galaxy s6, 360]
#  List Element 2 (List<String>): [Phones, Nokia lumia 1520, 820]
#  List Element 3 (List<String>): [Phones, Nexus 6, 650]
#  List Element 4 (List<String>): [Laptops, Sony vaio i5, 790]
#  List Element 5 (List<String>): [Laptops, Sony vaio i7, 790]
#  List Element 6 (List<String>): [Laptops, MacBook air, 700]
#  List Element 7 (List<String>): [Monitors, Apple monitor 24, 400]
#  List Element 8 (List<String>): [Monitors, ASUS Full HD, 230]

  @mapList @smoke @headless
# practice Map<String, List<String>>
  Scenario: VERIFY STUDENTS NAMES ON DISCORD
  Then user should see the following names in their group
    | Group 1 | Nadir  | Feuruz | Shakir  |
    | Group 2 | Yuliia | Roma   | Nazarii |
# List Element 1 (List<String>): [Group1, Nadir, Feyruz, Shakir]
# List Element 2 (List<String>): [Group2, Yuliia, Roma, Nazarii]

