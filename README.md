# EBuy 电商平台

一个基于 **Spring Boot + JSP + MyBatis + MySQL** 实现的教学型电商网站项目，包含用户登录注册、商品分类浏览、商品详情展示、新闻公告查看、留言互动等基础功能。

本项目更偏向 Java Web 课程设计与综合练习，适合作为个人学习成果展示、课程项目归档以及 GitHub 作品集中的 Web 类项目补充。

---

## 项目简介

EBuy 是一个基础型电商网站项目，围绕“商品展示 + 用户访问 + 内容互动”这一核心场景展开，实现了一个典型的商城前台原型。

项目主要覆盖以下业务模块：

- 用户登录、注册、退出
- 首页商品与分类展示
- 商品分类浏览与分页查询
- 商品详情页展示
- 新闻/公告浏览
- 在线留言提交与查看

从技术实现上看，该项目采用了较为经典的 Java Web 分层结构：

- Controller 负责请求分发
- Service 负责业务处理
- Mapper 负责数据库访问
- JSP 负责页面渲染

整体结构清晰，适合用于展示基础 Web 开发能力和 Java 后端项目搭建能力。

---

## 技术栈

### 后端
- Java
- Spring Boot 2.5.3
- MyBatis
- PageHelper
- Maven

### 前端
- JSP
- JSTL
- HTML / CSS
- JavaScript
- jQuery

### 数据库
- MySQL

---

## 项目结构

```text
ebuys/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cn/ebuy/
│   │   │       ├── controller/
│   │   │       ├── mapper/
│   │   │       ├── pojo/
│   │   │       ├── service/
│   │   │       └── EbuyApplication.java
│   │   ├── resources/
│   │   │   └── application.yml
│   │   └── webapp/
│   │       ├── WEB-INF/jsp/
│   │       ├── css/
│   │       ├── images/
│   │       ├── jd/
│   │       └── ai/
│   └── test/
└── target/
````

---

## 分层说明

### 1. Controller 层

主要负责接收请求、组织页面跳转与数据传递。当前项目中主要包括：

* `EasyBuyUserController`
* `EasyBuyProductController`
* `EasyBuyNewsController`
* `EasyBuyCommentController`

这些控制器覆盖了用户、商品、新闻和留言等主要模块。

---

### 2. Service 层

负责封装业务逻辑，当前项目中包括：

* 用户服务
* 商品服务
* 商品分类服务
* 商品描述服务
* 新闻服务
* 留言服务
* 地址服务等

项目中同时保留了接口与实现类，符合基础分层开发习惯。

---

### 3. Mapper 层

负责数据库访问，当前项目基于 MyBatis 进行持久层实现，主要包含：

* 用户 Mapper
* 商品 Mapper
* 商品分类 Mapper
* 新闻 Mapper
* 留言 Mapper
* 地址 Mapper 等

---

### 4. POJO 实体层

对应数据库中的主要业务对象，包括：

* 用户
* 商品
* 商品分类
* 商品描述
* 订单
* 订单详情
* 地址
* 新闻
* 留言
* 购物车相关实体等

这些实体能够较完整地覆盖电商系统的基础数据模型。

---

## 主要功能

---

### 1. 用户模块

对应控制器：

* `EasyBuyUserController`

已实现功能包括：

* 用户登录
* 登录校验
* 登录成功后进入首页
* Session 保存当前登录用户
* 用户退出登录
* 用户注册
* 注册结果反馈页面

相关页面：

* `login2.jsp`
* `reg.jsp`
* `reg-result.jsp`

---

### 2. 首页展示模块

对应入口：

* `/home`
* `/index`

首页主要展示：

* 商品分类信息
* 商品推荐/商品展示列表
* 新闻公告列表
* 登录状态信息
* 导航与公共头部信息

相关页面：

* `index.jsp`

这是整个项目的主展示页面，也是各功能模块的汇总入口。

---

### 3. 商品模块

对应控制器：

* `EasyBuyProductController`

已实现功能包括：

* 根据商品分类查看商品列表
* 商品分页展示
* 查看商品详情

相关页面：

* `product-list.jsp`
* `product-view.jsp`

从页面逻辑来看，商品模块主要完成了一个基础型商城所需的“列表页 + 详情页”展示功能。

---

### 4. 新闻公告模块

对应控制器：

* `EasyBuyNewsController`

已实现功能包括：

* 新闻列表展示（首页中有体现）
* 根据新闻 ID 查看新闻详情

相关页面：

* `new-view.jsp`

该模块增强了项目的内容型展示能力，也让首页不只是“商品堆叠”，更接近完整网站结构。

---

### 5. 留言互动模块

对应控制器：

* `EasyBuyCommentController`

已实现功能包括：

* 查看全部留言
* 提交新留言
* 留言时间展示

相关页面：

* `comment.jsp`

这个模块让项目具备了一定的用户互动能力，虽然功能简单，但对于课程设计项目来说比较实用。

---

## 页面说明

项目当前主要 JSP 页面包括：

* `index.jsp`：商城首页
* `login2.jsp`：用户登录页
* `reg.jsp`：用户注册页
* `reg-result.jsp`：注册成功页
* `product-list.jsp`：商品分类列表页
* `product-view.jsp`：商品详情页
* `new-view.jsp`：新闻详情页
* `comment.jsp`：留言板页面
* `header.jsp` / `footer.jsp`：公共头尾布局

整体页面结构属于典型的 JSP 服务端渲染风格，适合教学型项目展示。

---

## 数据模型说明

从当前实体类与 Mapper 结构可以看出，项目涉及的核心数据对象包括：

* 用户信息
* 商品信息
* 商品分类
* 商品详情描述
* 新闻公告
* 留言评论
* 地址信息
* 订单
* 订单详情
* 购物相关实体

说明该项目不仅仅是“静态页面拼接”，而是围绕一个较完整的商城业务模型搭建而成。

不过从当前前台功能来看，订单与购物车相关功能实体虽然已经设计，但前台完整闭环还没有完全展开，这也属于课程项目中较常见的情况。

---

## 运行环境

建议使用以下环境运行本项目：

* JDK 8
* Maven 3.x
* MySQL 5.x / 8.x（建议根据驱动情况调整）
* IntelliJ IDEA
* Spring Boot 2.5.3

---

## 配置说明

项目配置文件位于：

```text
src/main/resources/application.yml
```

当前主要配置包括：

* 服务端口：`9090`
* 数据库连接：`jdbc:mysql://localhost:3306/ebuy`
* 视图解析前后缀：

  * prefix: `/WEB-INF/jsp/`
  * suffix: `.jsp`

