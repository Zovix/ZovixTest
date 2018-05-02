$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample_bank.feature");
formatter.feature({
  "line": 1,
  "name": "Manage simple transactions in a banking account",
  "description": "\tIn order to manage my money more efficiently\r\n\tAs a bank client\r\n\tTC_001: I want to make a deposit and withdraw money whenever I need to\r\n\tTC_002: I want to make a transfer to another bank account whenever I need to\r\n\tTC_003: I want to make a transfer to an international bank account",
  "id": "manage-simple-transactions-in-a-banking-account",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 8,
      "value": "#Login information for generic user so all scenarios will use the same starting point"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "a user access the bank web app",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "logs using the credentials",
  "rows": [
    {
      "cells": [
        "bank_id",
        "username",
        "password",
        "url"
      ],
      "line": 12
    },
    {
      "cells": [
        "25967",
        "banker",
        "training",
        "http://mykidsbank.org"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.a_user_access_the_bank_web_app()"
});
formatter.result({
  "duration": 5056856290,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.logs_using_the_credentials(DataTable)"
});
formatter.result({
  "duration": 995576196,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Make a deposit",
  "description": "",
  "id": "manage-simple-transactions-in-a-banking-account;make-a-deposit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@TC_001"
    },
    {
      "line": 15,
      "name": "@in_progress"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "my checking account has a balance equal or greater than zero",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I deposit 1500 to my checking account",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I should have additional 1500 as balance",
  "keyword": "Then "
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.my_checking_account_has_a_balance_equal_or_greater_than_zero()"
});
formatter.result({
  "duration": 83123880,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1500",
      "offset": 10
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.i_deposit_to_my_checking_account(int)"
});
formatter.result({
  "duration": 2742703084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1500",
      "offset": 25
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.i_should_have_additional_as_balance(int)"
});
formatter.result({
  "duration": 31055287,
  "status": "passed"
});
});