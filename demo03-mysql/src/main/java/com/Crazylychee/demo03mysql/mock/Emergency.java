package com.Crazylychee.demo03mysql.mock;

import lombok.Data;

@Data
public class Emergency {
    private String eventId;
    private String regionId;
    private String eventType;
    private String emergencyLevel;
    private String eventDescription;
    private String createTime;

    @Override
    public String toString() {
        return "Emergency{" +
                "eventId='" + eventId + '\'' +
                ", regionId='" + regionId + '\'' +
                ", eventType='" + eventType + '\'' +
                ", emergencyLevel='" + emergencyLevel + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
