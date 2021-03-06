package com.naoh.iossupersign.storage.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.naoh.iossupersign.model.po.AccountDevicePO;
import com.naoh.iossupersign.model.po.DevicePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ami.Tsai
 * @date 2019/12/10
 */
@Mapper
@Repository
public interface DeviceMapper extends BaseMapper<DevicePO> {

    void insertList(@Param("devicePOS") List<DevicePO> devicePOS);

    DevicePO getDeviceByUdid(String udid);

    AccountDevicePO getAccountDeviceByUdid(String udid);
}
