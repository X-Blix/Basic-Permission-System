##### 一 登录验证问题
如果启动启动类后出现
http://localhost:5240/login
,需要输入用户名和密码：
说明启动了SpringSecurity。
用户名：user
密码：console里随机生成的数字

然后访问controller的控制接口
http://localhost:5240/admin/system/sysRole/findAll
就能出现json里的数据了。

##### 二 、测试接口出现 403Forbidden问题

参考：https://blog.csdn.net/weixin_41987908/article/details/103972262?spm=1001.2014.3001.5506
