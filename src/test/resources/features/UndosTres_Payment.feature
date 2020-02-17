Feature: UndosTres Payment
 
Scenario: Verify a successful recharge on UndosTres

* I open the site "https://prueba.undostres.com.mx"
* Select Operador as "Telcel"
* Enter Mobile number as "5523261151"
* Enter Recharge amount as "$10"
* Click on Siguiente

* Verify Payment Page landed
* Enter cardname as "Test"
* Enter cardnumber as "4111111111111111"
* Enter month as "11" and year as "2025"
* Enter CVV as "111"
* Enter cardmail as "test@test.com"
* Click on Pagar con Tarjeta

* Verify pop up appeared
* Enter email as "marze.zr@gmail.com"
* Enter password as "123456"
* Click on Acceso
* Recharge is successful