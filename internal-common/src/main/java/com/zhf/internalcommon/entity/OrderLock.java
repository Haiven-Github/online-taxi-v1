package com.zhf.internalcommon.entity;

import lombok.Data;

@Data
public class OrderLock {
    private Integer orderId;
    private Integer driverId;
    
}