package io.github.bonigarcia.wdm.online;

import io.github.bonigarcia.wdm.config.Config;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UrlHandlerConfig {
    private Config config;
    private List<URL> candidateUrls;
    private String driverVersion;
    private String shortDriverName;
    private Function<String, Optional<URL>> buildUrlFunction;

    // Constructor, getters, and setters
    // Add constructor, getters, and setters
    public UrlHandlerConfig(Config config, List<URL> candidateUrls,
                            String driverVersion, String shortDriverName,
                            Function<String, Optional<URL>> buildUrlFunction) {
        this.config = config;
        this.candidateUrls = candidateUrls;
        this.driverVersion = driverVersion;
        this.shortDriverName = shortDriverName;
        this.buildUrlFunction = buildUrlFunction;
    }

    // Getters and setters
    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public List<URL> getCandidateUrls() {
        return candidateUrls;
    }

    public void setCandidateUrls(List<URL> candidateUrls) {
        this.candidateUrls = candidateUrls;
    }

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public String getShortDriverName() {
        return shortDriverName;
    }

    public void setShortDriverName(String shortDriverName) {
        this.shortDriverName = shortDriverName;
    }

    public Function<String, Optional<URL>> getBuildUrlFunction() {
        return buildUrlFunction;
    }

    public void setBuildUrlFunction(Function<String, Optional<URL>> buildUrlFunction) {
        this.buildUrlFunction = buildUrlFunction;
    }
}
