// Load HTTP module
const http = require("http");

const hostname = "localhost";
const port = 3000;

// Create HTTP server (in future, we do this with the Express package)
// req - will hold a request object (what is coming in)
// res - will hold a response object (what is going out)
const server = http.createServer((req, res)=>{

    // Set the response HTTP header with HTTP status and Content type
    res.writeHead(200, {"Content-Type": "text/plain"});

    // Send the response body "Hello world"
    res.end("Hello Dr.Abstract\n");

});

// Start the server listening
server.listen(port, hostname, ()=>{
    console.log("Server running on port " + port);
});