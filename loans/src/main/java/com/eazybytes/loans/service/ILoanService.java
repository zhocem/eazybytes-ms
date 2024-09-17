package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoanDTO;
import com.eazybytes.loans.exception.LoanAlreadyExistsException;

public interface ILoanService {

    /**
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber) throws LoanAlreadyExistsException;

    /**
     * @param mobileNumber - Input mobile Number
     * @return Loan Details based on a given mobileNumber
     */
    LoanDTO fetchLoan(String mobileNumber);

    /**
     * @param loansDto - LoansDto Object
     * @return boolean indicating if the update of card details is successful or not
     */
    boolean updateLoan(LoanDTO loansDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
