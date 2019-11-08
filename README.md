# Grocery App 

## Vision
Discover your favorite and most cost-effective meals so that you can eat well, shop smart, and stay within your grocery budget. 

## Feature Ideas  
Here are some features I am planning to implement. 

### Your Pantry 
A virtual representation of all of the grocery items in your house. Start by filling your app's pantry with the food you already have. Make sure to include all items from your fridge, cupboards, your actual pantry, etc. In order to benefit from the cost-conscious parts of the app, you are required to enter the cost of each item. You may not remember the exact cost of each item, but make your best guess. Eventually, these items will get used up (or thrown away) and replaced with items you enter into the app right after you buy them (you'll have a more accurate cost then). 

If you maintain your pantry, it will always represent what you have in your kitchen, which is crucial when making grocery shopping lists, browsing your recipes for ones that you already have most of the items for, knowing when items will expire, etc. 

Eventually, the app can tell you where a certain item you buy is usually cheapest. You may buy olive oil at whatever store you happen to be in, but if it's consistently cheapest when you buy it at Sprouts, the app will let you know. 

### Snacks and Meals
A snack is when you eat a single item, such as an apple or a bowl of cashews. When you eat a snack, enter that snack into the app so it can be included in the total cost of the food you ate that day, and so that it can be reflected in your pantry (you now only have two apples left, or only half a bag of cashews). 

A meal is more than one item and is basically a recipe, such as a cheese and nut plate or spaghetti. When cook, enter the recipe as a meal into the app. Just like snacks, meals will have a cost associated with them. You can browse your meals to find ones that are less expensive if you're coming up toward the end of your grocery budget, or find meals that require ingredients you mostly have already. 

### Waste
When you throw something away, enter it into the app. You can see how much you spend on food that is thrown away, and the app can start reminding you that you just bought an item you usually throw away. You can set a reminder to eat that item by a certain time, or the app can suggest recipes that you've used in the past that use it. 

Now that you have your "pantry" of items, when you eat something, select what you ate and how much. The app will tell you how much that meal or snack costs. This will also update your pantry to reflect how much of each item is left. 

## Release Notes 
No releases to production yet.

## Technical details 
This is a Java Spring Boot app using Maven. It uses Spring Boot 2, Java 1.8, and Maven 3.6.2

### To run...
Navigate to the directory you want to clone the repo to

`> cd directory-to-clone-to`

Clone this repository to your directory 

`> git clone https://github.com/KatyORourkee/groceries.git` 

Navigate into grocery-app

`> cd groceries`

Run the app 

`> mvn spring-boot:run`

### API Spec 
Once the app is running locally on http://localhost:8080, you can find the Swagger documentation here:
http://localhost:8080/swagger-ui.html