### 默认配置示例

```yml
server:
  port: 9090

spring:
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://localhost:3306/ebuy?useUnicode=true&characterEncoding=utf-8
    username: root
    password: 123456
  mvc:
    view:
      prefix: /WEB-INF/jsp/
      suffix: .jsp
```

> 实际运行前请根据本地数据库环境修改账号、密码和数据库配置。

---

## 运行方法

### 1. 准备数据库

先在本地 MySQL 中创建对应数据库，例如：

```sql
CREATE DATABASE ebuy DEFAULT CHARSET utf8;
```

然后导入项目所需的表结构与测试数据。

---

### 2. 修改数据库连接配置

根据本机环境修改：

* 数据库地址
* 用户名
* 密码

配置文件路径：

```text
src/main/resources/application.yml
```

---

### 3. 使用 IDEA 打开项目

以 Maven 项目方式导入。

等待依赖加载完成后，确认：

* JDK 版本正确
* Maven 依赖下载完成
* 数据库已准备好

---

### 4. 启动项目

运行启动类：

```java
cn.ebuy.EbuyApplication
```

项目启动后，默认访问地址为：

```text
http://localhost:9090/login
```

也可以访问：

```text
http://localhost:9090/home
```

进入首页。

---

## 项目亮点

### 1. 技术栈完整

虽然是教学型项目，但已经具备较为完整的 Java Web 基础栈：

* Spring Boot
* MyBatis
* JSP
* MySQL
* Maven

能够体现从前端页面到后端分层、再到数据库访问的完整开发流程。

---

### 2. 分层结构清晰

项目按照 Controller / Service / Mapper / POJO 分层组织，结构比较规范，便于后续维护和功能扩展。

---

### 3. 具备典型商城前台功能

项目已经覆盖了一个基础电商网站最常见的前台能力：

* 登录注册
* 首页展示
* 商品浏览
* 商品详情
* 新闻公告
* 用户留言

对于课程设计和作品展示来说，这样的功能范围是比较完整的。

---

### 4. 资源内容较丰富

项目中包含较多图片资源、前端页面和数据实体，整体上比单纯的“实验性 Demo”更接近一个可运行的网站原型。

---

## 可改进方向

当前项目已经具备展示价值，但如果继续完善，还可以从以下几个方向优化：

### 1. 完善购物车与订单闭环

虽然已有订单、订单详情、购物相关实体，但前台完整购买流程尚未完全打通。后续可以继续扩展：

* 加入购物车
* 提交订单
* 订单列表
* 订单详情
* 收货地址选择

---

### 2. 补充后台管理功能

目前项目更偏前台商城展示，后续可以增加管理员模块，例如：

* 商品管理
* 分类管理
* 新闻管理
* 用户管理
* 留言审核

---

### 3. 提升安全性

当前项目更偏教学实现，后续可继续改进：

* 密码加密存储
* 更规范的参数校验
* 登录拦截与权限控制
* SQL 与输入安全处理

---

### 4. 优化前端页面与交互

当前页面风格偏传统 JSP 教学项目，后续可以考虑：

* 优化布局样式
* 引入更现代的前端组件
* 提升响应式适配
* 改善用户体验

---

### 5. 清理构建产物与开发缓存

若上传 GitHub，建议忽略以下内容：

* `.idea/`
* `target/`

并添加 `.gitignore`，让仓库结构更干净。

---

## 适用场景

本项目适合用于：

* Java Web 课程设计展示
* Spring Boot + JSP + MyBatis 综合练习
* 电商网站原型项目归档
* GitHub 个人作品集补充
* 简历中展示基础 Web 项目经历

---

## 总结

EBuy 电商平台是一个典型的 Java Web 教学型项目。
它并不追求复杂的分布式架构或完整商业闭环，而是聚焦于：

* 基础商城前台功能实现
* 清晰的后端分层结构
* 数据库实体与页面联动
* 典型 Web 项目的开发流程

对于个人 GitHub 展示而言，这类项目的意义在于：

**它能够直观体现你具备从数据库、后端到页面渲染的完整基础开发能力。**

---

## 说明

本项目仅用于学习交流、课程设计展示与个人作品集整理。
项目名称中的 **EBuy** 仅作为教学型示例命名，不对应任何真实商业平台。

---

## License

本项目仅用于学习交流与课程展示。
