package top.littletry.sharezone;

import com.xiaoleilu.hutool.date.DateTime;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.IdcardUtil;

/**
 * @author ht
 */
public class UseHutool {

    public static void main(String [] args){
        //身份证工具使用
        idcardUtil();
    }

    public static void idcardUtil(){
        String ID_SELF = "50023619950905667X";
        //是否有效
        System.out.println(IdcardUtil.isValidCard(ID_SELF));
        //年龄
        DateTime date = DateUtil.parse("2018-02-22");
        System.out.println(IdcardUtil.getAgeByIdCard(ID_SELF,date));
        //生日
        System.out.println(IdcardUtil.getBirthByIdCard(ID_SELF));
        //省份
        System.out.println(IdcardUtil.getProvinceByIdCard(ID_SELF));
        //获取性别
        System.out.println(IdcardUtil.getGenderByIdCard(ID_SELF));

    }
}
