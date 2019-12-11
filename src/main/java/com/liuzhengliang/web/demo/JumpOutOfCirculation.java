package com.liuzhengliang.web.demo;

/**
 *  Java 中如何跳出多重嵌套循环？
 * 答：Java 中跳出多重嵌套循环的两种方式。
 *
 * 方法一：定义一个标号，使用 break 加标号的方式
 * 方法二：使用全局变量终止循环
 */
public class JumpOutOfCirculation {
    static void methodOne() {
        myfor:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("J:" + j);
                if (j == 10) {
                    // 跳出多重循环
                    break myfor;
                }
            }
        }
    }

    static void methodTwo(){
        boolean flag = true;
        for (int i = 0; i < 100 && flag; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("J:" + j);
                if (j == 10) {
                    // 跳出多重循环
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

}
