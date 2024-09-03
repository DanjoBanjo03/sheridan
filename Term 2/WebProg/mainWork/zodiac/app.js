const express = require("express");
const app = express();

const chineseYear = require("chinese-year");

app.set("port", 3000);

app.set("view engine", "ejs");

app.get("/test", (req, res)=>{
    console.log("Here!");
    res.send("Hello!")
});

app.get("/getyear", (req,res)=>{
    // res.send('<h2>' + req.query.year + '</h2>')
    // res.send(`<h2>${req.query.year}</h2>`);
    console.log(req.query.special);

    const year = req.query.year ? req.query.year : new Date().get;

    const animal = chineseYear.getAnimal(year)

    res.render('result', {year:year, animal:animal})
})

app.use(express.static("public"));

app.listen(3000, ()=>{
    console.log("App Running!");
});