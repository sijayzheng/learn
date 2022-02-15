package zheng.sijay.mybatisplus.service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author 郑世杰
 */
public interface ISelectService {
    List<LinkedHashMap<String, Object>> list();
}