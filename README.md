# Student Admission Portal

## 1. Description
The **Student Admission Portal** is a simple full-stack Java web application built using **JavaServer Faces (JSF)**, **Hibernate ORM**, and **MySQL**.  
It allows users to register new students, view a confirmation page, and then navigate to a dashboard showing all registered students.  
CRUD operations (Create, Read, Update, Delete) are implemented using Hibernate ORM for database interaction.

This project demonstrates:
- JSF page navigation with managed beans  
- Form validation using JSF converters and validators (email, phone, and age)  
- Data persistence using Hibernate ORM  
- Dynamic data listing in a JSF data table  
- Seamless page flow: `Welcome → Registration → Confirmation → Dashboard`

---

## 2. Software Technologies Used
- **Frontend:** JavaServer Faces (JSF 2.3), XHTML  
- **Backend:** Java 17, Hibernate ORM  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Server:** Apache Tomcat 9  
- **Dependency Injection:** JSF Managed Beans and CDI (Weld)

---


## 3. Database Configuration

- Create a MySQL database:

- CREATE DATABASE studentdb;


- Update your src/main/resources/hibernate.cfg.xml file with your database credentials:

```markdown
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/studentdb?createDatabaseIfNotExist=true</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_mysql_password</property>
<property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
<property name="hibernate.hbm2ddl.auto">update</property>
<property name="show_sql">true</property>
```
## 4. How to Set Up and Run the Project
Step 1: Clone the Repository
```markdown
git clone https://github.com/your-username/student-portal.git
cd student-portal
```
Step 2: Configure the Database

- Make sure your MySQL server is running.
- Update the hibernate.cfg.xml file with your own username and password.

Step 3: Build the Project

- Use Maven to build the WAR file:
```markdown
mvn clean install
```

- This will generate a student-portal.war file inside the target folder.

Step 4: Deploy to Tomcat

- Copy the generated student-portal.war file into your Tomcat webapps folder.
- Start Tomcat.
- Access the application in your browser:
```markdown
http://localhost:9090/student-portal/
```
## 5. Application Workflow

- **Welcome Page (welcome.xhtml)** — Entry point of the portal with a “Register” button.

- **Registration Page (registration.xhtml)** — Allows users to register a new student with validation for:

- **Email format (EmailValidator.java)**

- **Phone number format (10 digits)**

- **Age range (18–60)**

- **Confirmation Page (confirmation.xhtml)** — Displays registered student details and a button to go to the dashboard.

- **Dashboard Page (dashboard.xhtml)** — Lists all registered students from the database and allows deletion.

## 6. Project Structure
```markdown
student-portal/
│
├── src/
│   └── main/
│       ├── java/com/example/
│       │   ├── beans/StudentBean.java
│       │   ├── dao/StudentDAO.java
│       │   ├── model/Student.java
│       │   ├── util/HibernateUtil.java
│       │   └── validators/EmailValidator.java
│       │
│       ├── resources/hibernate.cfg.xml
│       └── webapp/
│           ├── WEB-INF/web.xml
│           ├── welcome.xhtml
│           ├── registration.xhtml
│           ├── confirmation.xhtml
│           └── dashboard.xhtml
│
├── pom.xml
└── README.md
```

##7. Developer Details

- **Name:** Shamita Babukumar
- **Phone:** 9840025309
- **Email:** shamitab0330@gmail.com

