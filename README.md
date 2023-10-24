# Project1

This program was designed to manage a list of cars. It takes and reads car data
from an input file, which allowed you to add or remove cars based on specifics and then writes the updated list of cars to an output file.  



UML DIAGRAM



Prog01_aOrderedList
----------------------------------
 
main(args: String[])
+ GetInputFile(UserPrompt: String) : Scanner+ GetOutputFile(UserPrompt: String) : PrintWriter
---------------------------------
                  |
                  |
-----------------v-----------------
              aOrderedList
----------------------------------
 
oList: Comparable[]
listSize: int
numObjects: int
curr: int
----------------------------------
 + aOrderedList()
 + add(newObject: Comparable)
 + size() : int
 + get(index: int) : Comparable
 + isEmpty() : boolean
 + remove()
 + reset()
 + next() : Comparable
 + hasNext() : boolean
resizeArray()
+ toString() : String
----------------------------------
                  |
                  |
-----------------v-----------------
               Car
----------------------------------
 
make: String
year: int
price: int
----------------------------------
 + Car(make: String, year: int, price: int) |
 + getMake() : String
 + getYear() : int
 + getPrice() : int
 + compareTo(other: Car) : int
 + toString() : String

SAMPLE INPUT 

A,Ford,2016,34300
A,Mazda,1998,21300
A,BMW,2008,32100
A,Volkswagen,2009,23200
A,Audi,1994,21200
A,Peugeot,1992,19200
A,Cadillac,1989,14500
A,Mini,1965,25400
A,Suzuki,1981,25700
A,Jaguar,1988,8200
A,Infiniti,1966,26200
A,Fiat,2013,26100
A,Chevrolet,2015,29700
A,Suzuki,1999,21400
A,Volvo,2004,9500
A,Lexus,1989,29000
A,Mitsubishi,2006,22300
A,Cadillac,1982,25400
A,Mini,2010,18500
A,Suzuki,1973,23800
A,Jaguar,1969,29200
A,Infiniti,1974,28000
A,Fiat,1972,16500
A,Chevrolet,1977,27200
A,Suzuki,2002,26100
A,Volvo,1963,16100
A,Lexus,2005,7000
A,Mitsubishi,1989,7700
D,Infiniti,1966,26200
D,Fiat,2013,26100
D,Chevrolet,2015,29700
D,Suzuki,1999,21400
D,Volvo,2004,9500
D,Lexus,1989,29000
D,Mitsubishi,2006,22300
D,Cadillac,1982,25400
D,Mini,2010,18500
A,Kia,2007,4000
A,Honda,2009,10000
A,Toyota,1999,1800
D,Kia,2007,4000
D,Toyota,2000,

SAMPLE OUTPUT

Number of cars: 21
Make: Audi
Year: 1994
Price: $21200
Make: BMW
Year: 2008
Price: $32100
Make: Cadillac
Year: 1989
Price: $14500
Make: Chevrolet
Year: 1977
Price: $27200
Make: Fiat
Year: 1972
Price: $16500
Make: Ford
Year: 2016
Price: $34300
Make: Honda
Year: 2009
Price: $10000
Make: Infiniti
Year: 1974
Price: $28000
Make: Jaguar
Year: 1969
Price: $29200
Make: Jaguar
Year: 1988
Price: $8200
Make: Lexus
Year: 2005
Price: $7000
Make: Mazda
Year: 1998
Price: $21300
Make: Mini
Year: 1965
Price: $25400
Make: Mitsubishi
Year: 1989
Price: $7700
Make: Peugeot
Year: 1992
Price: $19200
Make: Suzuki
Year: 1973
Price: $23800
Make: Suzuki
Year: 1981
Price: $25700
Make: Suzuki
Year: 2002
Price: $26100
Make: Toyota
Year: 1999
Price: $1800
Make: Volkswagen
Year: 2009
Price: $23200
Make: Volvo
Year: 1963
Price: $16100
