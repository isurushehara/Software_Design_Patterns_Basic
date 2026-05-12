# Template Method Pattern

The **Template Method Pattern** is a **Behavioral Design Pattern** that defines the overall structure of an algorithm in a parent class while allowing subclasses to implement specific steps differently.

This pattern helps to:
- Reuse common logic
- Maintain a fixed workflow
- Allow customization for certain steps

---

# 📌 Definition

> Template Method defines the skeleton of an algorithm in a method, while allowing subclasses to redefine specific steps without changing the algorithm’s structure.

---

# 🧠 Core Idea

The process remains the **same**, but some steps can vary.

## Example

Making beverages:

### Common Steps
1. Boil water
2. Brew beverage
3. Pour into cup
4. Add condiments

### Different Steps
- Tea → Add lemon
- Coffee → Add milk

Instead of rewriting the full process for every beverage, we define the common workflow once and customize only the changing steps.

---

# 🏗️ Structure

```text
Abstract Class
   └── Template Method
         ├── Step 1 (Common)
         ├── Step 2 (Customizable)
         ├── Step 3 (Common)
         └── Step 4 (Customizable)

Concrete Classes
   ├── Implement custom steps
   └── Follow same workflow
```

---

# ⚙️ Components

## 1. Abstract Class
Contains:
- Template method
- Common methods
- Abstract methods

## 2. Template Method
Defines the fixed workflow.

Usually declared as:

```java
final void templateMethod()
```

This prevents subclasses from changing the algorithm order.

## 3. Concrete Classes
Implement the customizable steps.

---

# 📂 Project Structure

```text
Template_Method/
│
├── Beverage/
│   ├── Beverage.java
│   ├── Tea.java
│   ├── Coffee.java
│   └── Main.java
│
├── Banking/
│   ├── BankTransaction.java
│   ├── FundTransfer.java
│   ├── BillPayment.java
│   └── Main.java
│
├── FoodOrder/
│   ├── FoodOrder.java
│   ├── BurgerOrder.java
│   ├── PizzaOrder.java
│   └── Main.java
│
└── Exam/
    ├── Exam.java
    ├── MCQExam.java
    ├── CodingExam.java
    └── Main.java
```

---

# ☕ Example 01 — Beverage Preparation

## Scenario
Tea and coffee follow the same preparation process, but some steps differ.

## Workflow

```text
Boil Water
   ↓
Brew Beverage
   ↓
Pour Into Cup
   ↓
Add Condiments
```

## Customizable Steps
- Brewing
- Adding condiments

---

# 🏦 Example 02 — Online Banking Transaction

## Scenario
Different banking transactions follow the same process.

## Workflow

```text
Login
   ↓
Validate User
   ↓
Perform Transaction
   ↓
Send Confirmation
```

## Customizable Step
- Transaction type

Examples:
- Fund Transfer
- Bill Payment

---

# 🍔 Example 03 — Fast Food Order Preparation

## Scenario
Different food orders follow the same preparation process.

## Workflow

```text
Take Order
   ↓
Prepare Food
   ↓
Pack Food
   ↓
Deliver Food
```

## Customizable Step
- Food preparation

Examples:
- Burger
- Pizza

---

# 📝 Example 04 — Online Examination System

## Scenario
Different exams follow the same process.

## Workflow

```text
Start Exam
   ↓
Answer Questions
   ↓
Submit Exam
   ↓
Generate Results
```

## Customizable Step
- Answering questions

Examples:
- MCQ Exam
- Coding Exam

---

# ✅ Advantages

- Reduces duplicate code
- Keeps workflow consistent
- Improves code reusability
- Easy to maintain
- Centralizes common behavior

---

# ❌ Disadvantages

- Heavy use of inheritance
- Can increase class complexity
- Harder to manage large hierarchies

---

# 🔥 When to Use

Use Template Method when:
- Multiple classes follow the same workflow
- Only some steps vary
- You want to enforce process order
- Common behavior should be reused

---

# 🚫 When Not to Use

Avoid when:
- Algorithms are completely different
- Too many variations exist
- Inheritance becomes difficult to maintain

---

# 🔄 Template Method vs Strategy Pattern

| Template Method | Strategy Pattern |
|---|---|
| Uses inheritance | Uses composition |
| Workflow fixed | Behavior interchangeable |
| Parent controls process | Strategy object controls behavior |
| Compile-time flexibility | Runtime flexibility |

---

# 💡 Real-World Examples

- Beverage preparation systems
- Banking transaction systems
- Online exam systems
- Food ordering systems
- File processing systems
- Game character actions

---

# 📖 Key Takeaway

The **Template Method Pattern** is used when:

> The overall process is the same, but some individual steps are different.

It helps maintain:
- consistency
- reusability
- clean architecture

while allowing subclasses to customize specific behaviors.

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Inheritance
- Abstraction
- Polymorphism

---

# 📚 Design Pattern Category

**Behavioral Design Pattern**

Behavioral patterns focus on communication and interaction between objects.

---

# 👨‍💻 Author

Developed for learning and demonstrating the **Template Method Design Pattern** in Java.