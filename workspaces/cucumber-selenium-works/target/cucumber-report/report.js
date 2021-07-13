$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registration.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:naveen@probits.in"
    }
  ],
  "line": 2,
  "name": "To register user as learner",
  "description": "",
  "id": "to-register-user-as-learner",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the driver is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "url is \"http://elearning.upskills.in/\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "page is loaded",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStep.the_driver_is_loaded()"
});
formatter.result({
  "duration": 4177295296,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://elearning.upskills.in/",
      "offset": 8
    }
  ],
  "location": "RegistrationStep.url_is(String)"
});
formatter.result({
  "duration": 5092591,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.page_is_loaded()"
});
formatter.result({
  "duration": 3890319439,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "register valid user",
  "description": "",
  "id": "to-register-user-as-learner;register-valid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "when the user name is \"naveen\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "lastname is \"kumar\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "email is \"adith.naveen@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "check if user is registered",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStep.the_registration_page()"
});
formatter.result({
  "duration": 2008379875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveen",
      "offset": 23
    }
  ],
  "location": "RegistrationStep.when_the_user_name_is(String)"
});
formatter.result({
  "duration": 150822178,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 13
    }
  ],
  "location": "RegistrationStep.password_is(String)"
});
formatter.result({
  "duration": 90828370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adith.naveen@gmail.com",
      "offset": 10
    }
  ],
  "location": "RegistrationStep.email_is(String)"
});
formatter.result({
  "duration": 97171024,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.click_on_submit_button()"
});
formatter.result({
  "duration": 46535,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStep.check_if_user_is_registered()"
});
formatter.result({
  "duration": 25370,
  "status": "passed"
});
});