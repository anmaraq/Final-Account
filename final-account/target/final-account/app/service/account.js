"use strict";

(function () {

    
    function AccountService (accountDal) {

        this.getAccounts = function()
        {
        	return accountDal.getAccounts();
        };

        this.deleteAccount = function(accountToDelete)
        {
        	return accountDal.deleteAccount(accountToDelete);
        }

         this.saveAccount = function(accountToSave){
          return accountDal.saveAccount(accountToSave);
        };
        
    }
    
    angular.module("accountApp").service("accountService", ['accountDal', AccountService]);

}());