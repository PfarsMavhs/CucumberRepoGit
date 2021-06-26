$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/basic/FeatureFile/MyFirstFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Create account of Facebook",
  "description": "As a user you need to open facebook home page and do the validations",
  "id": "create-account-of-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate First Name field",
  "description": "",
  "id": "create-account-of-facebook;validate-first-name-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters user first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User checks user first name is present",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "MyFirstFeature.User_enters_user_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyFirstFeature.User_checks_user_first_name_is_present()"
});
formatter.result({
  "status": "skipped"
});
});