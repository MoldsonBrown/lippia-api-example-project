package api.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Breeds {

    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private int status;
    @JsonProperty("level")
    private String level;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
