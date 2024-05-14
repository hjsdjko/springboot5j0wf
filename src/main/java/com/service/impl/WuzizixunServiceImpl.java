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


import com.dao.WuzizixunDao;
import com.entity.WuzizixunEntity;
import com.service.WuzizixunService;
import com.entity.vo.WuzizixunVO;
import com.entity.view.WuzizixunView;

@Service("wuzizixunService")
public class WuzizixunServiceImpl extends ServiceImpl<WuzizixunDao, WuzizixunEntity> implements WuzizixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzizixunEntity> page = this.selectPage(
                new Query<WuzizixunEntity>(params).getPage(),
                new EntityWrapper<WuzizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzizixunEntity> wrapper) {
		  Page<WuzizixunView> page =new Query<WuzizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzizixunVO> selectListVO(Wrapper<WuzizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzizixunVO selectVO(Wrapper<WuzizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzizixunView> selectListView(Wrapper<WuzizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzizixunView selectView(Wrapper<WuzizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
