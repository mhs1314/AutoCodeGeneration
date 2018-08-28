package com.mhs.autocode.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "auto")
public class AutoConfig {
    /**
     * 输出代码地址
     */
    private String outDir;
    /**
     * 自定义作者
     */
    private String author;
    /**
     * 数据库类型支持：mysql，oracle，sql_server，postgre_sql
     */
    private DbType dbType;
    /**
     * 数据库驱动：如：com.mysql.jdbc.Driver
     */
    private String driverName;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 数据库链接
     */
    private String url;
    /**
     * 表前缀
     */
    private String[] tablePrefix;
    /**
     * 指定要生城的表
     */
    private String[] includeTables;
    /**
     * 生成包名
     */
    private String packRoot;


    public String getOutDir() {
        return outDir==null?"d://autoCode":outDir;
    }

    public void setOutDir(String outDir) {
        this.outDir = outDir;
    }

    public String getAuthor() {
        return author==null?"mhs":author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public DbType getDbType() {
        return dbType==null?DbType.MYSQL:dbType;
    }

    public void setDbType(String dbType) {
        switch (dbType){
            case "mysql":this.dbType=DbType.MYSQL;break;
            case "oracle":this.dbType=DbType.ORACLE;break;
            case "sql_server":this.dbType=DbType.SQL_SERVER;break;
            case "postgre_sql":this.dbType=DbType.POSTGRE_SQL;break;
        }
    }

    public String getDriverName() {
        return driverName==null?"com.mysql.jdbc.Driver":driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUserName() {
        return userName==null?"root":userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password==null?"123456":password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url==null?"":url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix.split(",");
    }

    public String[] getIncludeTables() {
        return includeTables;
    }

    public void setIncludeTables(String includeTables) {
        this.includeTables = includeTables.split(",");
    }

    public String getPackRoot() {
        return packRoot==null?"com.mhs":packRoot;
    }

    public void setPackRoot(String packRoot) {
        this.packRoot = packRoot;
    }
}
