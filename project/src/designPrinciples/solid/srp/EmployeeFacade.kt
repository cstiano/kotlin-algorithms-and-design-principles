package designPrinciples.solid.srp

class EmployeeFacade constructor(
    val payCalculator: PayCalculator = PayCalculator(),
    val hourReporter: HourReporter = HourReporter(),
    val employeeSaver: EmployeeSaver = EmployeeSaver()
) {

    fun calculatePay() = payCalculator.calculatePay()

    fun hourReporter() = hourReporter.reportHours()

    fun save() {
        employeeSaver.saveEmployee()
    }
}