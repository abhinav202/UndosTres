Feature: Title of your feature
 
Scenario: Title of your scenario
Given I open the site "https://prueba.undostres.com.mx"
When Select Operador as "Telcel"
And Enter Mobile number as "5523261151"
And Enter Recharge amount as "$10"
Then Click on Siguiente

Given Verify Payment Page landed
When Enter cardname as "Test"
And Enter cardnumber as "4111111111111111"
And Enter month as "11" and year as "2025"
And Enter CVV as "111"
And Enter cardmail as "test@test.com"
Then Click on Pagar con Tarjeta

Given Verify pop up appeared
When Enter email as "marze.zr@gmail.com"
And Enter password as "123456"
Then Click on Acceso
Then Recharge is successful