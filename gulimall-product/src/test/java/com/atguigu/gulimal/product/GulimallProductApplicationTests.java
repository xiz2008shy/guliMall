package com.atguigu.gulimal.product;

import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		/*brandEntity.setName("华为");
		brandService.save(brandEntity);
		System.out.println("保存成功");
		*/
		brandEntity.setName("小米");
		brandEntity.setBrandId(3L);
		brandService.updateById(brandEntity);
		System.out.println("修改成功");

	}

}
