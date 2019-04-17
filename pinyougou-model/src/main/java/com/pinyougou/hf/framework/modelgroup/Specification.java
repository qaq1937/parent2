package com.pinyougou.hf.framework.modelgroup;

import com.pinyougou.hf.framework.model.TbSpecification;
import com.pinyougou.hf.framework.model.TbSpecificationOption;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;


/**
 * 规格选项 接收参数
 * @author nianqiang
 */
@Data
@Accessors(chain = true)//支持链式编程
public class Specification implements Serializable{

	private TbSpecification specification;
	private List<TbSpecificationOption> specificationOptionList;
	

}
