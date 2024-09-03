const express = require("express");
const app = express();
const cars = require('list-of-cars');

app.set('view engine', 'ejs');
app.set("port", 3000);
app.use(express.static("public"));

const carList = cars.getListSync();
let selectedCars = []; 

app.get("/getYear", (req, res) => {
    const year = req.query.year ? parseInt(req.query.year) : new Date().getFullYear();
    const filteredCars = carList.filter(car => car.Year === year);

    if (filteredCars.length > 0) {
        const randomIndex = Math.floor(Math.random() * filteredCars.length);
        const selectedCar = filteredCars[randomIndex];

        selectedCars.push(selectedCar);

        res.render('result.ejs', { car: selectedCar, selectedCars: selectedCars });
    } else {
        res.send("No cars found for the specified year.");
    }
});

app.get("/selectedCars", (req, res) => {
    res.send(selectedCars);
});

app.post("/clearSelectedCars", (req, res) => {
    selectedCars = [];
    res.sendStatus(200); 
});

app.listen(3000, () => {
    console.log("App Running!");
});
