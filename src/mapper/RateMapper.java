package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Rate;
import pojo.RateExample;

public interface RateMapper {
    int countByExample(RateExample example);

    int deleteByExample(RateExample example);

    int insert(Rate record);

    int insertSelective(Rate record);

    List<Rate> selectByExample(RateExample example);

    int updateByExampleSelective(@Param("record") Rate record, @Param("example") RateExample example);

    int updateByExample(@Param("record") Rate record, @Param("example") RateExample example);
}