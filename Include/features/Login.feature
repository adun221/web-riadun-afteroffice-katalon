Feature: Login ke DemoQA
  Sebagai pengguna


  Scenario: Login berhasil dengan kredensial valid
  Given User berada di halaman login DemoQA
  When User mengisi username "Dcba@123" dan password "Dcba@123"
  When User menekan tombol Login
  Then User diarahkan ke halaman Profile "Dcba@123"
