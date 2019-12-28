package net.chrisrichardson.ftgo.testutil.proxy.cglib;

/**
 * @author zhouxuecheng.
 * @date on 2019/11/10.
 * description .
 */
public class CglibTest {

    public static void main(String[] args) {
        BookFacadeImpl1 bookFacade = new BookFacadeImpl1();
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl1 bookCglib = (BookFacadeImpl1) cglib.getInstance(bookFacade);

        System.out.println(bookCglib.addBook("aaaaaa", "bbbbbb"));
        System.out.println(bookCglib.addBook("cccccc", "dddddd"));

    }

}
