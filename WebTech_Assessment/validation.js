document.addEventListener("DOMContentLoaded", () => {
    document.getElementById("suggestion_form").addEventListener("submit", handleSubmit)
});

function handleSubmit(event) {
    event.preventDefault();         // this is so the form is not sent  
    console.log(event.target);
    var myForm = document.getElementById("suggestion_form");
    var valid = true;
    console.log(myForm.email.value +' '+ myForm.name.value);
    var children = ["email","name","theme"];

    for (var i = children.length - 1; i >= 0; i--) {
        if (myForm[children[i]].value == ""){
            if (valid) {
                valid = false;
            }
            document.getElementById(children[i] + "RequiredError").style.display = "block";
        }
    }
    if(valid) {
        console.log("form submitted")
    }
}





// function main() {
//     var myForm = document.getElementById('suggestion_form');
//     myForm.addEventListener('submit',handleSubmit);    

// }
// function handleSubmit(event) {
//     event.preventDefault();
//     var myForm = document.getElementById("suggestion_form");
//     var valid = true;
//     var isEmpty =true;
    

//     if (myForm.email.value == "") {
         
//         valid = false;
//         document.getElementById('emailRequiredError').style.display = 'block';
//         event.preventDefault();
//     } else {
//         document.getElementById('emailRequiredError').style.display = 'none';        
//     }
    



//     if(myForm.name.value == '') {
        
//         isEmpty = false;
//         document.getElementById('nameRequiredError').style.display = 'block';
//         event.preventDefault();
//     } else {
//         document.getElementById('nameRequiredError').style.display = 'none';        
//     }
    


//     if(valid) {
//         console.log('name submitted');
//     } 
//     if (isEmpty) {
//         console.log('email submited');
//     }
// }
