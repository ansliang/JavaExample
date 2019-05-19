```java
 @Override
    public int hashCode() {// 重写hashCode()方法
        return 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 13
                * new Double(weight).hashCode() + 17 * color.hashCode();
    }
```
一种简单的计算哈希码的方式是将重写equals()方法时使用到的成员变量，乘以不同的质数然后求和，以此作为新的哈希码。

注意对于基本数据类型要转换为包装类再计算`11 * new Integer(age).hashCode()`