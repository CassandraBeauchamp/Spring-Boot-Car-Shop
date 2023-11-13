<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
### Cassandra Beauchamp ID: 011631377
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

## Changed line 14 in mainscreen.html, changed from "My Bicycle Shop" to "My Car Shop"
## Changed line 20 in mainscreen.html, changed from "Shop" to "Car Shop"


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

## Made new files in templates: aboutpage.html
## Copied lines 1-12 from mainscreen.html to aboutpage.html
## Changed line 13 in aboutpage.html to About Page from title
## Added About Us Title and Body text to aboutpage.html at lines 14 to 20
## Added button to return to mainscreen to aboutpage.html at line 21
## Made new file AboutPageController
## Added Method to map the aboutpage.html to /aboutpage at line 5 in AboutPageController
## Added button to mainscreen.html at line 21 to go to the about page



E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

## In BootStrapData.Java added products and parts from lines 43-99 as well as if statements to ensure only added once

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

## Added buy button to mainscreen.html at line 87
## Made buyController file to main/java/controllers
## Added varible productRepository to buyController.java at line 11-12
## Added Method buyProduct at line 14 to buyController.java
## Made file success.html in src/resources/templates
## Made file failure.html in src/resources/templates
## Added descriptive messages to success.html and link to mainscreen.html
## Added descriptive messages to failure.html and link to mainscreen.html
## Made file failureController.java in src/main/java/controllers
## Made file successController.java in src/main/java/controllers
## Added mapping to perspective pages in failureController.java and successController.java
## Added buyProduct Method to buyController.java at lines 42-43
## Added varibles to buyController.java at lines 28-38


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

## Added maxInv and minInv int fields to Part.java at lines 31-34
## Added constructor with all existing and new fields to Part.java at lines 31-34
## Added getters and setters for maxInv and minInv in Part.java at lines 65-68
## Added maxInv and minInv amounts to the fields in the parts in BootStrapData.java at lines 43-91
## Added Max Inventory and Min Inventory headers to table on mainscreen.html at lines 40-41
## Added Max Inventory and Min Inventory fields to InhousePartForm.html at lines 23-26
## Added Max Inventory and Min Inventory fields to OutsourcedPartForm.html at lines 24-28
## Added maxInv and minInv values from the part to the the table on mainscreen.html at lines 50-51
## Add checkInventory() method to Part.java at lines 112 to 119. This method checks to see if inventory value is within minInv and maxInv to see if it is a valid amount
## Added call to checkInventory() in AddInhousePartController.java at lines 49-53 to ensure inventory value is within acceptable values.
## Created file InhousePartFormError.html as copy of InhousePartForm.html, but with added text to display error when inventory is not between minInv and maxInv
## Added call to checkInventory() in AddOutsorcedPartController.java at lines 50-54 to ensure inventory value is within acceptable values.
## Created file OutsourcedPartFormError.html as copy of OutsourcedPartForm.html, but with added text to display error when inventory is not between minInv and maxInv


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

## Added logic to EnufPartsValidator.java to check if there is enough parts for the product lines 37-39
## Added more descriptive error message to ValidEnufParts.java at line 20
## Deleted files OutsourcedPartFormError.html and InhousePartFormError.html as no longer needed
## Added text to display errors in user input on InhousePartForm.html on lines 30-35
## Added text to display errors in user input on OutsourcedPartForm.html on lines 32-37
## Created new Files InventoryValidator.java, MaxInventoryValidator.java, MaxValidInventory.java, and Valid Inventory.java in src/main/java/com/example/demo/validators
## Added code to check if part is above minInv in InventoryValidator.java
## Added descriptive message and interface in ValidInventory.java to describe if inventory is below minimum inventory
## Added code to check if part is above maxInv in MaxInventoryValidator.java
## Added descriptive message and interface in MaxValidInventory.java to describe if inventory is above maximum inventory
## Added new validators, ValidInventory and MaxValidInventory to Part.java at line 21-22
## Got rid of calls to checkInventory() in AddOutsourcedPartController.java and AddInhousePartController.java, error checking replaced by new validators

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
## Added test Method setMaxInv() to PartTest.java at lines 104-111
## Added test Method getMaxInv() to PartTest.java at lines 112-119
## Added test Method setMinInv() to PartTest.java at lines 120-127
## Added test Method getMinInv() to PartTest.java at lines 128-135

J.  Remove the class files for any unused validators in order to clean your code.
## Deleted DeletePartValidator.java in src/main/java/com/example/demo/validators due to it being unused