package st.newlanguagefeatures;

import java.util.ArrayList;
import java.util.List;

/**
 * 作用:局部变量类型推断
 * 适用:定义局部变量
 * 建议:推荐对象类型使用,简化代码,增加可读性,基本类型不使用
 */
public class Var7 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();
        var list3 = new ArrayList<String>();
    }

}
