let x=10;  //number type
let y="hello";  //string type
let z=true;   //boolean type
let f=function sum(i,j){    //assigning function as a value to the variable f
    return i+j;
}
let r=f(10,20);
console.log("result: "+r);
//function definition
function myFun(arg){
    //todo
    console.log(arg);
}
//function calling
myFun(x);   //myFun(10);
myFun(y);   //myFun("hello");
myFun(z);   //myFun(true);

//passing function as an argument to another function
myFun(f);   //myFun(function sum(i,j){

//});

//a function return another function as return value
function newFun(){
    let x=10;
    //return x;
    return function sum(i,j){

    };
}

