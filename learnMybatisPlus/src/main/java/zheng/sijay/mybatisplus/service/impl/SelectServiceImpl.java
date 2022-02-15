package zheng.sijay.mybatisplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zheng.sijay.mybatisplus.mapper.SelectMapper;
import zheng.sijay.mybatisplus.service.ISelectService;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author 郑世杰
 */
@Service
public class SelectServiceImpl implements ISelectService {
    @Autowired
    private SelectMapper selectMapper;

    @Override
    public List<LinkedHashMap<String, Object>> list() {
        return null;
    }
}