
//Run this page on walmart receipt page

var itemRows = document.getElementsByClassName("item_row");
var itemName, itemPrice;

var output="";
for (i = 0; i < itemRows.length; i++) { 
	itemName = itemRows[i].getElementsByClassName("item_info")[0].innerText;
	itemPrice = itemRows[i].getElementsByClassName("price")[0].innerText;
    output += itemName+":"+itemPrice+"\n";
}

//For getting tax
var moneyArr = document.getElementsByClassName("money")
output += "Tax \nQty: NA \n:" + moneyArr[moneyArr.length-1].innerText

console.log(output);