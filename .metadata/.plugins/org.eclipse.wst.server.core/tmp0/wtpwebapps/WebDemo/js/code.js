var cars = [ "Saab", "Volvo", "BMW" ];
document.getElementById("demo").innerHTML = cars;

function displayDate() {
	document.getElementById("demo").innerHTML = Date();
}

function employee() {
	this.firstName = 'Jiaju';
	this.lastName = 'Xu';
	this.netSalary = function() {
		return this.firstName + ' '  + this.lastName;
	};
}

var emp = new employee();
//alert(emp.netSalary());

var pokemon = {
	firstName : 'Ash',
	lastName : 'Ketchum',
	goPikachu : function() {
		alert('Pikachuuuuuuuuuuu');
	}
};
//pokemon.goPikachu();

function person(firstName, lastName, age, eyeColor) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.eyeColor = eyeColor;
	this.changeName = function(name) {
		this.lastName = name;
	};
}
var myMother = new person("Sally", "Rally", 48, "green");
myMother.changeName("Doe");
document.getElementById("demo1").innerHTML = "My mother's last name is "
		+ myMother.lastName;

var btnClickRef = document.getElementById('btnClick');

var eventHandler = function() {
	emp.firstName = 'Kate';
	alert(emp.firstName);
	alert(emp.netSalary());
};

btnClickRef.addEventListener("click", eventHandler);

//var intervalID = setInterval(function(){alert("Interval reached");}, 5000);

