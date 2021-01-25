# Android Archives

This is my personal Android archives and it's where I store my Android research that aims to provide resources to better interview developers in my engineering management journey.

- [Android](#android-archives)
  - [Architecture](#architecture)
    - [MVC](#mvc)
    - [MVP](#mvp)
    - [VIPER](#viper)
    - [MVVM](#mvvm)

# Android

## Architecture

### MVC

### MVP

### Viper

### MVVM

### What is MVVM?
There are 3 parts to the Model-View-ViewModel architecture:

**Model** is the data layer of your app. It abstracts the data source.

**View** contains the UI of your app. Most often it’s implemented as an Activity or Fragment. View informs ViewModel of user interactions and displays results received from the ViewModel. View should be lightweight and contain zero to very little business logic.

**ViewModel** serves as a bridge between your View and Model. It works with the Model to get and save the data. The View observes and reacts to the data changes exposed by the ViewModel.

Here is a typical high level MVVM app architecture:

![Alt text](https://cdn-images-1.medium.com/max/800/1*tO9RsrblUPOv_u0loUM97g.png)

### Dependency Injection with Dagger 2

Apps rely on instantiating objects that often require other dependencies. For instance, a Twitter API client may be built using a networking library such as Retrofit. 

### Advantages

* Simplifies access to shared instances
* Easy configuration of complex dependencies
* Easier unit and integration testing
* Scoped instances

### Room persistence

The Room persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

### Entity

In the context of Architecture Components, the entity is an annotated class that describes a database table.
SQLite database: On the device, data is stored in a SQLite database. The Room persistence library creates and maintains this database for you.

### DAO

Short for data access object. A mapping of SQL queries to functions. You used to have to define these queries in a helper class. When you use a DAO, your code calls the functions, and the components take care of the rest.

### Room database

Database layer on top of a SQLite database that takes care of mundane tasks that you used to handle with a helper class. The Room database uses the DAO to issue queries to the SQLite database based on functions called.

