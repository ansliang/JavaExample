进行序列化的类需要实现`Serializable`接口，该接口中并没有定义任何方法，是一个标识接口。如果类中有可变的引用类型成员变量，则该变量也需要实现`Serializeable`接口，以此类推。