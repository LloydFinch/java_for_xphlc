package study.s_181207;

/**
 * 条件语句
 */
public class Lesson {

    public static void main(String[] args) {
        boolean aBoolean = true;
        boolean bBoolean = true;
        //if语句
        if (aBoolean) {
            //如果满足aBoolean，在这里执行
        } else {
            //否则在这里执行
        }

        //if-else if 语句
        if (aBoolean) {
            //满足aBoolean，在这里执行
        } else if (bBoolean) {
            //不满足aBoolean，但是满足bBoolean，在这里执行
        } else {
            //上面的都不满足，在这里执行
        }

        //switch语句
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("优秀");//这里加了break，后面的就不会执行了
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");//这里没加break，后面的也会执行
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

}
