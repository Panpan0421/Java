# Java 编程简介<br>
1.源文件应以文件扩展名.java保存。文件名应与类名相同<br>
2.使用JDK的Java编译器将源代码编译为Java字节码（或机器码）<small>(*JDK是Java Development Kit的缩写，是用于开发Java应用程序的软件开发工具包。JDK包含用于开发和运行Java程序所需的工具和库。*)</small><br>
3.终端运行`javac Hello.java`<br>
4.多行注释：以 开始 /* 并以 结束 */，并且可以跨越多行---行尾（单行）注释：从当前行开始//并持续到当前行结束<br>
5.Java程序的基本单位是类,大括号{......}包围了类的主体且在Java中，源文件的名称必须与类的名称相同<br>
## 总结1：
编写源代码 -> 使用JDK的Java编译器将源代码xx.java编译为Java可移植字节码（或机器代码）-> 通过发出命令“ Xxx.class”，使用 JDK 的 Java Runtime 运行编译后的字节码“ java xx”<br>
<br>
6.System.out.println(aString)(print-line) 打印aString，并将光标前进到下一行的开头<br>
  System.out.print(aString)打印aString但将光标放置在打印的字符串之后<br>
  System.out.println()不带参数打印换行符<br>

