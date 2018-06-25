(function() {

    var ViewController =  function(viewService, $log) {
    
    	var vm = this;
        
        vm.isHidden = false;
        
        vm.hideTable = function()
        {
        	vm.isHidden = !vm.isHidden
        };
        
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

    angular.module('accountApp').controller('viewController', ['viewService','$log', ViewController]);
}());