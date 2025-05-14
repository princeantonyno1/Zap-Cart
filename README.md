# ⚡ Zap-Cart

A modern and feature-rich Spring Boot web application that allows users to buy and sell digital products — including ebooks, music, and movies — via a secure, seamless, and intuitive marketplace.

---

## 📸 Screenshots

| Admin | Explore | Purchased Items |
|-----------|--------------|-----------------|
| ![{D9EA339B-D3E0-429F-9F19-F9044ACA11C8}](https://github.com/user-attachments/assets/11177da5-13bb-4430-a01a-405ef1139589) | ![{8E6809F3-D3AA-4E0A-86F8-D79C7F8733A9}](https://github.com/user-attachments/assets/3da5ff9c-5096-4ac7-969a-3bdc6c162320) | ![{5DCBE003-0573-4FF7-A725-52367A305FD8}](https://github.com/user-attachments/assets/40ee7521-d1b4-4f7d-8a26-074d658a2bdf) |


---

## 🚀 Features

- 🛒 Browse and purchase digital products (books, songs, movies)
- 👨‍💻 Vendor dashboard to upload and manage listings
- 🔍 Advanced search with filters and categories
- 💳 Secure checkout with Stripe integration
- 📂 Instant digital downloads post-purchase
- 🔐 JWT-based authentication & role-based access control
- 📈 Admin dashboard with sales & product analytics
- 📱 Responsive UI (mobile & desktop)

---

## 🔐 Roles and Access Control

### Role	Permissions

👤 Guest	Browse products

🧑‍💼 Customer	Buy products, leave reviews

🛍️ Vendor	Upload/manage product listings

🛡️ Admin	Manage users, products, view analytics

---

## 🏗️ Tech Stack

| Layer           | Technologies                          |
|----------------|----------------------------------------|
| Backend         | Spring Boot, Spring Security           |
| Frontend        | Thymeleaf                              |
| Database        | MySQL                                  |
| ORM             | Spring Data JPA (Hibernate)            |
| Authentication  | JWT, Spring Security                   |
| File Storage    | Local File System                      |
| Payment Gateway | Stripe                                 |
| Testing         | JUnit, Mockito                         |
| Dev Tools       | Maven, Lombok           |

---


## 🧑‍💻 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven 3.6+
- MySQL
- Stripe API keys
- (Optional) AWS credentials (if upgrading to S3)



---

### 🔧 Installation

```bash
# Clone the repository
git clone https://github.com/princeantonyno1/zap-cart.git
cd zap-cart

# Copy environment variables template
cp .env.example .env

# Edit the .env file with your credentials

# Run the application
./mvnw spring-boot:run
