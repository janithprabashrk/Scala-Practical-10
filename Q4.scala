class Account(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$${amount}. New balance: $$${balance}")
    } else {
      println("Deposit amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount}. New balance: $$${balance}")
    } else if (amount > balance) {
      println("Insufficient balance.")
    } else {
      println("Withdraw amount must be positive.")
    }
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      this.withdraw(amount)
      targetAccount.deposit(amount)
      println(s"Transferred $$${amount} to target account.")
    } else if (amount > balance) {
      println("Insufficient balance for transfer.")
    } else {
      println("Transfer amount must be positive.")
    }
  }

  def getBalance: Double = balance

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.1
    }
  }

  override def toString: String = s"Account(balance: $$${balance})"
}

class Bank(accounts: List[Account]) {
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAll(): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

object Main extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(-200.0)
  val account3 = new Account(500.0)
  val account4 = new Account(-50.0)

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances.foreach(println)

  println(s"Total balance in the bank: $$${bank.totalBalance}")

  bank.applyInterestToAll()
  println("Final balances after applying interest:")
  bank.accountsWithNegativeBalances.foreach(println)
  println(s"Total balance in the bank after interest: $$${bank.totalBalance}")
}
