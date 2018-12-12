/**
 * @Auther: KaiCh
 * @Date: 2018/12/12 11:15
 * @Description:
 */
package com.ssc.code.entity;

import java.io.Serializable;

public class Test implements Serializable {
    private String id;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
