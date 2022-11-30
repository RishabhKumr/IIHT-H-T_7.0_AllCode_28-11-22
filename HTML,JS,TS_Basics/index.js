var name = "Rishabh"; //t inside a function hence a Global Function
        var age = "24"
        var laptop
        console.log(name);
        function alertUser(){
            console.log("User has logged in"+name);
            alert("This user has logged in"+name);
        }
        alertUser();
        function opeartors(num){
            // =  is assignment opr
            if(num > 20){
                console.log("Number is greater than 20");
            }
            else if(num == 20)
            {
                console.log("number is equal to 20");
            }
            else{
                console.log("number is smaller than 20");
            }
        }
        opeartors(21);
        function CreditScore(score){
            var grade;
            switch(score){
                case 800:grade="Excell";
                break;
                case 700:grade="Good";
                break;
                case 600:grade="10,000 tp 25000";
                default:grade="not eligible";
            }
            console.log(grade);
        }
        CreditScore(800);
        function counting(){
            for(let i =1; i < 10; i++)
            {
                console.log(i);
            }
        }
        

        var car = new Object();
        car.brand = "Mercedes"
        car.model = "C class"
        car.price = 600000
        console.log(car.brand+" "+car.model+" "+car.price);
        console.log(car);
        counting();

        var names = ["rishabh","kumatr"];
        console.log(names);
        //Let Car = class{ --> Another way to create class
        class Car {
            constructor(brand,modelName,price){
                this.price = price;
                this.brand = brand;
                this.modelName = modelName;
            }
            print(){
                console.log(this.brand+" "+this.modelName+" "+this.price);
            }
        }

        var C1 = new Car("Mercedes","A Class",400000);
        var C2 = new Car("BMW","3",5000000);
        C1.print();
        C2.print();

        //Class Inheritence
        class TodaysDate extends Date {
            constructor(){
                super();
            }
            printDate(){
                console.log(this.getDate())
            }
        }
        let today = new TodaysDate();
        today.printDate();

        class AppleLaptops {
            constructor(brand){
                this.brand="Apple";
            }
        }
        class Macbookpro extends AppleLaptops {
            constructor(model,processor,ram){
               super();
                this.processor=processor;
                this.model=model;
                this.ram=ram;
            }
        }

        let l1 = new Macbookpro("2021","macbookpro","i7",16)
        console.log(l1.brand+" "+l1.model+" "+l1.processor+" "+l1.ram);
        let fruits = ["Apple","Banana"];
        let seasonalFruits = ["Mango","lichi"];

        let allFruits = [ ...fruits, ...seasonalFruits];
        console.log(allFruits);

        let countingnumber=()=>{
            for(let i=1;i<10;i++){
                console.log(i);
            }
        }
        countingnumber();
