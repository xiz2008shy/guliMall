package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 360 Financial Copyright
 *
 * @author YanWenqi
 * @description
 * @date 2021/3/1 13:40
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * test OpenFeign调用远程服务接口
     * @return
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
