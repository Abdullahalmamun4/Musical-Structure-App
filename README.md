# Musical Structure - Project Specification

[![N|Solid](http://i.imgur.com/bMBnFR5m.png)](https://nodesource.com/products/nsolid) [![N|Solid](http://i.imgur.com/BM9qdAIm.png)](https://nodesource.com/products/nsolid) [![N|Solid](http://i.imgur.com/o6phPJ9m.png)](https://nodesource.com/products/nsolid) [![N|Solid](http://i.imgur.com/b8U2IZSm.png)](https://nodesource.com/products/nsolid)

# #App Design
-------

### Suitability
The app’s structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.

### Clarity
Each activity is clearly labelled, using a TextView, such that the final purpose of such an activity is easy to understand. For instance, one screen might be labelled ‘song detail screen’ and another might be labelled ‘music library’

### Plan for creation
- App must contain a Payment Activity. Student should find an external library or API that can be used in this situation. In the TextView of that activity, describe the library or API and how it can be used.
- Any other Activity that requires an external library or class not yet covered also includes the name of that library or class.

### Number of activities
The app contains 3 to 6 activities.


# #Layout
-------

### Structure
The app contains multiple activities, each labelled, which together make a cohesive music app.

### Labelling
Each activity contains a TextView which explains the purpose of the activity.

### Buttons
Each activity contains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a ‘library’ activity might contain a button to move to the ‘now playing’ activity.

### Layout Best Practices
The code adheres to all of the following best practices:
- Text sizes are defined in sp
- Lengths are defined in dp
- Padding and margin is used appropriately, such that the views are not crammed up against each other.


# #Functionality
-------

### Runtime Errors
The code runs without errors

### OnClickListeners
Each button’s behavior is determined by an *OnClickListener* in the Java code rather than by the android:onClick attribute in the XML Layout.

### Intents
Each button properly opens the intended activity using an explicit Intent.


# #Code Quality
-------

### Code Formatting
The code is properly formatted i.e. there are no unnecessary blank lines; there are no unused variables or methods; there is no commented out code.
The code also has proper indentation when defining variables and methods.

### Readability
Code is easily readable such that a fellow programmer can understand the purpose of the app.

### Naming Conventions
All variables, methods, and resource IDs are descriptively named such that another developer reading the code can easily understand their function.
