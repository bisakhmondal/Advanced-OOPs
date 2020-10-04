def decode(num):
    if(num>=100000):
        return 
    single_digits = ["zero", "one", "two", "three", 
                     "four", "five", "six", "seven", 
                     "eight", "nine"]

    two_digits = ["ten", "eleven", "twelve", 
                  "thirteen", "fourteen", "fifteen", 
                  "sixteen", "seventeen", "eighteen",
                  "nineteen"]
 
    tens_multiple = ["", "", "twenty", "thirty", "forty",
                     "fifty", "sixty", "seventy", "eighty", 
                     "ninety"]
 
    tens_power = ["hundred", "thousand"]


    thouDigits = int(num/1000)
    hunDigit = int(num/100)-10*thouDigits
    deciDigits=  num- 100*hunDigit - 1000*thouDigits


    phrase, two='',False

    if thouDigits>=9 and thouDigits<20:
        phrase+= two_digits[thouDigits%10]+' '
        two=True
    elif thouDigits>19:
        phrase += tens_multiple[int(thouDigits/10)] +' '
    
    if not two and thouDigits!=0:
        phrase+= single_digits[thouDigits%10]+ ' '
    if len(phrase.strip())!=0:
        phrase+=tens_power[1]+' '
    
    if not hunDigit==0:
        phrase+=single_digits[hunDigit]+' '+tens_power[0]+' '
    
    if deciDigits>=10 and deciDigits<20:
        phrase+=two_digits[deciDigits%10]+' '
    else:
        phrase+=tens_multiple[int(deciDigits/10)]+' '
        if deciDigits%10 !=0:
            phrase+=single_digits[deciDigits%10]

    return phrase.strip()

n=int(input("Enter the Number: "))

print(decode(n))