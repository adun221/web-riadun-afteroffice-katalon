Feature: Regis ke DemoQA
  Sebagai pengguna


  Scenario: Regis berhasil 
  Given User berada di halaman register DemoQA
  When User mengisi username "Afteroffice!" , password "Lamalama!3" , firstname "After" dan lastname "Office" 
  When  User melakukan ceklist captcha
  When  User menekan tombol register
  Then Muncul notifikasi pendaftaran berhasil
