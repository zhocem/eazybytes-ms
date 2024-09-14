package com.eazybytes.account.service;

import com.eazybytes.account.dto.CustomerDto;
import com.eazybytes.account.exception.CustomerAlreadyExistsException;

public interface IAccountService {

    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto) throws CustomerAlreadyExistsException;
}
