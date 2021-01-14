# Exercise 1 - Diplomado DevOps Módulo 4

Tests to calculate the 10% withdrawal according to Chilean law

### Test Cases

> 1. Shouldn't can withdraw money when i've negative balance
> 2. Shouldn't can withdraw money when i've zero balance
> 3. Should can withdraw money 500.000 CLP when i have 500.000 CLP balance
> 4. Should can withdraw money 1.000.000 CLP when i've 1.000.000 CLP balance
> 5. Should can withdraw money 1.000.000 CLP when i've 5.000.000 CLP balance
> 6. Should can withdraw money 2.000.000 CLP when i've 20.000.000 CLP balance
> 7. Should can withdraw money 4.300.000 CLP when i've 50.000.000 CLP balance

### Code

```
assertEquals(0, afp.withdrawMoney(-100));
assertEquals(0, afp.withdrawMoney(0));
assertEquals(500000, afp.withdrawMoney(500000));
assertEquals(1000000, afp.withdrawMoney(1000000));
assertEquals(1000000, afp.withdrawMoney(5000000));
assertEquals(2000000, afp.withdrawMoney(20000000));
assertEquals(4300000, afp.withdrawMoney(50000000));
```
