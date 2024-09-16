// jsReview-myscript.js

	// Function for loading elements when browser initially loads
function loadHeader() {
	// Use .querySelector to retrieve first 'h3' element and update including formatting
	var element = document.querySelector('h3');
	element.innerHTML = 'My first JavaScript Application';
	element.style.textAlign = 'center';
	element.style.backgroundColor = 'blue';
	element.style.color = 'white';

}
//-------------------------------------------------------------

// Complete functions based on button text in index.html
function gifImages() {
	var images = document.querySelector('#list').querySelectorAll('img[ src$="gif"');
	for(let img of images){
		img.classList.toggle('gifBorder');
	}
}

function pngHideShowUsingDisplay() {
	var pngImages = document.querySelector('#list').querySelectorAll('img[ src$="png"');
	for(let img of pngImages){
		if(img.style.display==='block' || img.style.display === ''){
			img.style.display = 'none';
		}else{
			img.style.display = 'block';
		}
		
	}

}

function pngHideShowUsingVisibility() {
	var visImages = document.querySelector('#list').querySelectorAll('img[ src$="png"');
	for(let img of visImages){
		if(img.style.visibility==='visible' || img.style.visibility === ''){
			img.style.visibility = 'hidden';
		}else{
			img.style.visibility = 'visible'
		}
	}

}

function containsImgElement() {


}

function campusImages() {


	/*
		NOTE: If ../images is used, it will work on localhost but BREAK when published
		REMEMBER: .js files included in <script> element in an HTML file are actually embedded
		in the HTML file so the location in .js file is actually from the calling HTML file.
		Try publishing using ./images and ../images to see difference
	*/
}
