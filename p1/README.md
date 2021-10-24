# Days to train Pinkachupy 

# <Statment> 

Becoming a pokemon trainer is really hard. Some people take almost 20 years to become one! As a trainer, it's your responsibility to advise your disciples on how to win pokemon competitions so as to become masters like you as soon as possible!

The most important tournament in the country, the PINF (Pokemon IN Fight), will happen soon and your best disciple, Ashyie, has asked you to help him to choose the best days to train.  

However, he can only train on **consecutive days**, and his favorite pokemon, Pinkachupy is quite peculiar: **depending on the day his power force (PF) may change**.

Given the number of days **N** that Ashyie has to train until the competition and Pinkachupy's **PF** on each day, choose the days that Ashyie should train, knowing that the sum of the **PF** on these days should be the largest as possible since this will improve the training quality. 

In the end you should tell Ashiye Pinkachupy's total **PF**.

# Input format 

The first line will indicate the number __N__ days.  
The next line contains __N__ elements separated by space indicating Pinkachupy's **PF** on each day.

# Output 

The output format should be a single integer representing the sum of all **PF** in the chosen consecutive days.

## Example 1
### Input
```
9
-2 1 -3 4 -1 2 1 -5 4
```

### Output 
```
6
```

### Explanation 
```
4 -1 2 1 has the largest PF sum = 6.
```


## Example 2
### Input 
```
7
3 4 6 2 4 8 9
```

### Output 
```
36
```

### Example 3 
### Input 
```
5
5 4 -1 7 8
```

### Output
```
23
```

# Contraints 

- `1 <= N <= 10^5`
- `-10^4 <= PF <= 10^4`

