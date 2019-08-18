package com.starfire.familytree.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starfire.familytree.security.entity.MenuRight;
import com.starfire.familytree.vo.PageInfo;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author luzh
 * @since 2019-03-03
 */
public interface IMenuRightService extends IService<MenuRight> {
    public PageInfo<Map<String, Object>, MenuRight> page(PageInfo<Map<String, Object>, MenuRight> page);
}
