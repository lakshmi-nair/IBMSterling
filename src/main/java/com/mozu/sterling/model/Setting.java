package com.mozu.sterling.model;

import java.util.List;

/**
 * This object contains the configuration items needed to connect and synchronize with the Sterling system. 
 * @author bob_hewett
 *
 */
public class Setting {
    protected String id;
    protected String sterlingUrl;
    protected String sterlingUserId;
    protected String sterlingPassword;
    protected String sterlingEnterpriseCode;
    protected List<SiteMapping> siteMappings;
    protected List<LocationMapping> locationMappings;

    public List<SiteMapping> getSiteMappings() {
        return siteMappings;
    }

    public void setSiteMappings(List<SiteMapping> siteMappings) {
        this.siteMappings = siteMappings;
    }

    public List<LocationMapping> getLocationMappings() {
        return locationMappings;
    }

    public void setLocationMappings(List<LocationMapping> locationMappings) {
        this.locationMappings = locationMappings;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getSterlingUrl() {
        return sterlingUrl;
    }
    
    public void setSterlingUrl(String sterlingUrl) {
        this.sterlingUrl = sterlingUrl;
    }
    
    public String getSterlingUserId() {
        return sterlingUserId;
    }
    
    public void setSterlingUserId(String sterlingUserId) {
        this.sterlingUserId = sterlingUserId;
    }
    
    public String getSterlingPassword() {
        return sterlingPassword;
    }
    
    public void setSterlingPassword(String sterlingPassword) {
        this.sterlingPassword = sterlingPassword;
    }

    public String getSterlingEnterpriseCode() {
        return sterlingEnterpriseCode;
    }

    public void setSterlingEnterpriseCode(String sterlingEnterpriseCode) {
        this.sterlingEnterpriseCode = sterlingEnterpriseCode;
    }
}