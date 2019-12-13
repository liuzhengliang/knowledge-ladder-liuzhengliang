package com.liuzhengliang.web.demo;


public class HashMap {
    /**
     * 以下程序会输出什么结果？
     * class Person {
     *     private Integer age;
     *     public boolean equals(Object o) {
     *         if (o == null || !(o instanceof Person)) {
     *             return false;
     *         } else {
     *             return this.getAge().equals(((Person) o).getAge());
     *         }
     *     }
     *     public int hashCode() {
     *         return age.hashCode();
     *     }
     *     public Person(int age) {
     *         this.age = age;
     *     }
     *     public void setAge(int age) {
     *         this.age = age;
     *     }
     *     public Integer getAge() {
     *         return age;
     *     }
     *     public static void main(String[] args) {
     *         HashMap<Person, Integer> hashMap = new HashMap<>();
     *         Person person = new Person(18);
     *         hashMap.put(person, 1);
     *         System.out.println(hashMap.get(new Person(18)));
     *     }
     * }
     * 答：1
     * 题目解析：因为 Person 重写了 equals 和 hashCode 方法，所有 person 对象和 new Person(18) 的键值相同，所以结果就是 1。
     * @param args
     */
    public static void main(String[] args) {
        java.util.HashMap hashMap = new java.util.HashMap();
        Car car = new Car(1);
        hashMap.put(car,2);
        System.out.println(hashMap.get(new Car(1)));

    }
}
