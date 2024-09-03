export const a = "test";
export function doIt(){
    console.log("Hi from doIt()");
}
const obj = {a:"hi", b:"lo"}

obj.c = "wo";

const djo = {

    runWild:()=>{
        console.log("hi from runWild");
    }, //comma needed for second object

    secondFunction : ()=>{}
}
djo.someFunction = ()=>{};

function anotherFunction(){
    
}

djo.anotherFunction = anotherFunction;

class Teacher {
}

djo.Person = class {
    #rockstar = 5;
    #hairColor = undefined;
    constructor (rockstar=5) {
        console.log("Hi from person!");
        console.log("Rockstar ability " + rockstar);
        this.song = "not singing";
        this.#rockstar = rockstar;
        this.dance = ()=>{ // method declared on 'this'
            console.log("Dancing at rockstar level " + rockstar)
        }
    }
    sing(song) { //method declared on class
        console.log('Singing!'+ song + " at level " + this.#rockstar);
        this.song = song;
    }
    get hair(){
        return this.#hairColor;
    }
    set hair(color){
        console.log("Hair color is " + color);
        this.#hairColor = color;
    }
    dyeHair(color){
        this.hair = color;
    }

}

export const Student = djo.student = class extends djo.Person {
    constructor(rockstar=6){
        super(rockstar);// runs the Person
        console.log("Hi from student");
    }
    yawn(){
        console.log('Student is yawning')
    }
    dance(){
        console.log("Doing the floss");
    }
    sing() {
        console.log("angelic singing in shower");
    }
}

export default djo;

// On exam know how to make class methods overides getter setter 