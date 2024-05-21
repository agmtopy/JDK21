package st.newlanguagefeatures;

/**
 * 作用:record可以自动生成get/set方法
 * 适用:只适用于'小型不可变对象'
 * 是否建议:不建议使用,lombok更灵活强大
 */
public record RecordKeyword1(String name, Integer age) {

    //重新hashCode方法
    @Override
    public int hashCode() {
        return -1;
    }
}
