package com.pattern.prototype;

import javax.sql.rowset.serial.SerialStruct;
import java.io.*;

/**
 * User: May
 * Date: 2015-06-16
 * Time: 15:04
 */
public class PrototypeTest implements Cloneable, Serializable{
    private long serializeID = 1L;
    private String str;
    private SerialStruct obj;

    //浅拷贝
    public Object clone() throws CloneNotSupportedException {
        return (PrototypeTest)super.clone();
    }

    //深拷贝
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return ois.readObject();

    }

}
