"use strict";

(function() {

    var CreateController =  function(createService, $log) {
        
    	var vm = this;
        
        vm.isHidden = false;
        
        vm.hideTable = function()
        {
        	vm.isHidden = !vm.isHidden
        };

        }
    
     vm.delete = function(accountToDelete){
        accountService.deleteAccount(accountToDelete);
        accountService.getAccounts().then(function(results){vm.accounts=results;location.reload();});
    };

          vm.add = function(){
          var result = {"firstName":vm.formData.firstName,
                         "surname":vm.formData.surname,
                         "accountNumber":vm.formData.accountNumber,
                     	"dateofbirth":vm.formData.dateofbirth};
             accountService.saveAccount(result);
             accountService.getAccounts().then(function (results) {
             vm.accounts = results;
         	location.reload();
         });
        
        function init() {
        	accountService.getAccounts().then(function (results) {
           	vm.accounts = results;
            console.log(results);
           	$log.log("In the account controller the value of the result promise is ");
        	$log.log(JSON.stringify(vm.accounts));
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
       }
       
       init();
            
    };

    angular.module('accountApp').controller('createController', ['createService','$log', CreateController]);
}());