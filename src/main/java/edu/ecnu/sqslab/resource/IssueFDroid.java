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
@Table(name = "issues")
public class IssueFDroid {
    @Id // 主键
    private long id;
    @Column(name = "appId")
    private long appId;
    @Column(name = "repoId")
    private String repoId;
    @Column(name = "issueId")
    private String issueId;
    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;
    @Column(name = "comments_url")
    private String comments_url;
    @Column(name = "comments")
    private String comments;
    @Column(name = "type")
    private String type;
    @Column(name = "summary")
    private String summary;

    public IssueFDroid() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
