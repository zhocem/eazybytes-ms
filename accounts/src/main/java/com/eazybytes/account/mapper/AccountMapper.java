package com.eazybytes.account.mapper;

import com.eazybytes.account.dto.AccountDto;
import com.eazybytes.account.entity.Accounts;

public class AccountMapper {

    public static AccountDto mapToaccountDto(Accounts account, AccountDto accountDto) {
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBranchAddress(account.getBranchAddress());
        return accountDto;
    }

    public static Accounts mapToaccount(AccountDto accountDto, Accounts account) {
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBranchAddress(accountDto.getBranchAddress());
        return account;
    }
}
