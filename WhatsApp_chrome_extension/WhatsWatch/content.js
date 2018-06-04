
var timeVar;
var oldStatus;
var startTime;

chrome.runtime.sendMessage({todo: "showPageAction"});
chrome.runtime.onMessage.addListener(function(request, sender, sendResponse)
{
    if (request.todo == "startMonitoring")
	{
		timeVar = window.setInterval(checkStatus, 3000);
    }
	else if(request.todo == "stopMonitoring")
	{
		window.clearInterval(timeVar);
		oldStatus = undefined;
	}
});

function checkStatus()
{
	var newStatus;
	var elem = document.getElementsByClassName('O90ur');
	if(elem.length>0 && elem[0].innerText=="online")
	{			
		newStatus = "online";
	}
	else
	{
		newStatus = "offline";
	}
	
	if(newStatus != oldStatus)
	{
		if(newStatus=="online")
		{
			console.log("Online at : " + getCurrentIndiaTime());
			startTime = Date.now();
		}
		else if(newStatus=="offline")
		{
			console.log("Offline at : " + getCurrentIndiaTime());
			if(oldStatus=="online")
			{
				var timeDiffSecs = (Date.now() - startTime)/1000;
				console.log("Was online for " + Math.floor(timeDiffSecs/60) + " minutes " + Math.floor(timeDiffSecs%60) + " seconds");
			}
		}
		
		oldStatus = newStatus;
	}
}

function getCurrentIndiaTime()
{
	// create Date object for current location
    d = new Date();
    
    // convert to msec
    // add local time zone offset 
    // get UTC time in msec
    utc = d.getTime() + (d.getTimezoneOffset() * 60000);
    
    nd = new Date(utc + (3600000*5.5));
    
    // return time as a string
    return nd.toLocaleString();
}