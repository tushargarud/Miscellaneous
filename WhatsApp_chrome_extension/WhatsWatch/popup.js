$(function(){
    
	$('#btnStartMonitor').click(function(){      
         chrome.tabs.query({active:true,currentWindow: true}, function(tabs){
            chrome.tabs.sendMessage(tabs[0].id, {todo: "startMonitoring" });
        });
   });
   
	$('#btnStopMonitor').click(function(){      
         chrome.tabs.query({active:true,currentWindow: true}, function(tabs){
            chrome.tabs.sendMessage(tabs[0].id, {todo: "stopMonitoring" });
        });
   });
   
});

