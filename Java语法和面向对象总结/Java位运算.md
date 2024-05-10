# Java位运算

## &

![image-20240419153956425](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419153956425.png)

![image-20240419154007104](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419154007104.png)

5转换为二进制：0000 0000 0000 0000 0000 0000 0000 0101
3转换为二进制：0000 0000 0000 0000 0000 0000 0000 0011

按位与运算后：0000 0000 0000 0000 0000 0000 0000 0001

## |

![image-20240419154146386](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419154146386.png)

![image-20240419154158941](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419154158941.png)

5转换为二进制：0000 0000 0000 0000 0000 0000 0000 0101
3转换为二进制：0000 0000 0000 0000 0000 0000 0000 0011

0000 0000 0000 0000 0000 0000 0000 0111

## ~

![image-20240419154304706](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419154304706.png)

![image-20240419154314960](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419154314960.png)

5转换为二进制：0000 0000 0000 0000 0000 0000 0000 0101

按位非运算后：1111 1111 1111 1111 1111 1111 1111 1010

在内存中，数值都是以二进制补码形式保存，取反后最高位为1，即为负数，负数的原码是将补码取反+1:1111 1111 1111 1111 1111 1111 1111 1110,即为-6

## ^

![image-20240419155103572](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419155103572.png)

![image-20240419155119124](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419155119124.png)

5转换为二进制：0000 0000 0000 0000 0000 0000 0000 0101
3转换为二进制：0000 0000 0000 0000 0000 0000 0000 0011

按位异或运算：0000 0000 0000 0000 0000 0000 0000 0110

## <<

![image-20240419155235084](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419155235084.png)

![image-20240419155244376](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419155244376.png)

0000 0000 0000 0000 0000 0000 0000 0101 左移2位，低位补0：

------

0000 0000 0000 0000 0000 0000 0001 0100  换算成10进制为20

## >>

**如果值为正，则在高位补0，如果值为负，则在高位补1.**

**负数需要转化为补码操作**

![image-20240419155407600](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419155407600.png)

![image-20240419155425560](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419155425560.png)

## >>>无符号右移运算符

无符号的意思是将符号位当作数字位看待。
即无论值的正负，都在高位补0.