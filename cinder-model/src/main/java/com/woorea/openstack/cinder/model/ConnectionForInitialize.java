package com.woorea.openstack.cinder.model;

import org.codehaus.jackson.map.annotate.JsonRootName;

import java.io.Serializable;

@JsonRootName("os-initialize_connection")
public class ConnectionForInitialize extends BaseConnection implements Serializable {

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ConnectionForInitialize [connector=" + getConnector() + "]";
    }

}
