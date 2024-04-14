@yourstoreadmin1
Feature: yourstore
 
  Scenario Outline: sucessfully login with valid credential
    Given user launch "<Browser>" with "<url>"
    Then user navigated  to "<loginpagetitle>"
    And uaser enters validcredential email as "admin@yourstore.com" and password as "admin"
    Then click on loginbutton
    Then user  land on "<dashboardpagetitle>" Page

    Examples: 
      | Browser | url                                      | loginpagetitle    | dashboardpagetitle                     |
      | chrome  | https://admin-demo.nopcommerce.com/login | Your store. Login | Dashboard / nopCommerce administration |
  @smokes @customers
  Scenario Outline: validate customerpagetitle
    Given user launch "<Browser>" with "<url>"
    Then user navigated  to "<loginpagetitle>"
    And uaser enters validcredential email as "admin@yourstore.com" and password as "admin"
    Then click on loginbutton
    Then user  land on "<dashboardpagetitle>" Page
    Then user click on "<Menu>" menu
    Then user click on Customer button
    Then user  land on "<Customer Search>" Page

    Examples: 
      | Browser | url                                      | loginpagetitle    | dashboardpagetitle                     | Menu     | Customer Search                        |
      | chrome  | https://admin-demo.nopcommerce.com/login | Your store. Login | Dashboard / nopCommerce administration | Customer | Customers / nopCommerce administration |
  
  Scenario Outline: validate customerpagetitle
    Given user launch "<Browser>" with "<url>"
    Then user navigated  to "<loginpagetitle>"
    And uaser enters validcredential email as "admin@yourstore.com" and password as "admin"
    Then click on loginbutton
    Then user  land on "<dashboardpagetitle>" Page
    Then user click on "<Menu>" menu
    Then user click on Customer button
    Then user  land on "<Customer Search>" Page

    Examples: 
      | Browser | url                                      | loginpagetitle    | dashboardpagetitle                     | Menu     | Customer Search                        |
      | chrome  | https://admin-demo.nopcommerce.com/login | Your store. Login | Dashboard / nopCommerce administration | Customer | Customers / nopCommerce administration |