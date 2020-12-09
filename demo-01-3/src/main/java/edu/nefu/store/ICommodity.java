package edu.nefu.store;

import java.util.Map;

/**
 * 发送奖品通用接口
 */
public interface ICommodity {
    /**
     * @param uId         用户Id
     * @param commodityId 商品Id
     * @param bizId       业务Id
     * @param extMap      扩展字段
     */
    void sendCommodity(String uId, String commodityId,
                       String bizId, Map<String, String> extMap);
}
