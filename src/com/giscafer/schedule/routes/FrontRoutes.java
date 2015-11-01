package com.giscafer.schedule.routes;

import com.giscafer.schedule.dict.DictController;
import com.giscafer.schedule.group.GroupController;
import com.giscafer.schedule.index.IndexController;
import com.giscafer.schedule.person.PersonController;
import com.jfinal.config.Routes;
/**
 * 
 * @ClassName: FrontRoutes  
 * @Description: TODO(前端路由)  
 * @author giscafer 
 * @date 2015-11-1 下午4:01:12  
 *
 */
public class FrontRoutes extends Routes{

	public void config(){
		add("/", IndexController.class); //首页
		add("/person", PersonController.class); //人员信息
		add("/dict", DictController.class); //字典翻译
		add("/group", GroupController.class); //分组管理
	}
}