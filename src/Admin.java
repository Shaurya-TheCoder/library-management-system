class Admin extends User{

    Admin(String name, String userId){
        super(name, userId);
    }
    @Override
    public void showMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. View All Book");
        System.out.println("4. Exit");
    }
}
