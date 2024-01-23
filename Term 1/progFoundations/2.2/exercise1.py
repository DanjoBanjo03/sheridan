billCost = 35.78
tip = 15

totalTip = billCost * tip/100

print('')

print("Bill Amount: $", billCost, sep = '')
print("Tip Percentage:", str(tip) + "%")
print("Tip Amount: $", round(totalTip, 2), sep= '')
print("Total: $", round(totalTip + billCost, 2), sep='')

print('')