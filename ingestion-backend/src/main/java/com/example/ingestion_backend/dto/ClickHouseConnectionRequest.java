package com.example.ingestion_backend.dto;

public class ClickHouseConnectionRequest {
    private String host;
    private int port;
    private String database;
    private String user;
    private String jwtToken;
    private boolean useHttps;

    // Getters and Setters
    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }

    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }

    public String getDatabase() { return database; }
    public void setDatabase(String database) { this.database = database; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getJwtToken() { return jwtToken; }
    public void setJwtToken(String jwtToken) { this.jwtToken = jwtToken; }

    public boolean isUseHttps() { return useHttps; }
    public void setUseHttps(boolean useHttps) { this.useHttps = useHttps; }
}
