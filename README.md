# Prosit 5 - Object-Oriented Programming

## Description
This repository contains the implementation for **Prosit 5**.

## Architecture & Interaction Diagram

```mermaid
sequenceDiagram
    autonumber
    actor User
    participant Main as Main App
    participant Service as Business Service
    participant Model as Entity/Model

    User->>Main: Execute Application
    Main->>Service: Call Business Method
    Service->>Model: Create / Process Objects
    Model-->>Service: Return Result / Status
    Service-->>Main: Return Processed Data
    Main-->>User: Display Output / Logs
