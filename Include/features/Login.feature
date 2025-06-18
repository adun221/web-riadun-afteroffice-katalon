Feature: Login ke DemoQA

  Scenario: Login berhasil dengan kredensial valid
    Given saya membuka browser dan menuju "https://demoqa.com/login"
    When saya mengisi username "Dcba@123" dan password "Dcba@123"
    And saya menekan tombol login
    Then saya melihat username "Dcba@123" tampil di halaman profil
