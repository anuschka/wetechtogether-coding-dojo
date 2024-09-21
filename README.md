Write a function that "draws" a christmas tree with ASCII characters.
The "picture" should be returned as a collection of strings. See the following
examples to understand the requirements:

* Step 1:

drawChristmasTree (0 | undefined);
```
                no tree
```
drawChristmasTree (1);
```
                 x
```
drawChristmasTree (2);
```
                 x
                 x
```
drawChristmasTree (3);
```
                 x
                xxx
                 x
```
drawChristmasTree (6);
```
                 x
                xxx
               xxxxx
              xxxxxxx
             xxxxxxxxx
                 x              
```
* Step 2:

Add a start on the top:
drawChristmasTree(6).addTip("*");
```
                 *
                xxx
               xxxxx
              xxxxxxx
             xxxxxxxxx
                 x  
```
* Step 3:

Now we are decorating our little tree:
drawChristmasTree(9).addTip("*").addOrnaments();
```
                 *
                xxx
               xxxxx
              xxxxxxx
             xxxxxxxxx
                 x  
```

