reportsDir = "build/reports/geb"

driver = "org.openqa.selenium.ie.InternetExplorerDriver"

environments {
    // when system property 'geb.env'
    'firefox' {
        driver = "org.openqa.selenium.firefox.FirefoxDriver"
    }
}

