discountRate = {
    "sunday": "HappYSunDay",
    "monday": "WelComeMondAy",
    "tuesday": "BusyTuesdAY",
    "wednesday":"CooLWEDnesDaY",
    "thursday" : "SuPeRThursday",
    "friday": "BlackFridaY",
    "saturday": "EndSaturday"
}

if __name__=="__main__":
    inp = input("Enter the weekday: ")

    print("Coupon Code: ",discountRate.get(inp.lower(),"Invalid Weekday"))