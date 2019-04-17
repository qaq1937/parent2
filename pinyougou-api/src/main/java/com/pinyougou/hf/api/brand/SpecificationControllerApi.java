package com.pinyougou.hf.api.brand;

import com.pinyougou.hf.framework.modelgroup.Specification;
import io.swagger.annotations.Api;


@Api
public interface SpecificationControllerApi {

    public Specification findAll();
}
