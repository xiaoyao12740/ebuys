# E买网购物平台

一个基于 Spring Boot + MyBatis 的简易电商网站课程项目，实现了用户注册登录、商品展示、评论、订单等基础功能，并接入外部API完成评论内容合规校验。
 项目背景
本课程项目为电子商务基础课程设计实训，目标是完成一个具备基础购物功能的Web应用，熟悉 Java Web 分层开发、数据库设计与前后端联调流程。

 技术栈
- **后端框架**：Spring Boot、MyBatis、Maven
- **数据库**：MySQL、Navicat、MySQL Workbench
- **前端基础**：HTML/CSS（页面简单实现）
- **其他工具**：JPA注解、Postman（接口测试）
 功能模块

- 用户模块：注册、登录、注销
- 商品模块：商品列表、商品详情、按分类分页查询
- 购物车模块：添加商品、数量调整（实体层支持）
- 订单模块：订单生成、订单列表
- 评论模块：留言展示、发表评论、评论合规校验（接入外部API）
- 新闻模块：公告展示、新闻详情
- 收货地址模块：地址管理（实体层支持）
 数据库表结构
共涉及 9 张核心表：
| 表名 | 说明 |
|------|------|
| `easybuy_user` | 用户信息 |
| `easybuy_product` | 商品信息 |
| `easybuy_product_category` | 商品分类（支持二级） |
| `easybuy_product_desc` | 商品详情 |
| `easybuy_comment` | 用户评论 |
| `easybuy_news` | 公告/新闻 |
| `easybuy_shopping` | 购物车 |
| `easybuy_order` | 订单主表 |
| `easybuy_order_detail` | 订单明细 |
| `easybuy_address` | 收货地址 |

 项目结构

采用三层架构设计：

```
cn.ebuy
├── controller     # 控制层，处理HTTP请求
├── service        # 业务逻辑层
├── mapper         # 数据访问层（MyBatis）
├── pojo           # 实体类（JPA注解）
```

 部分功能截图

> （可以放几张截图，如首页、商品详情、评论页等）

 如何运行

1. 克隆项目到本地
```bash
git clone https://github.com/你的用户名/easybuy.git
```

2. 导入IDE（推荐 IntelliJ IDEA）

3. 创建MySQL数据库，导入项目根目录下的 `easybuy.sql` 文件

4. 修改 `application.properties` 中的数据库连接信息
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/easybuy
spring.datasource.username=root
spring.datasource.password=你的密码
```

5. 运行 `EbuyApplication.java` 主类

6. 访问 `http://localhost:8080`

 项目亮点

- 设计了通用 `BaseServiceImpl` 基类，通过泛型和反射实现通用 CRUD，减少重复代码
- 使用 PageHelper 实现商品分页查询
- 对接外部 API 完成用户评论的合规校验（调用 Kimi token 接口）
- 数据库表设计合理，支持多表关联查询

 项目总结

通过本课程项目，熟悉了 Spring Boot + MyBatis 的开发流程，掌握了从需求分析、数据库设计到功能实现的全过程。项目虽未商用，但具备了完整的电商基础功能闭环。

 后续改进方向

- 增加商品搜索功能
- 引入 Redis 做缓存优化
- 完善前端页面交互体验
- 增加用户权限管理

 参考资料

- [Spring Boot 官方文档](https://spring.io/projects/spring-boot)
- [MyBatis 官方文档](https://mybatis.org/mybatis-3/)
- [PageHelper 分页插件](https://pagehelper.github.io/)
