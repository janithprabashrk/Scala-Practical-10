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
      println(s"Withdrew ${amount} LKR. New balance: $$${balance}")
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
      println(s"Transferred ${amount} LKR to target account.")
    } else if (amount > balance) {
      println("Insufficient balance for transfer.")
    } else {
      println("Transfer amount must be positive.")
    }
  }

  def checkBalance(): Double = balance
}

object Main extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)

  account1.deposit(200)
  account1.withdraw(150)
  account1.transfer(300, account2)

  println(s"Account 1 balance: ${account1.checkBalance()}LKR")
  println(s"Account 2 balance: ${account2.checkBalance()}LKR")
}


