Insight - An SK Profiling System Program.

A profiling system focused on the youth while also being managed by youth leaders. A program to replace the traditional way of profiling: pen and paper then transported to a spreadsheet.
We used Java and SQL to combine the process and make it more seamless for those in charge. It features the CRUD requirement, Create, Update, and Delete. Being able to register  residents, update their information, and delete them should be needed.

HOW TO RUN
* Software requirements:
a. Netbeans IDE (v21) - For code launching
b. XAMPP (v 3.2.2) - For database connection

* Libraries (Located in the "Imports" folder):
a. Flatlaf (8.3.0) - Used to change the look of Java Swing components
b. MySQLConnector (3.4) - Used to connect the program to the localhost database
c. JBCrypt (0.4) - Used to add extra layer of hash or protection to the password
d. Password4j (1.7.3) - Used to add extra password management capabilities
e. SLF4J (2.0.7) - Required dependency of Password4j
f. iyouth-1 - The database to be imported into XAMPP. (It has the legacy name of our program)

For instructions on importing JAR files to your project, refer to: https://www.youtube.com/watch?v=OQOpYHwA1A0

IMPORTANT
This is not the final version of the project. We are actively working to improve the design, user interface, and overall functionality. Future development will focus on:

- Consistent design language
- Enhanced UI features (show/hide table names, etc.)
- Improved error handling
- Increased database security

MEMBERS
Espaldon, Robbie 		- Project Leader
Basilio, Angelo     		- Researcher
Fat, Andrew         		- System Analyst
Maraño, Jasper    		- Programmer
Tamparong, Dhan		- Designer

Project duration: 	2nd Term of Sophomore year
				(February 2024 - March 2024)

We appreciate your interest in this project!

GW™
=============================================================================
PREVIOUS DOCUMENTATION (IGNORE)

Created March 02, 2024.

V.2.0 IS HERE!

Difference from V.1.0:
  - UI Overhaul. Now inspired by websites
  - Color scheme change
  - Utilization of FlatLaf plugin for Netbeans

Pre-Requisites:
  - Will only work with Netbeans IDE
  - Check out FlatLaf documentation for tutorials: https://www.formdev.com/flatlaf/

Needs improvement:
  - Sidebar icons
  - Smooth UI flow
  - Implementation of front end features

>>> FROM V.1.0 DOCUMENTATION:
Basic foundation of the program Insight for Sangguniang Kabataan residents of a barangay. 
Those features are:

Login page:
  Should redirect users to Admin or Basic view depending on their clearance level.

AdminView_Basic:
  Shows the basic table with lesser details compared to advanced view

AdminView_Advanced:
  Shows more details of the table when toggled on.

BasicView:
  Is the same with admin view but without the register, update, and remove user features. View only mode.

Registration:
  Allows users to register and add their information to the table.

Edit Information:
  Allows user to update existing information.

# To be updated features:
- Better UI design
- Integration of SQL
- Connection of pages
- Error handling

