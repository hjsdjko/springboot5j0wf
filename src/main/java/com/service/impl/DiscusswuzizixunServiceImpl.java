package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusswuzizixunDao;
import com.entity.DiscusswuzizixunEntity;
import com.service.DiscusswuzizixunService;
import com.entity.vo.DiscusswuzizixunVO;
import com.entity.view.DiscusswuzizixunView;

@Service("discusswuzizixunService")
public class DiscusswuzizixunServiceImpl extends ServiceImpl<DiscusswuzizixunDao, DiscusswuzizixunEntity> implements DiscusswuzizixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswuzizixunEntity> page = this.selectPage(
                new Query<DiscusswuzizixunEntity>(params).getPage(),
                new EntityWrapper<DiscusswuzizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswuzizixunEntity> wrapper) {
		  Page<DiscusswuzizixunView> page =new Query<DiscusswuzizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswuzizixunVO> selectListVO(Wrapper<DiscusswuzizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswuzizixunVO selectVO(Wrapper<DiscusswuzizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswuzizixunView> selectListView(Wrapper<DiscusswuzizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswuzizixunView selectView(Wrapper<DiscusswuzizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
