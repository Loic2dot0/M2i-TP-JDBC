/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.Model;

/**
 *
 * @author N Duquesne
 */
public class Article {
    private Long id;
    private String articleId;
    private String name;
    private String description;
    private Boolean isForSell;
    
    public Article() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return articleId;
    }

    public void setIdNumber(String idNumber) {
        this.articleId = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsForSell() {
        return isForSell;
    }

    public void setIsForSell(Boolean isForSell) {
        this.isForSell = isForSell;
    }
    
    
}
