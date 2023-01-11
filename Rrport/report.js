$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/register.feature");
formatter.feature({
  "name": "To fill the registration form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user fill the resgistration form and ignore the confirm password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "BistoRegisteration.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User launch the url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "BistoRegisteration.user_launch_the_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the account button",
  "keyword": "And "
});
formatter.match({
  "location": "BistoRegisteration.user_click_the_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the valid name in name field",
  "keyword": "And "
});
formatter.match({
  "location": "BistoRegisteration.user_pass_the_valid_name_in_name_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the valid email in email field",
  "keyword": "And "
});
formatter.match({
  "location": "BistoRegisteration.user_pass_the_valid_email_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the valid phone number in phone number field",
  "keyword": "And "
});
formatter.match({
  "location": "BistoRegisteration.user_pass_the_valid_phone_number_in_phone_number_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the password field",
  "keyword": "And "
});
formatter.match({
  "location": "BistoRegisteration.user_pass_the_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "BistoRegisteration.user_click_the_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BistoRegisteration.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});