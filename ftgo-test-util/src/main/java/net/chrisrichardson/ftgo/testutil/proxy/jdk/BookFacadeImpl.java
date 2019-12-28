package net.chrisrichardson.ftgo.testutil.proxy.jdk;

/**
 * @author zhouxuecheng.
 * @date on 2019/11/8.
 * description .
 */
public class BookFacadeImpl implements BookFacade {

    @Override
    public String addBook(final String a, final String b) {
        System.out.println("增加图书方法。。。");
        return a+b;
    }
}
