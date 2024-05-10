# string，stringbuilder，stringbuffer

|          | String         | StringBuffer           | StringBuilder          |
| -------- | -------------- | ---------------------- | ---------------------- |
| 执行速度 | 最差           | 其次                   | 最高                   |
| 线程安全 | 线程安全       | 线程安全               | 线程不安全             |
| 使用场景 | 少量字符串操作 | 多线程环境下的大量操作 | 单线程环境下的大量操作 |

#### String：

String，默认都是以常量形式保存，且由final修饰，因此在线程池中它是线程安全的。因为每一个String当被创建好了以后，他就不再发生任何变化

#### StirngBuffer：（效率不如StringBuilder，但远比String要高）

在多线程方面的优势还需后续补充

#### StringBuilder：（没有考虑线程安全问题）

在多线程方面的劣势还需后续补充



速度比较：

```java
public class TestMain {
    public static void getStringBuilderTime(){
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 10000;i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void getStringBufferTime(){
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < 10000;i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void getStringTime(){
        long start = System.currentTimeMillis();
        String sb = new String();
        for(int i = 0;i < 10000;i++){
            sb += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        getStringBuilderTime();
        getStringBufferTime();
        getStringTime();
    }
}
```

![image-20240419222452610](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419222452610.png)