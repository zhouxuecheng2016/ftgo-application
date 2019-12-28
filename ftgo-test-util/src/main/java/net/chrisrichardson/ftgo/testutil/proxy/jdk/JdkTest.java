package net.chrisrichardson.ftgo.testutil.proxy.jdk;

/**
 * @author zhouxuecheng.
 * @date on 2019/11/8.
 * description .
 */
public class JdkTest {

    public static void main(String[] args) {
        BookFacadeImpl bookFacadeImpl = new BookFacadeImpl();
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookfacade = (BookFacade) proxy.bind(bookFacadeImpl);
        String result = bookfacade.addBook("aaaaaa","bbbbbb");
        System.out.println(result);
    }

}
