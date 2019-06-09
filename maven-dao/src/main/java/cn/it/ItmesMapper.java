package cn.it;

import org.apache.ibatis.annotations.Select;

public interface ItmesMapper {
    @Select("select * from itmes where id=#{id}")
    Itcast finditems(int id);
}
