# Exam-12748-20161229-1
项目考核
1、项目结构src/main/java目录
   （1）aop->通过注解的方式创建AopFilm，定义为增强类
   （2）listenter->创建事件BeforeInsertFilmEvent和AfterInsertFilmEvent，创建AppContextListener实现ApplicationListener接口，处理监听事件
   （3）main ->定义MainTest类为测试类
   （4）mapper->定义同名的FilmMapper类和xml配置文件
   (5)pojo->创建Film对象
   （6）service.imple ->service实现类
   （7）services->service接口类
   项目src/main/resources目录  用于存放配置文件
2、项目运行
   启动MainTest测试类，加载AbstractApplicationContext配置文件  控制台输出 Context Start 信息
   根据输入要求一次输入电影名称(title)，电影描述(description)，语言 ID(language_id)
   AbstractApplicationContext停止，
   接收到 BeforeInsertFilmEvent 事件,输出 Before Insert Film Data.
   接收到AfterInsertFilmEvent 事件,输出After Insert Film Data
   输出Context stop 信息.
   
