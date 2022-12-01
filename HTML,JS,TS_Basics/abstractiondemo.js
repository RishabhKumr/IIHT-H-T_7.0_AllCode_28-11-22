function car(color,model,cost)
{
    this.color = color;
    this.cost = cost;
    this.model = model;

   this.getCarDetails = function() {
    console.log("Color: "+this.color);
    console.log("Model: "+this.model);
    console.log("cost: "+this.cost);
}

this.totalCostOfOwnership = function() {
    console.log(this.model);
}

}

let BMW = new car("black","10000","C class");
BMW.getCarDetails(); 