@yourstoreafinal
Feature: yourstore
  Background: your store
    Given user launch "chrome" with "https://admin-demo.nopcommerce.com/login"
    Then user navigated  to "Your store. Login"

  @smoke
  Scenario Outline: sucessfully login with valid credential
    Then user  land on "<dashboardpagetitle>" Page
    And uaser enters validcredential email as "admin@yourstore.com" and password as "admin"
    Then click on loginbutton

    Examples: 
      | Browser | url                                      | loginpagetitle    | dashboardpagetitle                     |
      | chrome  | https://admin-demo.nopcommerce.com/login | Your store. Login | Dashboard / nopCommerce administration |

  @regression
  Scenario Outline: Validatecustomerpagetitle
    Then user  land on "<dashboardpagetitle>" Page
    And uaser enters validcredential email as "admin@yourstore.com" and password as "admin"
    Then click on loginbutton
    Then user click on "<Menu>" menu
    Then user click on Customer Button
    Then user  land on "<Customerpagetitle>" Page

    Examples: 
      | Browser | url                                      | loginpagetitle    | dashboardpagetitle                     | Menu     | Customerpagetitle                      |
      | chrome  | https://admin-demo.nopcommerce.com/login | Your store. Login | Dashboard / nopCommerce administration | Customer | Customers / nopCommerce administration |
   @smoke @regression
   Scenario Outline: Validateemailbysearch
    Then user  land on "<dashboardpagetitle>" Page
    Then user click on "<Menu>" menu
    Then user click on Customer Button
    Then user  land on "<Customerpagetitle>" Page
    Then click on "Email" Field
    And insert "<EmailID>" as email
    Then click on search button
    And Email should be visible

    Examples: 
      | Browser | url                                      | loginpagetitle    | dashboardpagetitle                     | Menu     | Customerpagetitle                      | EmailID                   |
      | chrome  | https://admin-demo.nopcommerce.com/login | Your store. Login | Dashboard / nopCommerce administration | Customer | Customers / nopCommerce administration | james_pan@nopCommerce.com |
