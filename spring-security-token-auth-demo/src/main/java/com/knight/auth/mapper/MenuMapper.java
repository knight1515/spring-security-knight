package com.knight.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.knight.auth.domain.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userid);
}
