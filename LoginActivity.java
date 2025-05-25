String adminEmail = "admin@localloop.com";
String adminPassword = "XPI76SZUqyCjVxgnUjm0";

if (email.equals(adminEmail) && password.equals(adminPassword)) {
    Intent intent = new Intent(this, WelcomeActivity.class);
    intent.putExtra("firstName", "Admin");
    intent.putExtra("role", "admin");
    startActivity(intent);
} else {
    // Use FirebaseAuth to login for other roles
}
