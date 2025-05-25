FirebaseAuth mAuth = FirebaseAuth.getInstance();
DatabaseReference database = FirebaseDatabase.getInstance().getReference("users");

// Get input from EditTexts
String firstName = etFirstName.getText().toString();
String lastName = etLastName.getText().toString();
String email = etEmail.getText().toString();
String password = etPassword.getText().toString();
String role = spinnerRole.getSelectedItem().toString(); // Organizer or Participant

mAuth.createUserWithEmailAndPassword(email, password)
    .addOnCompleteListener(task -> {
        if (task.isSuccessful()) {
            String uid = mAuth.getCurrentUser().getUid();
            User user = new User(firstName, lastName, email, role);
            database.child(uid).setValue(user);
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Signup Failed", Toast.LENGTH_SHORT).show();
        }
    });
