package com.eniacdevelopment.serialization.DataModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by larsg on 10/5/2016.
 */
//@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.EXTERNAL_PROPERTY, property="type", visible = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property="type", visible=true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = EventNotification.class, name=PackageType.Constants.NOTIFICATION),

        //@JsonSubTypes.Type(value = Request.class, name=PackageType.Constants.REQUEST)
})
public abstract class AbstractPackage {
    private PackageType type;
    public PackageType getType() {
        return type;
    }

    public void setType(PackageType type) {
        this.type = type;
    }
}