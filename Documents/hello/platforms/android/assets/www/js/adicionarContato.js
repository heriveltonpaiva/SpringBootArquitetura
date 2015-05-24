function onSuccess(contact) {
                alert("Salvo com Sucesso");
            };
 
            function onError(contactError) {
                alert("Error = " + contactError.code);
            };
 
            function saveContact()
            {
                var myContact = navigator.contacts.create();
                myContact.displayName = document.getElementById('nameContact').value;
                myContact.nickname = document.getElementById('nameContact').value;
 
                var phoneNumbers = [];
                phoneNumbers[0] = new ContactField('Celular', document.getElementById('celContact').value, true);
                myContact.phoneNumbers = phoneNumbers;
 
                myContact.save(onSuccess(myContact),onError);
 
            }