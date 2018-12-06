package homework.l_181206;

/**
 * 本周任务
 */
public class Task {
    public static void main(String[] args) {
        /**
         *  1 用byte表示shot类型，int类型，long类型
         *  2 用float类型表示double类型
         *
         *  eg:byte的范围位为-128-127，现在用byte存储256，传入一个数值，用byte保存起来，还可以获取到这个数值
         */

        short number = 1000;
        System.out.println(storeValue(number));
    }

    /**
     * @param value 传入的shot值
     * @return 用byte组合成的int值
     * <p>
     * 改掉此bug，提交
     */
    private static short storeValue(short value) {
        short result = 0;

        //取高8位
        byte high = (byte) (value >> 8);
        //取低8位(有bug，自己找)
        byte low = (byte) ((value << 8) >> 8);

        //拼接
        result = (short) ((high << 8) + low);

        return result;
    }
}
