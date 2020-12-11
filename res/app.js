//create button element
var btn = document.createElement("button")

//add button caption
btn.innerText = "Click Me!";

//register button click event
btn.addEventListener("click", function(event) {
	//if button is clicked add style class 'red' to paragraph
	p.classList.add("red")	
}, false)

//create paragraph element
var p = document.createElement("p")

//add it content
p.innerText="Welcome to wonderful world of computers!"

//append the button to the document
document.body.appendChild(btn);

//append the paragraph to the document
document.body.appendChild(p);

