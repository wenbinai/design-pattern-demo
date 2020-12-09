package edu.nefu;

import com.alibaba.fastjson.JSON;
import edu.enfu.card.IQiYiCardService;
import edu.enfu.coupon.CouponResult;
import edu.enfu.coupon.CouponService;
import edu.enfu.goods.DeliverReq;
import edu.enfu.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟发奖服务
 */
public class PrizeController {
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        logger.info(reqJson);

        logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
        // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
        if (req.getAwardType() == 1) {
            CouponService couponService = new CouponService();
            CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
            if ("0000".equals(couponResult.getCode())) {
                awardRes = new AwardRes("0000", "发放成功");
            } else {
                awardRes = new AwardRes("0001", couponResult.getInfo());
            }
        } else if (req.getAwardType() == 2) {
            GoodsService goodsService = new GoodsService();
            DeliverReq deliverReq = new DeliverReq();
            deliverReq.setUserName(queryUserName(req.getuId()));
            deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
            deliverReq.setSku(req.getAwardNumber());
            deliverReq.setOrderId(req.getBizId());
            deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
            deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
            deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
            Boolean isSuccess = goodsService.deliverGoods(deliverReq);
            if (isSuccess) {
                awardRes = new AwardRes("0000", "发放成功");
            } else {
                awardRes = new AwardRes("0001", "发放失败");
            }
        } else {
            String bindMobileNumber = queryUserPhoneNumber(req.getuId());
            IQiYiCardService iQiYiCardService = new IQiYiCardService();
            iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
            awardRes = new AwardRes("0000", "发放成功");
        }

        logger.info("奖品发放完成{}。", req.getuId());
        return awardRes;


    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}