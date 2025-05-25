String firstName = getIntent().getStringExtra("firstName");
String role = getIntent().getStringExtra("role");

TextView welcomeText = findViewById(R.id.welcomeText);
welcomeText.setText("Welcome " + firstName + "! You are logged in as \"" + role + "\".");
