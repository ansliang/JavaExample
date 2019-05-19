在克隆对象时，如果对象的成员变量是基本数据类型，则使用浅克隆即可完成。

如果对象的成员变量包括可变引用类型，则需要使用深克隆。
**如果引用类型是不可变的，如String类的对象，则不必进行深克隆**

当需要克隆对象时，需要使用clone()方法，该方法的声明如下：
`protected Object clone() throws CloneNotSupportedException`

需要注意的是，该方法是一个受保护的方法，通常需要重写该方法并将访问权限限定符改为public。该方法将类中各个域进行复制，如果对于引用类型的域，这种操作就会有问题，因此称作浅克隆。提供克隆功能的类需要实现Cloneable接口，否则使用clone()方法时会抛出`CloneNotSupportedException`异常。 