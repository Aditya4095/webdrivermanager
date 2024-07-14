package io.github.bonigarcia.wdm.online;

import java.net.URL;

/**
 * Plain-Old Java Object to parse JSON of https://registry.npmmirror.com/.
 *
 * @author Boni Garcia
 * @since 5.1.0
 */
public class NpmMirror {

    private String id;
    private String category;
    private String name;
    private String date;
    private String type;
    private URL url;
    private String modified;

    // Constructors (if needed)

    // Getters and setters for all fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
}
