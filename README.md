1、本地启动springboot应用
2、登录h2数据库客户端
网页登录地址：localhost:8080/h2-console
账号：sa
密码：123456
3、新建用户表、用户角色表
 CREATE TABLE t_user (
       id INT PRIMARY KEY AUTO_INCREMENT,
       user_name VARCHAR(20),
       password VARCHAR(20),
       role_id VARCHAR(2),
       create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
       update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );
   COMMENT ON COLUMN t_user.id IS '主键 id';
   COMMENT ON COLUMN t_user.user_name IS '用户名';
   COMMENT ON COLUMN t_user.password IS '密码';
   COMMENT ON COLUMN t_user.role_id IS '角色id';
   COMMENT ON COLUMN t_user.create_time IS '创建时间';
   COMMENT ON COLUMN t_user.update_time IS '修改时间';
   COMMENT ON TABLE t_user IS '用户表';

   CREATE TABLE t_role (
       id INT PRIMARY KEY AUTO_INCREMENT,
       role_code VARCHAR(20),
       role_name VARCHAR(20),
       is_deleted VARCHAR(2) DEFAULT '0',
       create_time TIMESTAMP(0) DEFAULT CURRENT_TIMESTAMP,
       update_time TIMESTAMP(0) DEFAULT CURRENT_TIMESTAMP
   );
   COMMENT ON COLUMN t_role.id IS '主键 id';
   COMMENT ON COLUMN t_role.role_code IS '角色编码';
   COMMENT ON COLUMN t_role.role_name IS '角色名称';
   COMMENT ON COLUMN t_role.is_deleted IS '是否删除';
   COMMENT ON COLUMN t_role.create_time IS '创建时间';
   COMMENT ON COLUMN t_role.update_time IS '更新时间';
   COMMENT ON TABLE t_role IS '角色表';
  
 insert into t_role(role_code,role_name) values('admin','管理员');
 insert into t_role(role_code,role_name) values('user','普通用户');
