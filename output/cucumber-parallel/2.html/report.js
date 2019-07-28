$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/EclipseWorkspace/telstra_project/src/test/resources/features/Product_Shopping_Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Validate customer is able to add items in the shopping cart and compare the product",
  "description": "",
  "id": "validate-customer-is-able-to-add-items-in-the-shopping-cart-and-compare-the-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 6911341857,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate user is able to add dresses in the shopping cart",
  "description": "",
  "id": "validate-customer-is-able-to-add-items-in-the-shopping-cart-and-compare-the-product;validate-user-is-able-to-add-dresses-in-the-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is able to click on the \"Summer Dresses\" menu from the \"Dresses\" menu",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is able to see the summer dresses",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks \"Add To Cart\" button for one summer dress",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is able to see and click the \"Proceed To Checkout\" button on the status dialog",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user validates the \"Product Name\", \"Product Color\" and \"Product Qty\" on the \"Shopping cart summary\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRegistration.userOpenAutomationpracticeWebsite()"
});
formatter.result({
  "duration": 12135734991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Summer Dresses",
      "offset": 30
    },
    {
      "val": "Dresses",
      "offset": 61
    }
  ],
  "location": "ProductShoppingCartVerification.userIsAbleToClickOnTheMenuFromTheMenu(String,String)"
});
formatter.result({
  "duration": 5847706358,
  "status": "passed"
});
formatter.match({
  "location": "ProductShoppingCartVerification.userIsAbleToSeeTheSummerDresses()"
});
formatter.result({
  "duration": 312555278,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add To Cart",
      "offset": 13
    }
  ],
  "location": "ProductShoppingCartVerification.userClicksButtonForOneSummerDress(String)"
});
formatter.result({
  "duration": 564045276,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed To Checkout",
      "offset": 35
    }
  ],
  "location": "ProductShoppingCartVerification.userIsAbleToSeeTheButtonOnTheStatusDialog(String)"
});
formatter.result({
  "duration": 4776211310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product Name",
      "offset": 20
    },
    {
      "val": "Product Color",
      "offset": 36
    },
    {
      "val": "Product Qty",
      "offset": 56
    },
    {
      "val": "Shopping cart summary",
      "offset": 77
    }
  ],
  "location": "ProductShoppingCartVerification.userValidatesTheAndOnThePage(String,String,String,String)"
});
formatter.result({
  "duration": 311073501,
  "status": "passed"
});
formatter.after({
  "duration": 1635110991,
  "status": "passed"
});
});