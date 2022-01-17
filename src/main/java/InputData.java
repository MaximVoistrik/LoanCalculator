import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputData {
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
    public void DataWithAgeless0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("-2");
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

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithAge0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("0");
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

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithFloatAge(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("2.35");
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

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithEmptyAge(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("");
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

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithGenderMale(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='male']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithGenderFemale(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithEmptyGender(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();

    }
    @Test
    public void DataWithSalaryTypePassive(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='passive']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithSalaryTypeWage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='wage']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithSalaryTypeOwnBusiness(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithSalaryTypeUnemployed(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='unemployed']"));
        SalaryType.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithEmptySalaryType(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithLastYearWageLess0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("-3");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithLastYearWage0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("0");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithLastYearWageFloatType(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("4.24");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithEmptyLastYearWage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScoreFloatType(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1.24");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScoreMinus3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-3");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithCreditScoreMinus2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithCreditScoreMinus1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("-1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.8");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithCreditScore0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("0");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.8");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithCreditScore1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("1");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("4");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithCreditScore2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("7");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithCreditScore3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("3");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("7");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithEmptyCreditScore(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("7");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithRequestedLoanLess0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("-2");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert thirdAlert = driver.switchTo().alert();
        String AnnualPayment = thirdAlert.getText();
        System.out.println(AnnualPayment);
        thirdAlert.accept();
        driver.quit();
    }
    @Test
    public void DataWithRequestedLoan0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
    }
    @Test
    public void DataWithRequestedLoan1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("1");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithRequestedLoanDivided0point1WithRemainder(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6.75");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();

    }
    @Test
    public void DataWithRequestedLoanLess0point1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.01");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='business development']"));
        Purpose.click();
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();

    }
    @Test
    public void DataWithRequestedLoan0point1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("10");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("0.1");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithRequestedLoan10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithRequestedLoanMore10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("10.3");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithEmptyRequestedLoan(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("15");
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
    public void DataWithMaturityPeriodLess0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("-3");
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
    public void DataWithMaturityPeriod0(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("0");
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
    public void DataWithMaturityPeriodFloatType(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("3.4564");
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
    public void DataWithMaturityPeriod0point5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("0.5");
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
    public void DataWithMaturityPeriod1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("1");
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
    public void DataWithMaturityPeriod2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
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
    public void DataWithMaturityPeriod19(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("19");
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
    public void DataWithMaturityPeriod20(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
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
    public void DataWithMaturityPeriod21(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("21");
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
    public void DataWithEmptyMaturityPeriod(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("");
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
    public void DataWithPurposeMortgage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("10");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='mortgage']"));
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
    public void DataWithPurposeBusinessDevelopment(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("10");
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
    public void DataWithPurposeCarLoan(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("10");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='car loan']"));
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
    public void DataWithPurposeConsumer(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("10");
        WebElement Purpose = driver.findElement(By.xpath("//input[@value='consumer']"));
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
    public void DataWithEmptyPurpose(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ereticor.github.io/maxTest/");
        WebElement Gender = driver.findElement(By.xpath("//input[@value='female']"));
        Gender.click();
        WebElement Age = driver.findElement(By.name("age"));
        Age.sendKeys("25");
        WebElement SalaryType = driver.findElement(By.xpath("//input[@value='own business']"));
        SalaryType.click();
        WebElement LastYearWage = driver.findElement(By.name("lastYearWage"));
        LastYearWage.sendKeys("30");
        WebElement CreditScore = driver.findElement(By.name("creditScore"));
        CreditScore.sendKeys("2");
        WebElement RequestedLoan = driver.findElement(By.name("requestedLoan"));
        RequestedLoan.sendKeys("6");
        WebElement MaturityPeriod = driver.findElement(By.name("maturityPeriod"));
        MaturityPeriod.sendKeys("10");
        WebElement SendData = driver.findElement(By.xpath("//button[@type='submit']"));
        SendData.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();
        driver.quit();

    }
}

