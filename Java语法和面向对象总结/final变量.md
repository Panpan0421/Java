# final变量

### final修饰的成员变量为基本数据类型（int, float,double,string......）时，赋值后无法改变

![image-20240415104250657](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240415104250657.png)

### 当final修饰的为引用变量(stringbuilder,stringbuffer)时，在赋值后其指向地址无法改变，但对象内容可以改变

![image-20240415104032320](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240415104032320.png)

![image-20240415104205011](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240415104205011.png)

![image-20240415104102873](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240415104102873.png)

![image-20240415104112316](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240415104112316.png)

### 原因

**对于基本类型变量**：

- 在内存种存储的是一个基本类型值。
- 可以在栈中直接分配内存
- 例如 int a=1; 变量a的值就是int值1；

**对于引用类型变量：**

- 对应内存所存储的值是一个引用，是对象的存储地址。
- 对象的引用在栈中，对象实际存放在堆中。
- 例如 Circle circle = new Circle(9)【参数表示半径】; 变量circle 的值保存的是一个引用，它指明这个Circle对象的内容存储在内存的什么位置。

因此final类型的基本类型变量的值不可改变，而final类型的引用类型变量的值存的是对象的地址，地址不可变，而对象本身的内容未加限制，可以改变。