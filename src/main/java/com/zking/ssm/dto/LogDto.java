package com.zking.ssm.dto;

import com.zking.ssm.model.Log;
import lombok.Data;

@Data
public class LogDto extends Log {
    private String qtTime;

    public String getQtTime() {
        return qtTime;
    }

    public void setQtTime(String qtTime) {
        this.qtTime = qtTime;
    }
}
