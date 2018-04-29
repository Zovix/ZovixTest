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
  "duration": 119297907,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.logs_using_the_credentials(DataTable)"
});
formatter.result({
  "duration": 1200113,
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
      "name": "@TC_001:"
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
  "duration": 24238,
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
  "duration": 2266597,
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
  "duration": 84834,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 21,
      "value": "#Include here the parametrization and data for positive and negatice test"
    }
  ],
  "line": 23,
  "name": "Make a withdraw",
  "description": "",
  "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@TC_002:"
    },
    {
      "line": 22,
      "name": "@sign-off"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "my checking account has balance greater than \u003cwithdrawn_amount\u003e before withdraw",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I withdraw \u003cwithdrawn_amount\u003e from my checking account",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should have less \u003cwithdrawn_amount\u003e as balance",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw;",
  "rows": [
    {
      "cells": [
        "withdrawn_amount"
      ],
      "line": 29,
      "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw;;1"
    },
    {
      "cells": [
        "250"
      ],
      "line": 30,
      "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw;;2"
    },
    {
      "cells": [
        "1000"
      ],
      "line": 31,
      "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw;;3"
    }
  ],
  "keyword": "Examples"
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
  "duration": 46244,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.logs_using_the_credentials(DataTable)"
});
formatter.result({
  "duration": 33806,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Make a withdraw",
  "description": "",
  "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@TC_002:"
    },
    {
      "line": 22,
      "name": "@sign-off"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "my checking account has balance greater than 250 before withdraw",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I withdraw 250 from my checking account",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should have less 250 as balance",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 45
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.my_checking_account_has_balance_greater_than_before_withdraw(int)"
});
formatter.result({
  "duration": 98866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 11
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.i_withdraw_from_my_checking_account(int)"
});
formatter.result({
  "duration": 70483,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 19
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.i_should_have_less_as_balance(int)"
});
formatter.result({
  "duration": 59958,
  "status": "passed"
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
  "duration": 38590,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.logs_using_the_credentials(DataTable)"
});
formatter.result({
  "duration": 34125,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Make a withdraw",
  "description": "",
  "id": "manage-simple-transactions-in-a-banking-account;make-a-withdraw;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@TC_002:"
    },
    {
      "line": 22,
      "name": "@sign-off"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "my checking account has balance greater than 1000 before withdraw",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I withdraw 1000 from my checking account",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should have less 1000 as balance",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 45
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.my_checking_account_has_balance_greater_than_before_withdraw(int)"
});
formatter.result({
  "duration": 184338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 11
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.i_withdraw_from_my_checking_account(int)"
});
formatter.result({
  "duration": 59639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 19
    }
  ],
  "location": "AC_001_SampleBanking_StepDefinition.i_should_have_less_as_balance(int)"
});
formatter.result({
  "duration": 66974,
  "status": "passed"
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
  "duration": 34125,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.logs_using_the_credentials(DataTable)"
});
formatter.result({
  "duration": 28703,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Transfer funds",
  "description": "",
  "id": "manage-simple-transactions-in-a-banking-account;transfer-funds",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "Transfer page is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "form to transfer funds is populated",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I confirm to complete transfer operation",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "A confirmation is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.transfer_page_is_loaded()"
});
formatter.result({
  "duration": 35401,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.form_to_transfer_funds_is_populated()"
});
formatter.result({
  "duration": 16584,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.i_confirm_to_complete_transfer_operation()"
});
formatter.result({
  "duration": 20730,
  "status": "passed"
});
formatter.match({
  "location": "AC_001_SampleBanking_StepDefinition.a_confirmation_is_displayed()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
});