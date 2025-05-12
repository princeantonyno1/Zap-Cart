# ⚡ Zap-Cart

A modern and feature-rich Spring Boot web application that allows users to buy and sell digital products — including ebooks, music, and movies — via a secure, seamless, and intuitive marketplace.

---

## 📸 Screenshots

| Admin | Explore | Purchased Items |
|-----------|--------------|-----------------|
| ![{F5ADED95-4491-4B97-9709-C7951FC86CF4}](https://github.com/user-attachments/assets/eb486452-54eb-48fe-b43f-f5b26d246ed9) | ![{8B9665C5-8ECB-4873-9EE7-6400B5D26209}](https://github.com/user-attachments/assets/5a678dcd-5568-4a16-abdb-b31b7d2943fc) | ![{3DC937EF-9784-400C-84E1-156A9C41061F}](https://github.com/user-attachments/assets/5d322b86-bcfe-46bd-8d74-bdbc9f6c31b6) |


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
| Dev Tools       | Maven, Lombok, Swagger UI              |

---


## 🧑‍💻 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven 3.6+
- MySQL
- Stripe API keys
- (Optional) AWS credentials (if upgrading to S3)

---

##📘 API Documentation
Zap-Cart includes a Swagger UI for interactive API testing:

👉 http://localhost:8080/swagger-ui/index.html

---

### 🔧 Installation

```bash
# Clone the repository
git clone https://github.com/your-username/zap-cart.git
cd zap-cart

# Copy environment variables template
cp .env.example .env

# Edit the .env file with your credentials

# Run the application
./mvnw spring-boot:run


🛡️ Admin: Manage platform, view analytics

🔧 API Documentation
Zap Cart uses Swagger UI for API exploration:

🔗 http://localhost:8080/swagger-ui/index.html
