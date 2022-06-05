@HomePage
Feature: Home Page


  @Email @Components
  Scenario Outline: Check Email Components
    Given Enes is on "<Login>" Page
    When click "E-Posta" radio button
    Then should see "GIRIS YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see "E-Posta Adresiniz" text on Email
    Then should see "Sifreniz" text on Password
    Then should see Show Password Icon
    Then should see "Beni Hatirla" remember me
    Then should see "Şifremi Unuttum" forgot password
    Then should see "GIRIŞ YAP" login button
    Examples:
      | Login     |
      | Giriş Yap |

  @Phone @Components
  Scenario Outline: Check Phone Components
    Given Enes is on "<Login>" Page
    When click "Telefon" radio button
    Then should see "GIRIS YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see Phone Text Box
    Then should see "Sifreniz" text on Password
    Then should see Show Password Icon
    Then should see "Beni Hatirla" remember me
    Then should see "Şifremi Unuttum" forgot password
    Then should see "GIRIŞ YAP" login button
    Examples:
      | Login     |
      | Giriş Yap |

  @Empty
  Scenario Outline: Empty Login
    Given Enes is on "<Login>" Page
    When click login button
    Then should see "<emailErr>" Email Empty message
    Then should see "<passErr>" Password Empty message
    Examples:
      | Login      | emailErr                           | passErr                   |
      | Giriş Yap  | Lütfen e-posta adresinizi giriniz. | Lütfen şifrenizi giriniz. |

  @Empty @Password
  Scenario Outline: Empty Password
    Given Enes is on "<Login>" Page
    When type Email "<email>"
    When click login button
    Then should see "<passErr>" Password Empty message
    Then should not see Email Empty message
    Examples:
     |Login      | email         | passErr                   |
     |Giriş Yap  | enes@mail.com | Lütfen şifrenizi giriniz. |

  @Empty @Email
  Scenario Outline: Empty Email
    Given Enes is on "<Login>" Page
    When type Password "<pass>"
    When click login button
    Then should see "<emailErr>" Email Empty message
    Then should not see Password Empty message
    Examples:
      |Login        | pass       | emailErr                           |
      |Giriş Yap    | 1234567890 | Lütfen e-posta adresinizi giriniz. |

  @False @Password
  Scenario Outline: False Email
    Given Enes is on "<Login>" Page
    When type Email "<email>" and click login
    Then should see "<passErr>" Email False message
    Examples:
      |Login         | email              | passErr                                    |
      |Giriş Yap     | enes@mail@mail.com | Lütfen geçerli bir e-posta adresi giriniz. |

  @FalseLogin
  Scenario Outline: False Login
    Given Enes is on "<Login>" Page
    When type Email "<email>", Password "<password>" and click login
    Then should see "<err>" Login Error message
    Examples:
      |Login        | email         | password | err                                                       |
      |Giriş Yap    | enes@mail.com | 123      | Lütfen E-posta Adresinizi ya da Şifrenizi Kontrol Ediniz. |
