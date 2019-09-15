# Integer to Roman in Java
## Overview

A number in Roman Numerals is a string of the symbols written in descending order (e.g. M is the largest number, followed by D, etc.). 

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000


However, in few specific cases, to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:
•	I placed before V or X indicates one less, so 4 is IV (one less than 5) and 9 is IX (one less than 10).
•	X placed before L or C indicates ten less, so 40 is XL (10 less than 50) and 90 is XC (ten less than a hundred).
•	C placed before D or M indicates a hundred less, so 400 is CD (a hundred less than five hundred) and 900 is CM (a hundred less than a thousand).

Algorithm to convert Integer to Roman Number

1)	Create an array of String of characters used in Roman and store the characters in descending order. (Example - String Symbols[] =  new String[]{“M”,”CM”,”D”,”CD”,”C”,”XC”,”X”,”XL”,”X”,”IX”,”V”,”IV”,”I”}; )
2)	Create an array of integers and store the values of different roman characters in descending order. (Example - int[] val = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1}; )
3)	Initialize a temporary integer variable to 0 (Example - int i=0);
4)	Loop till the input number is greater than 0 (num >0).
5)	Divide the number with integer equivalent of roman number pointed to by index equal to “i” in array declared in step 2.
6)	Get the floor of the quotient obtained in the step 5 and store it in another temporary variable.
7)	Repeat from 0 to less than the value of the quotient obtained in step 6.
a)	Concatenate the roman character at Symbols[i]th position to the temporary string variable (Example – roman_num += Symbols[i]).
b)	Subtract the integer equivalent of roman number with which you divided the input number.
8)	Increment the value of temporary variable which is initialized in step 3. (In this case, increment the value of i).
9)	Repeat from step 5 to 8.	
10)	Return temporary string containing the roman characters (roman_num).

Complexity
The complexity of this algorithm is of the order of (13*3) i.e. O(13*3) i.e. O(1).

Explanation:
The input is guaranteed to be within range 1 to 3999. So the maximum quotient that we can possibly get is 3 and total number of roman literals are 13.
