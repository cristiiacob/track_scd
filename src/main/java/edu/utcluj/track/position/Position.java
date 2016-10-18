package edu.utcluj.track.position;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author radu.miron
 * @since 18.10.2016
 */
@Entity
public class Position {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(min = 5, max = 10, message = "must be between 5 and 10 characters long")
    private String terminalId;
    @ApiModelProperty(hidden = true)
    @NotNull
    private Date createTime;
    @NotNull
    private String latitude;
    @NotNull
    private String longitude;

    boolean test;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
