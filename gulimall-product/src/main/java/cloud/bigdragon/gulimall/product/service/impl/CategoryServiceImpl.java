package cloud.bigdragon.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.common.utils.Query;

import cloud.bigdragon.gulimall.product.dao.CategoryDao;
import cloud.bigdragon.gulimall.product.entity.CategoryEntity;
import cloud.bigdragon.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        /**
         * 1、获取所有菜单
         * 2、获取所有一级菜单：parentCid == 0
         * 3、遍历，递归设置下一级菜单
         */
        List<CategoryEntity> allMenus = baseMapper.selectList(null);
        List<CategoryEntity> level1Menus = allMenus.stream().
                filter(entity -> entity.getParentCid() == 0).map(item -> {
                    item.setChildRen(getChildren(item, allMenus));
                    return item;
                }).sorted(Comparator.comparingInt(m -> m.getSort() == null ? 0 : m.getSort())).collect(Collectors.toList());
        return level1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> allMenus) {
        List<CategoryEntity> result = allMenus.stream().filter(item -> item.getParentCid() == root.getCatId()).map(item -> {
            item.setChildRen(getChildren(item, allMenus));
            return item;
        }).sorted(Comparator.comparingInt(m -> m.getSort() == null ? 0 : m.getSort())).collect(Collectors.toList());
        return result;
    }

}