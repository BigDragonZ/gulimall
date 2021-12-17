package cloud.bigdragon.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cloud.bigdragon.gulimall.product.entity.CategoryEntity;
import cloud.bigdragon.gulimall.product.service.CategoryService;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.common.utils.R;


/**
 * 商品三级分类
 *
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-15 20:21:30
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类以及子分类，树形展示
     */
    @GetMapping("/list/tree")
    //@RequiresPermissions("product:category:list")
    public R list(@RequestParam Map<String, Object> params) {
//        PageUtils page = categoryService.queryPage(params);
        List<CategoryEntity> list = categoryService.listWithTree();
        return R.ok().put("list", list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
