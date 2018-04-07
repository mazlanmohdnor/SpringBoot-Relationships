## Spring Boot relationships

This is my own notes on Spring Relationships

### One-To-One:
**Ex: 1 husband can have 1 wife**

1. Define Wife entity
2. Add propeties
3. Add Husband 
```bash
 @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
 @JoinColumn(name = "husband_id")
 private Husband husband;
```
---
1. Define Husband entity
2. Add properties
3. Add Wife
4. mappedBy is the instance on the other class
```bash
@OneToOne(mappedBy = "husband")
private Wife wife;
```

### One-To-Many:
**Ex: 1 user can have many addresses**
1. Define User entity
2. Add propeties
3. Add Collection of Address 
```bash
@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
private List<Address> addresses = new ArrayList<>();
```

1. Define Address entity
2. Add propeties
3. Add User
4. @JoinColumn will be a column in Address table

```bash
@ManyToOne
@JoinColumn(name = "fk_userId")
private User user;
```

example:
```bash
 public void saveData() {
        User user = new User("mazlan");

        Address address = new Address("serdang","selangor","malaysia");
        Address address2 = new Address("serdang2","selangor2","malaysia2");
        Address address3 = new Address("serdang3","selangor3","malaysia3");

        address.setUser(user);
        address2.setUser(user);
        address3.setUser(user);

        user.getAddresses().add(address);
        user.getAddresses().add(address2);
        user.getAddresses().add(address3);

        userRepository.save(user);

    }
```