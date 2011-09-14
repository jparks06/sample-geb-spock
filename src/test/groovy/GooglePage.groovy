import geb.Page

class GooglePage extends Page {

    static url = "/"
    
    static at = { title == "Google" }
    
    static content = {
        searchField { $("input", id:"lst-ib") }
        searchButton { $("input", name:"btnG") }
    }

    void search(String word) {
        searchField.value(word)
        //searchButton.click()
    }
    
}
