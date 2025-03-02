package com.wangjx;

import com.wangjx.common.core.domain.entity.SysUser;
import com.wangjx.common.utils.SecurityUtils;
import com.wangjx.system.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ISysUserService sysUserService;

    @Test
    public void resetPwd() {
        String userName = "admin";
        String newPassword = "123456";
        String encryptPassword = SecurityUtils.encryptPassword(newPassword);
        sysUserService.resetUserPwd(userName, encryptPassword);
    }

    @Test
    public void test() {
        SysUser sysUser = sysUserService.selectUserById(1L);
        log.info("sysUser = {}", sysUser);
    }

}
