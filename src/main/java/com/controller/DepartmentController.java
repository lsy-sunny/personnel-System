package com.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.BumenEntity;
import com.entity.view.BumenView;

import com.service.DepartmentService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;


/**
 * 部门
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-14 15:36:41
 */
@RestController
@RequestMapping("/bumen")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BumenEntity bumen,
		HttpServletRequest request){
        EntityWrapper<BumenEntity> ew = new EntityWrapper<BumenEntity>();
		PageUtils page = departmentService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bumen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BumenEntity bumen, HttpServletRequest request){
        EntityWrapper<BumenEntity> ew = new EntityWrapper<BumenEntity>();
		PageUtils page = departmentService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bumen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BumenEntity bumen){
       	EntityWrapper<BumenEntity> ew = new EntityWrapper<BumenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bumen, "bumen")); 
        return R.ok().put("data", departmentService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BumenEntity bumen){
        EntityWrapper< BumenEntity> ew = new EntityWrapper< BumenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bumen, "bumen")); 
		BumenView bumenView =  departmentService.selectView(ew);
		return R.ok("查询部门成功").put("data", bumenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BumenEntity bumen = departmentService.selectById(id);
        return R.ok().put("data", bumen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BumenEntity bumen = departmentService.selectById(id);
        return R.ok().put("data", bumen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BumenEntity bumen, HttpServletRequest request){
    	bumen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bumen);
        departmentService.insert(bumen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BumenEntity bumen, HttpServletRequest request){
    	bumen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bumen);
        departmentService.insert(bumen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BumenEntity bumen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bumen);
        departmentService.updateById(bumen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        departmentService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BumenEntity> wrapper = new EntityWrapper<BumenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = departmentService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
