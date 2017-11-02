package edu.ecnu.sqslab.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Mr.Liu
 * @since 2017/10/15
 */
@Entity()
@Table(name = "google_app")
public class Issue {
    @Id // 主键
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "issueId")
    private String issueId;
    @Column(name = "body")
    private String body;
    @Column(name = "issueUrl")
    private String issueUrl;
    @Column(name = "type")
    private Long type;
    @Column(name = "summary")
    private String summary;

    public Issue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
