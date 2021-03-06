/*
 * Copyright (c) 2016, Virgil Security, Inc.
 *
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of virgil nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.virgilsecurity.sdk.storage;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.virgilsecurity.sdk.storage.KeyEntry;

/**
 * A key pair storage entry.
 *
 * @author Andrii Iakovenko
 *
 */
public class VirgilKeyEntry implements KeyEntry {

    private transient String name;

    @SerializedName("value")
    private byte[] value;

    @SerializedName("meta_data")
    private Map<String, String> metadata;

    /**
     * Create a new instance of {@code VirgilKeyEntry}
     *
     */
    public VirgilKeyEntry() {
        metadata = new HashMap<>();
    }

    /**
     * Create a new instance of {@code VirgilKeyEntry}
     *
     * @param name
     *            The key name.
     * @param value
     *            The key value.
     */
    public VirgilKeyEntry(String name, byte[] value) {
        this();
        this.name = name;
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.virgilsecurity.sdk.crypto.KeyEntry#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.virgilsecurity.sdk.crypto.KeyEntry#setName(java.lang.String)
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.virgilsecurity.sdk.crypto.KeyEntry#getValue()
     */
    @Override
    public byte[] getValue() {
        return value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.virgilsecurity.sdk.crypto.KeyEntry#setValue(byte[])
     */
    @Override
    public void setValue(byte[] value) {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.virgilsecurity.sdk.crypto.KeyEntry#getMetadata()
     */
    @Override
    public Map<String, String> getMetadata() {
        return metadata;
    }

}
