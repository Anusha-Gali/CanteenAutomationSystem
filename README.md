# Canteen Automation System


## DESCRIPTION
This project is aimed at creating a website that prominently relieves the burden on the canteen’s end as the entire method of taking order is computerised. 
Within this application, all items in the order are displayed along with their equivalent options and supply details that is Items are provided by candidate. This allows canteen staff to speedily go through the orders by token id from students phone and produce the needed items.
Many students visit the canteen in their lunch break and as they have limited time to eat and return to their respective classes this software helps the students to order food and save time without waiting at canteen to order and get food. It lightens the load at canteen’s end by making the entire process of taking orders automatic. 

## INTRODUCTION

### Project Overview:
Canteen Automation System is where the students can order their food and receive food in the canteen without any delay as they can directly go and collect what they’ve ordered without waiting for a turn.
When the customer visits the ordering webpage they are presented with an up to date menu along with prices in a easy to read manner and the customer can also review what was selected before checking out.
It lightens the load at canteen’s end by making the entire process of taking orders automatic. 
Once an order is placed all the details are then given to canteen’s end application which allows canteen employees to go through the orders and produce the necessary items with minimal delay and confusion.

### Existing System:
The Challenges encountered by the manual system in canteens is efficiency and customer satisfaction. 
The experience of ordering in canteens is not pleasant for customers as they have to wait in long queues before placing the order.
When the order is placed they have to wait near the counter until the order is prepared. 
As mentioned the limitations of existing systems are:
•	Verbal Communication.
•	Billing Errors.
•	Miscommunication during peak time.
•	Menus not being regularly updated.
•	Furthermore, not all item on the menu list are always available.

### Proposed System:
The proposed “Canteen Automation System” is economically feasible as the system requires very fewer time factors compared to manual system and provides fast and efficient automated environment instead of slow and error prone manual system, thus reducing both time and manpower.
The system will have GUI interface and very less user training is required to learn it. 
Our objective is to make a platform independent application wherein we use HTML to create webpage, Java(JDBC and servelts) for communication with database(MYSQL).

###	Avantages of Proposed System 
(1)	To order food rapidly in few steps
(2)	To make it convenient for people who have limited time
(3)	Cost reduction
(4)	 Reduced paper work
(5)	Computerized Order


##	SYSTEM REQUIREMENTS

### Software Requirements:
Supported Operating System:
•	Windows 7(32 or 64 bit), Windows 8(32 or 64 bit), Windows 10(32 or 64 bit)
Supported Development Environment:
•	Java(JDBC)
•	Servlet
•	Tomcat
•	CSS
•	HTML

##	TECHNOLOGY

The design of the site has been done using the following technologies:-
(1)	HTML
(2)	CSS
(3)	MySQL
(4)	XML
(5)	SERVLET
(6)	 JDBC CONNECTIVITY

### HTML: HYPER TEXT MARKUP LANGUAGE 
In computing, Hypertext Markup Language (HTML) is a markup language designed for the creation of web pages with hypertext and other information to be displayed in a web browser. HTML is used to structure information denoting certain text as headings, paragraphs, lists and so on and can be used to describe, to some degree, the appearance and semantics of a document. HTML’s grammar structure is the HTML DTD that was created using SGML syntax. The HTML document format is used on the Web. Web pages are built with HTML tags (codes)
embedded in the text. HTML defines the page layout, fonts, and graphic element as well as the hypertext links to other documents on the web. Each link contains the URL, or address, of a Web page residing on the 
same server or any server worldwide, hence “World Wide Web”. HTML 2.0 was defined by the Internet Engineering Task Force (IETF) with a basic set of features, including interactive forms capability. Subsequent versions added more features such as blinking text, custom backgrounds and tables of contents. 

### CSS: CASCADING STYLE SHEETS 
Cascading Style Sheets (CSS) is a stylesheet language used for describing the look and formatting of a document written in a markup language. While most often used to change the style of web pages and user interfaces written in HTML and XHTML, the language can be applied to any kind of XML document, including plain XML, SVG, and XUL. Along with HTML and JavaScript, CSS is a cornerstone technology used by most websites to create visually engaging Webpages, user interfaces for web applications, and user interfaces 
for many mobile applications. 
  
