# Decoding team rocket messages 

## <Statment>
Team rocket is a team of bandits. Currently their goal is to kidnap and sell you favorite pokemon, Pinkachupy, in the black market and they will use the money to buy candies!  
You can't let this happen!   
To gain some visibility of rocket next steps you have intercepted an **encoded** message. A resource of trust told you that the letters `A-Z` are encoded using the following map: 
```
'A' -> "1"
'B' -> "2"
...
'Z' -> "26"
```

However, you've noticed that this is not a good **encoding** method. For example, the number `1106` could be decoded as:  
- `AJP` with the grouping `1 10 16`  
- `AJAF` with the grouping `1 10 1 6`  

Notice that `11 01 16` is not valid, since `01` is not mapped as `A`. In other words, `01` is different from `1`.  

You have realized that rocket team is not actually a real thread, but in order to have some fun, you have decided to intercept all of their messages and calculate how many possible decoding ways the message has. 

## Input format
The input is one single line contains a string **S** of size **N**.  


## Contraints 
- `1 <= N <= 100`  
- **S** contain only digits, but might have leading zeros.  
- The answer is guaranteed to fit in a 32-bit integer.    

## Output format  