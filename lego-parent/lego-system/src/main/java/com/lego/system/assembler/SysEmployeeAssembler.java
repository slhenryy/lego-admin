package com.lego.system.assembler;

import org.springframework.stereotype.Component;

import com.lego.core.assembler.BaseAssembler;
import com.lego.core.util.EntityUtil;
import com.lego.system.dto.SysEmployeeInfo;
import com.lego.system.entity.SysEmployee;

@Component
public class SysEmployeeAssembler extends BaseAssembler<SysEmployeeInfo, SysEmployee> {

	@Override
	protected SysEmployeeInfo doCreate(SysEmployee entity) {
		SysEmployeeInfo info = new SysEmployeeInfo();
		info.setCode(entity.getCode());
		info.setName(entity.getName());
		info.setImageCode(EntityUtil.getCode(entity.getImage()));
		info.setDept(createTypeInfo(entity.getDept()));
		info.setCreateTime(entity.getCreateTime());
		info.setEnable(entity.isEnable());
		info.setRoles(createTypeInfo(entity.getRoles()));
		return info;
	}

}
