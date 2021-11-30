package com.zhf.serviceverificationcode.service;

import com.zhf.internalcommon.dto.ResponseResult;
import com.zhf.internalcommon.dto.verificationcode.VerifyCodeResponse;

public interface VerifyCodeService {

    /**
     * 根据身份和手机号生成验证码
     * @param identity
     * @param phoneNumber
     * @return
     */
    public ResponseResult<VerifyCodeResponse> generate(int identity , String phoneNumber);

}
