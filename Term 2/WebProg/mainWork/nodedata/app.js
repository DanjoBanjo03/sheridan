const fs = require("fs"); // for reading and writing files (comes with node)
const express = require("express");
const app = express();

app.set("port", process.env.PORT || 3000);

// set where static files such as html, images, css pages are located
app.use(express.static('public'));

// FLAT FILE

app.get("/flatfile", (req, res)=>{

    // get data can be collected with req.query
    // this is an object with properties that match the names of the form fields
    console.log(req.query);

    const name = req.query.name;
    const birthday = req.query.birthday;
    const data = name + "|" + birthday + "\n";

    let message = "Saved Birthday";

    // We want to append to a file - but you can also do the following:
    // fs.readFile(file, encoding, callback)
    // fs.writeFile(file, content, callback)
    // fs.unlink(file, callback) // to delete

    fs.appendFile("flatfile.txt", data, err => {
        if (err) message = "Sorry, error writing Birthday";
    });

    // later we will see the Fetch API (similar to AJAX)
    // to save data without going to another page
    res.redirect("flatfileresults.html?message=" + message);

});

// use a joke package - there are a bunch of them - do a search at https://npmjs.com
const oneLinerJoke = require('one-liner-joke');

// this will route any JSON data to the req.body
app.use(express.json())

// route getjoke
app.post("/getjoke", (req, res)=>{

    let topic = req.body.topic;

    console.log("topic = " + topic);

    // use one-liner-joke package
    // returns a joke with the following format:
    // {
    //    "body":"Artificial intelligence is no match for natural stupidity.",
    //    "tags":["intelligence","stupid"]
    // }
    
    let joke;
    let warning = "";

    // the joke filter seems to break the app 
    // if we use any of the default filtered words 
    // so filter out the default filtered words
    const filter = ['racist', 'dirty', 'sex']; 
    if (filter.includes(topic)) {
        topic = "";
        warning = "Sorry, please be good";
    }

    if (topic == "") joke = oneLinerJoke.getRandomJoke(); // no topic
    else joke = oneLinerJoke.getRandomJokeWithTag(topic); // topic

    // but there may be no jokes for the topic
    if (joke.body == "") {
        warning = "Sorry, no jokes about " + req.body.topic;
        joke = oneLinerJoke.getRandomJoke();
    }

    // create json to send back
    const data = JSON.stringify({warning:warning, joke:joke.body});
    
    // send the json back
    res.json(data);

});

// SESSIONS

// controllers holds our app code to make the express code less
controller = require("./controllers/controller");

// import session
const session = require('express-session');

// use session
app.use(session({
    secret: "secretkey",
    saveUninitialized: false,
    resave: false 
}));

// set the template engine
app.set("view engine", "ejs");

// handle get requests to page1
app.get("/page1", controller.showPage1);

// handle get requests to page2
app.get("/page2", controller.showPage2);

// other requests have post data
app.use(express.urlencoded({ extended: false }));

// handle post requests to getuser
app.post("/getuser", controller.getUser);

app.listen(app.get("port"), ()=>{
    console.log("running on " + app.get("port"));
});