<h1>Title: WGU Capstone C868 - Happy Friends Pet Care Appointment Scheduler</h1>
<h2>Purpose: <br>
A pet care veterinary appointment scheduling application with the login ability to access
the existing SQL database with functionality 
to add/ update/ delete customers, animals and appointments info with features such as specialize note adding 
and appointment 15 minutes prior reminder.
(Support English/ French language for application alert, a system restart may be required)
</h2>
<ul>
  <li>Author: Bao Tran</li>
  <li>Student ID# 001683938</li>
  <li>Application Version 1.1</li>
  <li>Date: 01/22/2024</li>
  <li>IDE: IntelliJ IDEA 2023.3.2 (Community Edition) x64</li>
  <li>JDK version: Java 17.0.1</li>
  <li>JavaFX version: JAVAFX.SDK.17.0.1</li>
</ul>



<b>INSTRUCTION:<b> <br>
How to run the program: <br>
Username: admin <br>
Password: admin


<h2>LOGIN SCREEN:</h2>
<p>Launch the program, enter username with password (case-sensitive) on the login screen, click the login button, 
or cancel to exit the program.
The system will pop up the alert if the username and/or password are incorrect, then let the user try again.
Once the user has been validated and logged in - an alert will be displayed letting the user know if there are 
any appointments within 15 minutes or not.</p>
<img src="Screenshots/LOGIN.png" alt="alt text" title="Login" />




<h2>MAIN CUSTOMER MENU:</h2>
<p>After the appointment reminder notification, the user will be directed to the main customer menu where 4 tabs will appear on the top left of the screen 
(Customer, Animals, Appointments, Reports). This screen displays a table with all the available customer information, it also comes with 3 buttons below (Add, Update, Delete). 
The add button will create a new customer, the update button will update an existing customer, and the delete button will remove an existing customer from the system.

<img src="Screenshots/MAIN MENU.png" alt="alt text" title="MainMenu" />

<img src="Screenshots/CUSTOMER - ADD.png" alt="alt text" title="CustomerAdd" />
<img src="Screenshots/CUSTOMER - UPDATE.png" alt="alt text" title="CustomerUpdate" />
</p>


<h2>ANIMALS:</h2>
<p>The animal’s tab will display all existing animal information by default. This includes animal name, type, age, weight... e.g., 
it also comes with 3 buttons below the table (Add Animal, Update Animal, Delete Animal). The add button creates a new animal profile 
and allows to add note, the update button will update an existing animal profile with three buttons Edit Note, New Note, and Delete Note, 
and the delete button will delete the selected animal profile from the system.

<img src="Screenshots/ANIMAL TABLE.png" alt="alt text" title="AnimalTable" />
<img src="Screenshots/ANIMAL - ADD.png" alt="alt text" title="AnimalAdd" />
<img src="Screenshots/ANIMAL - UPDATE.png" alt="alt text" title="AnimalUpdate" />
</p>



<h2>APPOINTMENT:</h2>
<p>The appointment tab will display all existing appointments by default. The user can search specific appointments via titles, 
descriptions, vet tech, and animal names... e.g. from all appointments. Selecting each tab on top of the search box will provide 
weekly appointment outlooks and monthly appointment outlooks, it also comes with 3 buttons below the table (Add Appointment, 
Update Appointment, Delete Appointment). The add button creates a new appointment, the update button will update an existing appointment, 
and the delete button will delete the selected appointment from the system.

<img src="Screenshots/APPOINTMENT TABLE.png" alt="alt text" title="AppTable" />
<img src="Screenshots/APPOINTMENT - ADD.png" alt="alt text" title="AppAdd" />
<img src="Screenshots/APPOINTMENT - UPDATE.png" alt="alt text" title="AppUpdate" />
</p>

<h2>REPORTS:</h2>
<p>The report button will display the report list where there will be two tabs (Appointment Totals, and Vet Tech Schedules) on the top of two tables. 
Each tab will have a different report. The Appointment Totals tab displays the different appointment types and their associated totals. 
On the right side of the appointment totals tab, the appointment totals are broken down by month. The Vet Tech Schedules tab has 
a combo box that allows you to select a vet tech and will display appointments associated with the content in the table view.

<img src="Screenshots/APP REPORT.png" alt="alt text" title="AppReport" />
<img src="Screenshots/VET TECH REPORT.png" alt="alt text" title="VetReport" />
</p>

<p>MySQL Connector Driver Version: mysql-connector-java-8.0.25</p>
