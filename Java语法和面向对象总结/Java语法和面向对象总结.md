# Java语法和面向对象总结

## 1.char + char -> int + int -> int

char类型变量之间进行运算是将其转为Unicode编码进行运算

## 2.in.close()

在程序无输入需求后关闭输入流是一个好习惯

## 3.提前进行类型的强制转化才不会影响结果的精确性

double avg = sum / 100; double avg = (double)sum/ 100;

## 4.定义时的一些小问题

```Java
int sumOdd, sumEven = 0;//错误
int sumOdd = 0, sumEven = 0;//正确
```

## 5.调和级数

![](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240327114747250.png)

一开始没有看提示，没有注意到需要把索引i的int类型转化为double

最初的猜测：从右往左一开始就除较大的数，导致保留位数增多，更为精确

查证后与猜测的差不多

### 官方回答：

1. **从左往右计算：**
   - 当从左往右计算时，即按照1 + 1/2 + 1/3 + 1/4 + ...的顺序，计算机会从左侧的项开始计算，依次将每一项加到累加器中。由于从左往右计算时，较小的数值（例如1/2, 1/3, 1/4等）被先加到累加器中，因此可能会出现数值精度的问题。在Java中，如果不小心处理这些较小的数值，可能会导致累加器的精度丢失，从而影响最终结果的准确性。
2. **从右往左计算：**
   - 当从右往左计算时，即按照... + 1/4 + 1/3 + 1/2 + 1的顺序，计算机会从右侧的项开始计算，依次将每一项加到累加器中。这种方式下，较大的数值（例如1/2, 1/3, 1/4等）被先加到累加器中，因此相对较大的数值在累加器中占据了主导地位，更少受到数值精度的影响。这种计算顺序可能会减少由于数值精度问题导致的误差，但仍然可能存在累积误差。

## 6.打印图形时需要注意坐标之间的关联，利用好与行列的关系进行输出

![image-20240329153742963](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240329153742963.png)

![image-20240330150802918](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240330150802918.png)

## 7.字符串修改问题

java中字符串中的某一个值不能修改，需要另建一个字符串来存储

或是直接用stringBuffer或者stringBuilder来进行创建

## 8.题目问题

![image-20240331080833675](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240331080833675.png)

这道题还需加一个第一个1出现前不能出现0的条件

## 9.将数组转化为字符串进行输出（如果不转化，输出的是数组所在地址）

![image-20240401221658218](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240401221658218.png)

![image-20240401221715187](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240401221715187.png)

## 10.将十六进制的每一位上所有值的情况用不可变的数组进行事先声明， 方便后面对应其二进制的转化

![image-20240401223132392](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240401223132392.png)

## 11.将十进制转化为十六进制

依次取出每一位 --> 将每一位对照事先声明的转换表进行输出

![image-20240401224942470](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240401224942470.png)

![image-20240401225422807](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240401225422807.png)

## 12.类中重写toString()

自定义类中重写toString（），调用`System.out.println(c1)`时，实际上会调用`c1.toString()`方法，打印出包含半径信息的字符串表示形式

![image-20240403194202939](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240403194202939.png)

## 13.Sring, StringBuilder, StringBuffer

string字符串内容共享，相同字符串指向同一地址，但不可变

StringBuilder相比于String可变且单线程下比StringBuffer效率高，但非线程安全

StringBuffer与上一行相反

## 14.\uhhhh转义

![image-20240404082741832](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240404082741832.png)

使用\uhhhh进行转义时，hhhh只需要四位Unicode编码，无需再多加H

## 15.Java引用类型有哪些

Java中的引用类型常见有类，接口，数组，枚举（使用new进行创建的）

## 16.堆与栈

堆的效率不如栈主要是由于以下几个原因：

1. 内存分配方式：堆是动态分配内存，需要通过垃圾回收机制来管理内存的分配和回收，而栈是静态分配内存，内存的分配和回收都由编译器自动完成。动态分配内存会带来一定的性能开销。
2. 内存访问方式：在堆中存储的对象是通过引用来访问的，需要通过引用指针来找到对象的实际位置，而在栈中存储的数据是直接存储的数值，访问速度更快。
3. 垃圾回收机制：堆中的对象需要经过垃圾回收机制的处理，包括标记、清除、压缩等操作，这些操作会占用一定的系统资源和时间。

## 17.注意重写和添加的区别

final变量可进行添加操作但不可重写

## 18.先用二维数组存，再进行格式化输出

![image-20240404235148542](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240404235148542.png)

## 19.选择、冒泡、插入排序

选择排序：保证从开头到当前下标（从1开始）的序列是有序的

插入排序：每次在当前下标（从0开始）之后找到最小值插入到当前位置

冒泡排序：每次在从开头到当前位置（末尾开始）开始进行操作：将相邻两个位置不符合顺序的进行位置调换，保证



## 20.判断某天为星期几

```java
public static int getDayOfWeek(int year, int month, int day) {
    int[] monthAdjust = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
    if (month < 3) {
        year -= 1;
    }
    int dayOfWeek = (year + year / 4 - year / 100 + year / 400 + monthAdjust[month - 1] + day) % 7;
    return dayOfWeek;
}
```

## 21.同一类中方法重用

调用相同作用的函数可减少代码量

```java
public MyDate nextDay() {
    day ++ ;
    if (day > DAY_IN_MONTHS[month] || (month == 2 && isLeapYear(year) && day > 29)) {
        day = 1;
        nextMonth();
    }
    return this;
}

public MyDate nextMonth() {
    month ++ ;
    if (month > 12) {
        month = 1;
        nextYear();
    }
    return this;
}

public MyDate nextYear() {
    year ++ ;
    if (year > 9999) {
        System.out.println("错误！");
    }
    return this;
}
```

## 22.子类对父类的变量、方法的重用

一个子类也不一定需要变量，如长方形和正方形之间，正方形可完全用长方形的变量和方法

## 23.组合与继承

若两者之间没有特殊包含与被包含关系（睡觉是人的习惯之一， 睡觉也是猫的习惯之一，但人和猫相互之间不存在包含与被包含的关系），则使用组合

若两者之间有明显大类包含小类的关系（如老虎属于猫属于动物，动物包含猫），则使用继承

## 24.大小端存放

大端序它的高字节（较高位的字节）存储在低地址，低字节存储在高地址；而在小端序中，情况则相反

