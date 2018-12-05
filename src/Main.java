/**
 * 这是所有语言的第一个程序: hello world
 */
public class Main {

    //应用程序的入口
    //只要是基于java的，比如Android，入口一定是这里，如果不是这里，那就不是亲生的
    //参数String []args是一个字符串数组，可以运行的时候传入参数，参数不一定非要是args，可以是abc，def都ok
    //比方说:public static void main(String []hello){System.out.println("我就改你参数怎么了，不服单挑啊!");}参数改成了hello照样可以运行
    public static void main(String[] args) {
        //打印一条语句，换行了
        System.out.println("Hello World!");
        //打印一条语句，不换行
        System.out.print("hello world2!");
        System.out.println("hello world3!");//这一行在上一句的后面，因为上一句没有换行

        //println 换行
        //print 不换行，少了一个ln(line表示一行的意思，在其他任何语言中，凡是不加ln的都认为不换行，加ln的都认为换行)
    }
}
