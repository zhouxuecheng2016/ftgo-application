package net.chrisrichardson.ftgo.testutil.proxy.cglib;

/**
 * @author zhouxuecheng.
 * @date on 2019/11/8.
 * description .
 */
public class BookFacadeImpl1 {

    public String addBook(final String a, final String b) {
        System.out.println("新增图书...");
        return a + b;
    }

}
