package com.starfire.familytree.security.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starfire.familytree.security.entity.UserMenuRight;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author luzh
 * @since 2019-03-03
 */
public interface IUserMenuRightService extends IService<UserMenuRight> {
	public PageInfo<Map<String, Object>, UserMenuRight> page(PageInfo<Map<String, Object>, UserMenuRight> pageInfo);
}
