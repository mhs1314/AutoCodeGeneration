package config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "auto")
public class autoConfig {
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
    private String dbType;
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
        return outDir;
    }

    public void setOutDir(String outDir) {
        this.outDir = outDir;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String[] tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public String[] getIncludeTables() {
        return includeTables;
    }

    public void setIncludeTables(String[] includeTables) {
        this.includeTables = includeTables;
    }

    public String getPackRoot() {
        return packRoot;
    }

    public void setPackRoot(String packRoot) {
        this.packRoot = packRoot;
    }
}
