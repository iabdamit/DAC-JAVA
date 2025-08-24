// ! Quest
// class Tester {
// public static void main(String[] args) {
// int noOfFive = 3;
// int noOfOne = 3;
// int purchaseAmount = 19;

// int maxFiveRequired = purchaseAmount / 5; // should be divided by 5, not 4

// int fiveToUse;
// if (maxFiveRequired <= noOfFive) {
// fiveToUse = maxFiveRequired;
// } else {
// fiveToUse = noOfFive;
// }

// int remainder = purchaseAmount - (fiveToUse * 5);

// if (remainder <= noOfOne) {
// System.out.println("$1 notes needed = " + remainder);
// System.out.println("$5 notes needed = " + fiveToUse);
// } else {
// System.out.println("-1");
// }
// }
// }

// ! Quest 2 LCM
// class Tester {
// public static void main(String[] args) {
// int num1 = 7;
// int num2 = 9;
// int lcm = 0;
// int max = (num1 > num2) ? num1 : num2;
// for (int i = max;; i++) {
// if ((i % num1 == 0) && (i % num2 == 0)) {
// lcm = i;
// break;
// }
// }
// System.out.println(lcm);
// }
// }

//! quest 3
// public class Tester {
//     public static void main(String[] args) {
//         int day = 31;
//         int month = 12;
//         int year = 2023;
//         int maxDays = 0;
//         //!Determine max days in month
//         if (month == 1 || month == 3 || month == 5 || month == 7 ||
//                 month == 8 || month == 10 || month == 12) {
//             maxDays = 31;
//         } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//             maxDays = 30;
//         } else if (month == 2) {
//             if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                 maxDays = 29;
//             } else {
//                 maxDays = 28;
//             }
//         }
//         day = day + 1;
//         if (day > maxDays) {
//             day = 1;
//             month = month + 1;
//             if (month > 12) {
//                 month = 1;
//                 year = year + 1;
//             }
//         }
//         System.out.println("Next Date: " + day + "-" + month + "-" + year);
//     }
// }

//! quest

class Tester {
    public static void main(String[] args) {
        int accountNumber = 1001;
        int salary = 60000;
        int accountBalance = 250000;
        String loanType = "Car";
        int loanAmountExpected = 300000;
        int emisExpected = 30;

        if (accountNumber < 1000 || accountNumber > 1999) {
            System.out.println("Invalid Account Number");
            return;
        }
        if (accountBalance < 1000) {
            System.out.println("Account Balance Must Be Minimum 1000");
            return;
        }
        int eligibleLoanAmount = 0;
        int eligibleEmis = 0;
        if (salary > 75000 && loanType.equalsIgnoreCase("Business")) {
            eligibleLoanAmount = 500000;
            eligibleEmis = 36;
        } else if (salary > 50000 && loanType.equalsIgnoreCase("House")) {
            eligibleLoanAmount = 6000000;
            eligibleEmis = 60;
        } else if (salary > 25000 && loanType.equalsIgnoreCase("Car")) {
            eligibleLoanAmount = 500000;
            eligibleEmis = 36;
        } else {
            System.out.println("Invalid loan type or salary not eligible for requested loan type");
            return;
        }

        if (loanAmountExpected <= eligibleLoanAmount && emisExpected <= eligibleEmis) {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Eligible Loan Amount: $" + eligibleLoanAmount);
            System.out.println("Requested Loan Amount: $" + loanAmountExpected);
            System.out.println("Eligible EMIs: " + eligibleEmis);
            System.out.println("Requested EMIs: " + emisExpected);
        } else {
            System.out.println("The customer is not eligible for the loan");
        }

    }
}
