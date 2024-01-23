print()
item = input("Please Enter an Item Name ")
quantity = int(input("Please Enter the Quantity of the Item "))
cost = int(input("What is the Cost of the Item $"))

total_value = cost*quantity
print()
print("Your totally inventory of " + "'" + item + "'" + " Has a total value of $" + str(total_value))
print()