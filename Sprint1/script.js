//Changing h1 color on mouse hover
document.getElementById("reg").addEventListener("mouseover", mouseOver);
document.getElementById("reg").addEventListener("mouseout", mouseOut);

function mouseOver() {
  document.getElementById("reg").style.color = "red";
}

function mouseOut() {
  document.getElementById("reg").style.color = "black";
}

//Form data to console log and next page ref
function dataOnConsole(){
   
    console.log("Full Name:- "+document.getElementById('name').value);
    console.log("Mobile number:- "+document.getElementById('mobilenumber').value);
    console.log("Issue Date:- "+document.getElementById('issuedate').value);
    console.log("Date of Birth:- "+document.getElementById('dob').value);
    console.log("Gender:- "+document.getElementById('gender').value);
    console.log("ID Number:- "+document.getElementById('idnumber').value);
    console.log("Issue date:- "+document.getElementById('issuedate').value);
    console.log("ID type:- "+document.getElementById('idtype').value);
    console.log("Issue state:- "+document.getElementById('issuestate').value);
    console.log("Email:- "+document.getElementById('email').value);
    console.log("Occupation:- "+document.getElementById('occupation').value);
    console.log("Issue Authority:- "+document.getElementById('issueauth').value);
    console.log("Expiry Date:- "+document.getElementById('expdate').value);    
}