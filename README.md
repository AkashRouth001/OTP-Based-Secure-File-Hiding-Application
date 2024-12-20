# 🔒 OTP-Based Secure File Hiding Application

## 🌟 Project Overview
The **OTP-Based Secure File Hiding Application** is a cutting-edge Java application designed to securely hide and unhide sensitive files. With a strong focus on encryption, OTP-based authentication, and seamless user interaction, this project ensures that your files remain private and protected. 

---

## 🚀 Key Features
- **File Hiding & Unhiding**: Effortlessly hide and retrieve files using a secure mechanism.
- **OTP Authentication**: Secure user actions with a one-time password sent via email.
- **Email Verification**: Verifies user identity before granting access.
- **Robust Database Integration**: Utilizes MySQL for efficient data management.

---

## 🛠️ Tech Stack
- **Programming Language**: Java
- **Database**: MySQL
- **Email API**: JavaMail API for secure OTP delivery
- **Libraries**: 
  - `javax.mail`: For email functionalities
  - `java.io`: For file handling
  - `java.sql`: For database interactions

---

## ⚙️ How It Works
### 1️⃣ **Sign Up**
   - Users register with their name and email.
   - A one-time password (OTP) is sent to their email for verification.
   - Successful OTP verification creates the user account.

### 2️⃣ **Login**
   - Enter your registered email.
   - Receive an OTP and authenticate your session.

### 3️⃣ **Home Screen Options**
   - View all hidden files.
   - Hide new files by providing the file path.
   - Unhide files by selecting them from the list.

---

## 📂 Project Structure
```plaintext
javaproject/
├── dao/
│   ├── DataDAO.java      # Handles file-related database operations
│   ├── UserDAO.java      # Manages user-related database interactions
├── db/
│   └── MyConnections.java # Database connection logic
├── model/
│   ├── Data.java         # Data model for file-related info
│   ├── User.java         # Data model for user-related info
├── service/
│   ├── GenerateOTP.java  # OTP generation logic
│   ├── SendOTPService.java # Email service for OTP delivery
│   ├── UserService.java  # Business logic for user operations
├── views/
│   ├── UserView.java     # User-facing file operations
│   ├── Welcome.java      # Sign-up and login interface
├── Main.java             # Entry point of the application
├── resources/            # Additional resources (if any)
└── test/                 # Test cases (optional)
```

---

## 📤 How to Run
1. **Clone the Repository**
   ```bash
   git clone https://github.com/AkashRouth001/OTP-Based-Secure-File-Hiding-Application.git
   ```
2. **Set Up MySQL Database**
   - Create a database named `javaproject`.
   - Import the required tables (`users` and `data`).

   ```sql
   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255),
       email VARCHAR(255)
   );

   CREATE TABLE data (
       id INT AUTO_INCREMENT PRIMARY KEY,
       file_name VARCHAR(255),
       file_path VARCHAR(255),
       user_email VARCHAR(255)
   );
   ```
3. **Update Database Configuration**
   - Modify `MyConnections.java` to include your database credentials.

   ```java
   String url = "jdbc:mysql://localhost:3306/javaproject";
   String username = "your_username";
   String password = "your_password";
   ```
4. **Run the Application**
   - Open the project in IntelliJ IDEA or any Java IDE.
   - Run `Main.java`.

5. **Test the Features**
   - Sign up, log in, and test hiding/unhiding files.

---

## 🔗 API Integration
### JavaMail API
- Used for sending OTPs via email.
- Configuration in `SendOTPService.java`:
  ```java
  properties.put("mail.smtp.host", "smtp.gmail.com");
  properties.put("mail.smtp.port", "465");
  properties.put("mail.smtp.ssl.enable", "true");
  properties.put("mail.smtp.auth", "true");
  ```
- Ensure to generate and use an **App Password** for secure email authentication.

---

## 🧪 Sample Workflow
1. **Sign Up**
   - Enter your name and email.
   - Receive an OTP, input it, and complete registration.
2. **Login**
   - Input your registered email and verify via OTP.
3. **Hide Files**
   - Provide the file path to hide the file securely.
4. **View Hidden Files**
   - Display a list of all hidden files associated with the user.
5. **Unhide Files**
   - Select a file ID to unhide it and make it accessible.

---

## 📧 Contact
Have questions or feedback? Feel free to reach out:
- **Email**: akash789routh@gmail.com
- **GitHub**: [AkashRouth001](https://github.com/AkashRouth001)

---

### ⭐ Acknowledgements
This project showcases the power of Java and MySQL, coupled with a user-friendly interface and robust security measures.

---

### 💡 Future Enhancements
- Encrypt hidden files for added security.
- Add a GUI for a more intuitive user experience.
- Enable file sharing with secure OTP-based authentication.

---

### 🚀 Let's Build a Safer World for Your Files!
