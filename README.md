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