### MySQL 
Modern day websites seem to be relying more and more on complex database systems. These systems store all of their critical data and allow for easy maintenance in some cases. The Structured Query Language (SQL) is a very popular database language, and its standardization makes it quite easy to store, update and access data. One of the most powerful SQL servers out there is called MySQL and surprisingly enough, it’s free. Some of the features of MySQL Include: Handles large databases, in the area of 50,000,000+ records. No memory leaks. Tested with a commercial memory leakage detector (purify). A privilege and password system which is very flexible and secure, and which allows host-based verification. Passwords are secure since all password traffic when connecting to a server is encrypted.
 
### XML
XML is a software and hardware independent tool for storing and transporting data.XML stands for eXtensible Markup Language.XML  was designed to store and transport data.it was designed to be self-descriptive.XML is a W3C recommendation.XML is a quite self descriptive because it has sender information.it has receiver information, it has a heading, it has a message body. It is just information wrapped in tags.XML was designed to carry data with focus on what data it is.XML language has no predefined tags with XML, it must define both the tags and the document structure.XML is extensible language. Most XML applications will work as expected even if new data is
added or removed.

### SERVLET
SERVLETS are java programs that runs on the java-enabled web server or application server. They are used to handle the request obtained from the web server, process the request, produce the response, then send response back to the web server. Today we are all aware of the need of creating dynamic web pages .i.e, the ones which have the capability to change the site contents according to the time or are able to generate the contents according to the request received by the client. If you like coding in JAVA ,then you will be happy to know that java there also exists a way to generate dynamic web pages and that way is Java Servlet.
Properties of servlets:
 (1) Servlets work on the server side.
 (2) Servlets capable to handling complex request obtained from web server.

### JDBC CONNECTIVITY
Java Database Connectivity(JDBC) is an application programming interface(API) for the programming language which defines how a client may access a database.it is a Java-based data access technology used for Java database connectivity.it is part of the Java standard edition platform, from oracle corporation.it provides 
methods to query and update data in a database, and is oriented towards relational databases. A JDBC-to-ODBC bridge enables connections  to any ODBC accessible data source in Java virtual machine(JVM)host environment.

## SYSTEM DESIGN

### SYSTEM  ARCHITECTURE:
 
#### System Architecture
<img width="468" alt="image" src="https://github.com/Anusha-Gali/CanteenAutomationSystem/assets/143547248/09208322-1be6-4640-942f-526c4258a4e5">

#### Data Flow Diagram / Flow Chart
 <img width="468" alt="image" src="https://github.com/Anusha-Gali/CanteenAutomationSystem/assets/143547248/18649f1d-fcdf-4de8-982c-1ae8eaae294e">

## IMPLEMENTATION

### MODULES:
1. Registration module
2. Canteen module
3. Customer module

#### Registration Module:
In registration module we focus on creating a home page which has the description of the website and a login button. Upon clicking onto login the user is redirected into a login page where an existing users can signin into their account and also a registration link is provided for new users to signup. Upon clicking onto SignIn page the users are redirected to either canteen or customer module based on the username and password provided. Upon clicking onto SignUp or registration link the user is redirected to a registration form where he/she can register themselves and then login into customer module. 

#### Canteen Module :
The canteen module is accessible to only the canteen end. They can be able to see the items present on the menu and whether the items are available or not available. The canteen admin is also provided three buttons – Remove , Update , ShowOrders.
In Remove upon entering the text item and the cost the item can be deleted from the menu. In Update upon entering the text item and cost item and its availability the item in the menu list is changed accordingly. The ShowOrders option show the canteen what orders the customers have made. And upon delivering the orders the order can be deleted.

#### Customer Module:
In the customer module when the users login they are shown the menu with items and their cost and a checkbox. The users can selected the items and upon clicking next they are shown the total cost and their token number to collect their items when they reach the canteen.
