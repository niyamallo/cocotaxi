package com.s001.cocotaxi.dto;

import com.s001.cocotaxi.domain.Client;
import lombok.Getter;

@Getter
public class ClientResponse {

    private final String clientName;

    public ClientResponse(Client client) {
        this.clientName = client.getClientName();
    }
}