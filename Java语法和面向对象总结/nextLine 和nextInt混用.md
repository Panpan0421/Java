# nextLine 和nextInt混用

![image-20240419122358071](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419122358071.png)

![image-20240419122413269](C:\Users\25762\AppData\Roaming\Typora\typora-user-images\image-20240419122413269.png)

由于`nextLine()`读取整行，包括空格，但不包括终止换行符。

而nextInt在输入完后会自动补换行符，若nextInt在前面会使得nextLine读取不到内容。