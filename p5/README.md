# Contaminated pokemon

## <Statment>  
When a pokemon master goes in a journey, he usually doens't bring all his pokeballs with him. The biggest part of them is kept at home.   
You're a very organized pokemon master and at home your pokeballs are organized in a **grid** format.  
The problem of keeping all the pokeballs togheter in a grid is that, if a pokemon in a pokeball is sick, after **one day it will contaminate the 4-adjacent pokeballs in the grid.**  
Cosider that in a grid.   
- The healthy pokemons are represented by the number 1;   
- The sick ones are represented by the number 2;  
- The cells with the number 0 does not contain any pokemon.  

An example of contamination is: 

![image](https://s3.amazonaws.com/hr-assets/0/1636139128-c1f2066253-contaminatino.png)

Your mission is to tell the minimum number of days that it will take to an infected pokemon (if any) contaminates all the others in a grid. If it's impossible return -1. 

## Input format
The first line contains two number **M** and **N** indicating the dimensions of the grid (height and width respectively).    
The next **M** lines contains **N** integers each, containing the value **V** of the cell.   

## Constraints 
`1 <= M, N <= 10`  
`V is 0, 1 or 2`  

## Output format
The output format should be a single integer.  