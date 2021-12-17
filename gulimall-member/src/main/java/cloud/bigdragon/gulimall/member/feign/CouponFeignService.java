package cloud.bigdragon.gulimall.member.feign;

import cloud.bigdragon.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
