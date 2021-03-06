/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

/**
 * Describe Volume Attribute Result
 */
public class DescribeVolumeAttributeResult {

    private String volumeId;

    /**
     * Boolean value
     */
    private Boolean autoEnableIO;

    /**
     * Returns the value of the VolumeId property for this object.
     *
     * @return The value of the VolumeId property for this object.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * Sets the value of the VolumeId property for this object.
     *
     * @param volumeId The new value for the VolumeId property for this object.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * Sets the value of the VolumeId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The new value for the VolumeId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumeAttributeResult withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isAutoEnableIO() {
        return autoEnableIO;
    }
    
    /**
     * Boolean value
     *
     * @param autoEnableIO Boolean value
     */
    public void setAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoEnableIO Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVolumeAttributeResult withAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
        return this;
    }
    
    
    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getAutoEnableIO() {
        return autoEnableIO;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (volumeId != null) sb.append("VolumeId: " + volumeId + ", ");
        if (autoEnableIO != null) sb.append("AutoEnableIO: " + autoEnableIO + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((isAutoEnableIO() == null) ? 0 : isAutoEnableIO().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeVolumeAttributeResult == false) return false;
        DescribeVolumeAttributeResult other = (DescribeVolumeAttributeResult)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.isAutoEnableIO() == null ^ this.isAutoEnableIO() == null) return false;
        if (other.isAutoEnableIO() != null && other.isAutoEnableIO().equals(this.isAutoEnableIO()) == false) return false; 
        return true;
    }
    
}
    