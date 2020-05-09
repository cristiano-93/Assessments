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
