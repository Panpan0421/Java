# enum

枚举，枚举限制变量只能是预先设定好的值。使用枚举可以减少代码中的 bug，方便很多场景使用

- **星期：** Monday（星期一）、Tuesday（星期二）、Wednesday（星期三）、Thursday（星期四）、Firday（星期五）、Saturday（星期六）、Sunday（星期日）
- **性别：** Man（男）、Woman（女）
- **季节：** Spring（春天）、Summer（夏天）、Autumn（秋天）、Winter（冬天）

![image-20240420101613391](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240420101613391.png)

## 枚举类

```java
// 自定义枚举类
public class Season {
    private final String seasonName;
    // 构造函数只能为私有，只能内部调用
    private Season(String seasonName) {
       this.seasonName = seasonName;
    }
    
    public static final Season SPRING = new Season("春天");
    public static final Season SUMMER = new Season("夏天");
    public static final Season AUTUMN = new Season("秋天");
    public static final Season WINTER = new Season("冬天");

    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                '}';
    }
}

// enum枚举类
 public enum Season {
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    private final String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }
}

public class SeasonTest {
   public static void main(String[] args) {
         Season spring = Season.SPRING;
         System.out.println(spring);                     //SPRING
         System.out.println(spring.getSeasonName());     //春天
    }
}
```

少了创建常量对象的部分

在没有重写toString的情况下，会打印对象地址，说明enum枚举类的父类不是Object类而是Enum类

## enum中的方法

### name（）

name()就是根据枚举成员来获取该枚举成员的字符串名称，name方法是用final修饰的不能被重写

### valueof（）

**传入一个字符串，然后将它转换成对应的枚举成员**。这里传入的字符串必须与定义的枚举成员的名称一致

### values()

values方法的名字中就带有一个s，再加上它的返回值是一个字符串数组。所以我们就可以得出它的作用是获取枚举成员的所有值，这些值并以数组的形式存储。

```java
Season[] seasons = Season.values();
for (Season season : seasons) {
    System.out.print(season + " ");
}

//结果 ：SPRING SUMMER AUTUMN WINTER
```

### ordinal（）

该方法是获取枚举成员的序数，其第一个枚举成员位置为0

### compareTo（）

compareTo方法比较的是两个枚举成员的次序数，并返回次序相减后的结果。



## 待补充

#### enum 用于switch语句、实现接口、使用接口对枚举分类、 EnumSet集合