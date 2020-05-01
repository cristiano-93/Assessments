var prefArray =[];

function main() {
    document.getElementById('contact-form').addEventListener('submit', handleSubmit);
    document.getElementById('contact-form').addEventListener('change', handleChange);

}

function handleChange(e) {

    prefArray =[];

    var prefs = document.getElementById('contact-form').pref

    for(var i=0; i< prefs.length;i++) {
        if(prefArray[i].checked) {
            prefArray.push(prefArray[i].checked.value);
        }
    }

    


    console.log('changed')
}

function handleSubmit(event) {

    var myForm = document.getElementById('contact-form');
    var valid = true;
    
    if (myForm.email.value == '') {
        event.preventDefault();
        valid =false;
        document.getElementById('emailRequiredError').style.display = 'block'

        
    } else {
        document.getElementById('emailRequiredError').style.display = 'none'
        valid = true;
    }
    if (myForm.name.value == '') {
        event.preventDefault();
        valid = false;
        document.getElementById('nameRequiredError').style.display = 'block'

    
    } else {
        document.getElementById('nameRequiredError').style.display = 'none'
        valid = true;
    }

    if (myForm.terms.checked == false) {
        event.preventDefault();
        valid =false;
        document.getElementById('termsRequiredError').style.display = 'block'

        // termsRequiredError
    } else {
        document.getElementById('termsRequiredError').style.display = 'none'
        valid = true;}
    
    if (prefArray.length ==0) {
        event.preventDefault();
        valid =false;
        document.getElementById('prefRequiredError').style.display = 'block'

        // termsRequiredError
    } else {
        document.getElementById('prefRequiredError').style.display = 'none'
        valid = true;}


    if (valid) {
        console.log('form submited')
    }

    event.preventDefault();
    console.log("form not submitted");
 
}