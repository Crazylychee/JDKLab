package com.Crazylychee.demo03mysql.mock.mapper;

import com.Crazylychee.demo03mysql.mock.Emergency;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmergencyMapper {

    void insert(Emergency emergency);

    Integer selectCounts();

    void batchInsert(@Param("list") List<Emergency> list);

    List<Integer> selectEventsByCreateTimeRange(
            @Param("startDate") String startDate,
            @Param("endDate") String endDate);



    List<Emergency> selectListById(@Param("eventId")int eventId, @Param("pageSize") int pageSize);
}
