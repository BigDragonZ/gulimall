package cloud.bigdragon.gulimall.product;

import cloud.bigdragon.gulimall.product.entity.BrandEntity;
import cloud.bigdragon.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setDescript("生发");
        entity.setName("霸王");
        brandService.save(entity);
    }

}
