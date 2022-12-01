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