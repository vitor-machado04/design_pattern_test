package org.example;

public class GlobalConfigManager {

    private static volatile GlobalConfigManager instance;

    private String user;
    private String dbUrl;
    private String apiToken;

    private GlobalConfigManager() {
        user = "Alex Roberto";
        dbUrl = "mongodb://localhost:27017/alexdatabase";
        apiToken = "03e995a0e07cb544&sxsrf";
    }

    public static GlobalConfigManager getInstance() {
        if (instance == null) {
            synchronized (GlobalConfigManager.class) {
                if (instance == null) {
                    instance = new GlobalConfigManager();
                }
            }
        }
        return instance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }
}
