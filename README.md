# Delivery System

A Java project that demonstrates the use of the Strategy Pattern and Observer Pattern.

## Design Patterns Used

### Strategy Pattern
The delivery method can be changed at runtime.

Implemented strategies:
- Standard Delivery
- Express Delivery
- Same Day Delivery

Each strategy defines:
- Delivery cost calculation
- Estimated delivery time
- Delivery behavior

### Observer Pattern
Customers are notified when delivery information changes.

Notifications can include:
- Delivery driver changes
- Package location changes
- Delivery status changes

## Main Classes

- `DeliveryOrder`
- `DeliveryPackage`
- `Customer`
- `DeliveryDriver`
- `Car`
- `DeliveryStrategy`
- `DeliveryObserver`

## Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub

## Purpose

This project was created to practice object-oriented programming and design patterns in Java.

```mermaid
classDiagram

    class DeliveryStrategy {
        <<interface>>
        +CalculateCost(double weight) double
        +getEstimatedTime() String
        +deliver() void
    }

    class StandardDelivery {
        +CalculateCost(double weight) double
        +getEstimatedTime() String
        +deliver() void
    }

    class ExpressDelivery {
        +CalculateCost(double weight) double
        +getEstimatedTime() String
        +deliver() void
    }

    class SameDayDelivery {
        +CalculateCost(double weight) double
        +getEstimatedTime() String
        +deliver() void
    }

    class DeliveryObserver {
        <<interface>>
        +update(String message) void
    }

    class Customer {
        -int id
        -String name
        -String address
        -String phoneNumber
        +update(String message) void
        +ShowCustomerInfo() void
    }

    class DeliveryPackage {
        -int id
        -String name
        -String category
        -double weight
        +getWeight() double
        +ShowPackageInfo() void
    }

    class Car {
        -String make
        -String model
        -String plate
        -String color
        +ShowCarInfo() void
    }

    class DeliveryDriver {
        -int id
        -String name
        -String phoneNumber
        -Car car
        +getName() String
        +ShowDriverInfo() void
    }

    class DeliveryOrder {
        -Customer customer
        -DeliveryPackage deliverypackage
        -DeliveryStrategy deliverystrategy
        -DeliveryDriver deliveryDriver
        -String currentLocation
        -String status
        +setDeliveryStrategy(DeliveryStrategy strategy) void
        +CalculateDeliveryCost() double
        +ShowEstimatedTime() String
        +Order() void
        +addObserver(DeliveryObserver observer) void
        +removeObserver(DeliveryObserver observer) void
        +setDeliveryDriver(DeliveryDriver driver) void
        +setCurrentLocation(String location) void
        +setStatus(String status) void
    }

    DeliveryStrategy <|.. StandardDelivery
    DeliveryStrategy <|.. ExpressDelivery
    DeliveryStrategy <|.. SameDayDelivery

    DeliveryObserver <|.. Customer

    DeliveryOrder --> DeliveryStrategy : uses
    DeliveryOrder --> DeliveryPackage : contains
    DeliveryOrder --> Customer : belongs to
    DeliveryOrder --> DeliveryDriver : assigned driver
    DeliveryOrder --> DeliveryObserver : notifies

    DeliveryDriver --> Car : drives
```
