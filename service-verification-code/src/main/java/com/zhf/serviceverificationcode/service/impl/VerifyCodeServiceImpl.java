package com.zhf.serviceverificationcode.service.impl;

import com.zhf.internalcommon.dto.ResponseResult;
import com.zhf.internalcommon.dto.verificationcode.VerifyCodeResponse;
import com.zhf.serviceverificationcode.service.VerifyCodeService;

public class VerifyCodeServiceImpl implements VerifyCodeService {
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        return null;
    }
}
