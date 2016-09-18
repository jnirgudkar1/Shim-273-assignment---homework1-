/**
 * 
 */
function NextLifeEvent()
{
	var lifeevent = ["Wake up", "Brush teeth", "Have breakfast", "Study", "Chores", "Dinner", "Sleep", "Repeat"];
	var text = "";
	for (i = 0; i < lifeevent.length; i++) { 
		text += lifeevent[i] + "<br>";
	}	
	document.write(text);
}
