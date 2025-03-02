# 若依 - 脚手架 后端代码

基于若依vue版本（v3.8.9）修改

## 项目日志配置

文件：wangjx-admin/src/main/resources/application-dev.yml

```yaml
# 日志配置
logging:
  level:
    com.turntable: debug
    org.springframework: warn
  file:
    # 日志存放位置 win10
    path: E:\project\${spring.application.name}-logs

```