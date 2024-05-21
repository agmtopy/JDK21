package st.newlanguagefeatures;

/**
 * 作用:使用sealed...permits关键字来修饰抽象类,可以在抽象类内部控制继承关系
 * 适用:严格控制继承关系的场景
 * 是否建议:不建议
 */public abstract sealed class Permits3 permits Circle, Rectangle {

    public static void main(String[] args) {
        Permits3 obj = new Circle();
        switch (obj) {
            case Circle c -> System.out.println("Circle");
            case Rectangle c -> System.out.println("Circle");
        }
    }

}

/**
 * 实现类必须用'sealed','non-sealed','final',等关键字来进行修饰
 */
final class Circle extends Permits3 {

}


non-sealed class Rectangle extends Permits3 {
}

