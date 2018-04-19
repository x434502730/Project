package dao;

import java.util.List;
import model.TItem;
import model.TItemExample;
import org.apache.ibatis.annotations.Param;

public interface TItemMapper {
    int countByExample(TItemExample example);

    int deleteByExample(TItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TItem record);

    int insertSelective(TItem record);

    List<TItem> selectByExample(TItemExample example);

    TItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TItem record, @Param("example") TItemExample example);

    int updateByExample(@Param("record") TItem record, @Param("example") TItemExample example);

    int updateByPrimaryKeySelective(TItem record);

    int updateByPrimaryKey(TItem record);
}