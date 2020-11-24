class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || "".equals(firstName)) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
        // write your code here
    }

    public void setLastName(String lastName) {
        if (lastName == null || "".equals(lastName)) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
        // write your code here
    }

    public String getFullName() {
        if ("".equals(this.lastName) && "".equals(this.firstName)) {
            return "Unknown";
        } else {
            return this.firstName + " " + this.lastName; // write your code here
        }
    }
}