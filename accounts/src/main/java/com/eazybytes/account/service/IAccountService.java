package com.eazybytes.account.service;

import com.eazybytes.account.dto.CustomerDto;
import com.eazybytes.account.exception.CustomerAlreadyExistsException;
import com.eazybytes.account.exception.ResourceNotFoundException;

public interface IAccountService {

    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto) throws CustomerAlreadyExistsException;


    /**
     * @param mobileNumber - Input mobile number
     * @return Account details based on a given mobile number
     */
    CustomerDto fetAccount(String mobileNumber) throws ResourceNotFoundException;

    /**
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto) throws ResourceNotFoundException;


    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber) throws ResourceNotFoundException;
}
