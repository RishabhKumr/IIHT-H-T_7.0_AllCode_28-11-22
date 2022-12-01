const func1 = () =>{
    console.log("this is function 1");
}
const func2 = ()=>{
    setTimeout( ()=>{
        console.log("Hey this function was executed in set time out");
    },5000);
    console.log("this is function");
}
const func3 = () => {
    console.log("this is function 3");
}
func1();
func2();
func3();


//Promises

const func4 = () =>{
    return "this is function 4";
}
const func5 = ()=>{

    return new Promise((resolve,reject) => {
        setTimeout( ()=>{
            resolve ("Hey this function was executed in set time out(promises return)")
        },2000);
        console.log("this is function 5");
    })
}
const func6 = () => {
    return "this is function 6";
}

const callFunc = async () =>{
    let val1 = func4();
    console.log(val1)
    let val2 = await func5();
    console.log(val2)
    let val3 = func6();
    console.log(val3);

}