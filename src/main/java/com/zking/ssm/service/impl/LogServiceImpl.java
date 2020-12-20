package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.LogMapper;
import com.zking.ssm.model.Log;
import com.zking.ssm.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class LogServiceImpl implements ILogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Log record) {
        Date d=new Date();
        Timestamp timestamp=new Timestamp(d.getTime());
        record.setTime(timestamp);
        return logMapper.insert(record);
    }

    @Override
    public int insertSelective(Log record) {
        return 0;
    }

    @Override
    public Log selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Log record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Log record) {
        return 0;
    }

    @Override
    public List<Log> selectAll(Log record) {
        List<Log> logs = logMapper.selectAll(record);
        for(Log l:logs){
            if(l.getTime()!=null){
                l.getTime().toString();
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                String time = "2019-09-19";
                try {
                    Date date = ft.parse(time);
                }catch (Exception e){

                }
//                l.setTime(l.getTime().toString());
            }
        }
        return logMapper.selectAll(record);
    }
}
