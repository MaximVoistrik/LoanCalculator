import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoanGetConditions {
    @Test
    public void ValidData(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("21");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("20");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderFAndAgePlusMatPer54(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("50");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("4");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderFAndAgePlusMatPer55(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("51");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("4");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderFAndAgePlusMatPer56(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("52");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("4");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderMAndAgePlusMatPer59(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("55");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("4");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderMAndAgePlusMatPer60(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("56");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("4");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderMAndAgePlusMatPer61(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("57");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("4");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithReqLoanDividedMatPerLessLastYearWageMultiply0point33(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithReqLoanDividedMatPerEqualLastYearWageMultiply0point33(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("9");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithReqLoanDividedMatPerMoreLastYearWageMultiply0point33(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveAndRequiredLoanLess1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveAndRequiredLoan1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveAndRequiredLoanMore1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeWageAndRequiredLoanLess5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeWageAndRequiredLoan5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeWageAndRequiredLoanMore5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("8");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypBusinessAndRequiredLoanLess10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("9");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeBusinessAndRequiredLoan10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeBusinessAndRequiredLoanMore10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("11");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScoreMinus1AndRequestedLoanLess1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScoreMinus1AndRequestedLoan1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScoreMinus1AndRequestedLoanMore1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore0AndRequestedLoanLess5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore0AndRequestedLoan5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore0AndRequestedLoanMore5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore1AndRequestedLoanLess10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("9.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore1AndRequestedLoan10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore1AndRequestedLoanMore10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore2AndRequestedLoanLess10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("9.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore2AndRequestedLoan10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScore2AndRequestedLoanMore10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore0RequestedLoanLess1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore0RequestedLoan1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore0RequestedLoanMore1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore1RequestedLoanLess5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore1RequestedLoan5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore1RequestedLoanMore5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore2RequestedLoanLess5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore2RequestedLoan5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypePassiveCreditScore2RequestedLoanMore5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeWageCreditScoreMinus1RequestedLoanLess1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeWageCreditScoreMinus1RequestedLoan1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeWageCreditScoreMinus1RequestedLoanMore1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeBusinessCreditScore0RequestedLoanLess5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeBusinessCreditScore0RequestedLoan5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        String BaseRate = secondAlert.getText();
        System.out.println(BaseRate);
        secondAlert.accept();
        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithSalaryTypeBusinessCreditScore0RequestedLoanMore5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("35");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("15");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("5.5");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("2");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();
    }
}
