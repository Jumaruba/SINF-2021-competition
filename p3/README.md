# Strongest pokemon path

## <Statment>  
Some people might say that the most important accessory of a pokemon trainer is the Pokedex (a pokemon encyclopedia).  
What many don't know is that a *dangerMap* is even more important. A *dangerMap* is a grid map, which shows how dangerous a path is. **The lower the score is, the more dangerous the path will become.**

For the *dangerMap* below, for example, the square at position `(0,0)` tell us that the dangerous score is 5. 

![image](https://s3.amazonaws.com/hr-assets/0/1636151957-d1d469d41b-Screenshot_2.png)

For the next journey, you want to find the **most secure path** in a map `m x n` starting from the position `(0,0)` and ending at `(m-1, n-1)`. The most secure path is the one, which the **minimum score in the path is the highest as possible**. 
Your goal is to tell your mom your journey will not be that dangerous, for this reason you need to tell her **the score of the most dangerous square**.

## Input format

The first line of the input contains two integers **M** and **N**, which tells the dimensions of the map.
The next **M** lines contains **N** integers separated by spaces, each with the scores **S** of the squares.   

## Constraints  
`1 <= M, N <= 100`  
`0 <= grid[i][j] <= 10^9`  

## Output format
The output should be a single integer containing the minimum value **S** of the path.  
