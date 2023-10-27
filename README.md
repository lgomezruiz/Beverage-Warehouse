# Beverage-Warehouse
Small program to create a beverage warehouse using Object Oriented Programming (OPP).
  • Types of drinks: water and soda
  • Drinks characteristics: id, quantity, price, mark, birthplace, %sugar, promotion
  • Functions: add drink, delete drink, show drinks, calculate price (based on total, same mark or warehouse column)

# Output example
![image](https://github.com/lgomezruiz/Beverage-Warehouse/assets/97950503/2a0f8845-af54-4528-928c-31cf1e96675b)

# Exercise Summary
They ask us to make a warehouse, we are going to use object-oriented programming.
A set of drinks are kept in a warehouse.
These products are drinks such as mineral water and sugary drinks (coca-cola, fanta, etc.). For the products we are interested in knowing their identifier (each one has a different one), number of liters, price and brand.
If it is mineral water, we are also interested in knowing the origin (spring, such place or wherever).
If it is a sugary drink, we want to know the percentage of sugar it has and whether or not it has any promotion (if it does, it will have a 10% discount on the price).
In the warehouse we will store these drinks on shelves (which are the columns of the matrix).
The warehouse operations are as follows:
  • Calculate price of all drinks: calculates the total price of all products in the warehouse.
  • Calculate the total price of a brand of drink: given a brand, calculate the total price of those drinks.
  • Calculate the total price of a shelf: given a shelf (column), calculate the total price of those drinks.
  • Add product: add a product in the first free position, if the identifier is repeated in any of the drinks, that drink will not be added.
  • Delete a product: given an ID, delete the product from the warehouse.
  • Show information: we show all its information for each drink.
You can use a main to test the functionalities (add products, calculate prices, display information, etc.)
