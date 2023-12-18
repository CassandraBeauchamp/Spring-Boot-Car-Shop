Author: Cassandra Beauchamp

Project: Spring Boot Car Shop

Project Description: For a Java class, take a bear bones bicycle shop web app and turn it into a car shop and add the needed functionalities

Important Notes: I was give the bear bones for this project, to see my contributions read below or view the commit history


+ Changed line 14 in mainscreen.html, changed from "My Bicycle Shop" to "My Car Shop"
+ Changed line 20 in mainscreen.html, changed from "Shop" to "Car Shop"


# Add an about page

+ Made new files in templates: aboutpage.html
+ Copied lines 1-12 from mainscreen.html to aboutpage.html
+ Changed line 13 in aboutpage.html to About Page from title
+ Added About Us Title and Body text to aboutpage.html at lines 14 to 20
+ Added button to return to mainscreen to aboutpage.html at line 21
+ Made new file AboutPageController
+ Added Method to map the aboutpage.html to /aboutpage at line 5 in AboutPageController
+ Added button to mainscreen.html at line 21 to go to the about page



# Add a sample inventory

+ In BootStrapData.Java added products and parts from lines 43-99 as well as if statements to ensure only added once

# Add a "Buy Now" button to products

+ Added buy button to mainscreen.html at line 87
+ Made buyController file to main/java/controllers
+ Added varible productRepository to buyController.java at line 11-12
+ Added Method buyProduct at line 14 to buyController.java
+ Made file success.html in src/resources/templates
+ Made file failure.html in src/resources/templates
+ Added descriptive messages to success.html and link to mainscreen.html
+ Added descriptive messages to failure.html and link to mainscreen.html
+ Made file failureController.java in src/main/java/controllers
+ Made file successController.java in src/main/java/controllers
+ Added mapping to perspective pages in failureController.java and successController.java
+ Added buyProduct Method to buyController.java at lines 42-43
+ Added varibles to buyController.java at lines 28-38


# Add maximum and minimum inventory for parts

+ Added maxInv and minInv int fields to Part.java at lines 31-34
+ Added constructor with all existing and new fields to Part.java at lines 31-34
+ Added getters and setters for maxInv and minInv in Part.java at lines 65-68
+ Added maxInv and minInv amounts to the fields in the parts in BootStrapData.java at lines 43-91
+ Added Max Inventory and Min Inventory headers to table on mainscreen.html at lines 40-41
+ Added Max Inventory and Min Inventory fields to InhousePartForm.html at lines 23-26
+ Added Max Inventory and Min Inventory fields to OutsourcedPartForm.html at lines 24-28
+ Added maxInv and minInv values from the part to the the table on mainscreen.html at lines 50-51
+ Add checkInventory() method to Part.java at lines 112 to 119. This method checks to see if inventory value is within minInv and maxInv to see if it is a valid amount
+ Added call to checkInventory() in AddInhousePartController.java at lines 49-53 to ensure inventory value is within acceptable values.
+ Created file InhousePartFormError.html as copy of InhousePartForm.html, but with added text to display error when inventory is not between minInv and maxInv
+ Added call to checkInventory() in AddOutsorcedPartController.java at lines 50-54 to ensure inventory value is within acceptable values.
+ Created file OutsourcedPartFormError.html as copy of OutsourcedPartForm.html, but with added text to display error when inventory is not between minInv and maxInv


# Add validation checks for parts

+ Added logic to EnufPartsValidator.java to check if there is enough parts for the product lines 37-39
+ Added more descriptive error message to ValidEnufParts.java at line 20
- Deleted files OutsourcedPartFormError.html and InhousePartFormError.html as no longer needed
+ Added text to display errors in user input on InhousePartForm.html on lines 30-35
+ Added text to display errors in user input on OutsourcedPartForm.html on lines 32-37
+ Created new Files InventoryValidator.java, MaxInventoryValidator.java, MaxValidInventory.java, and Valid Inventory.java in src/main/java/com/example/demo/validators
+ Added code to check if part is above minInv in InventoryValidator.java
+ Added descriptive message and interface in ValidInventory.java to describe if inventory is below minimum inventory
+ Added code to check if part is above maxInv in MaxInventoryValidator.java
+ Added descriptive message and interface in MaxValidInventory.java to describe if inventory is above maximum inventory
+ Added new validators, ValidInventory and MaxValidInventory to Part.java at line 21-22
+ Got rid of calls to checkInventory() in AddOutsourcedPartController.java and AddInhousePartController.java, error checking replaced by new validators

# Add tests for getting and setting min and max inventory

+ Added test Method setMaxInv() to PartTest.java at lines 104-111
+ Added test Method getMaxInv() to PartTest.java at lines 112-119
+ Added test Method setMinInv() to PartTest.java at lines 120-127
+ Added test Method getMinInv() to PartTest.java at lines 128-135

# Remove ununsed files
- Deleted DeletePartValidator.java in src/main/java/com/example/demo/validators due to it being unused

Some small bug fixes:
+ Commented out line 84 in AddProductController.java as it was causing a bug with adding products
+ Fixed logic on line 37 of EnufPartsValidator.java
