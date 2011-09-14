import geb.spock.GebSpec

class GoogleSpec extends GebSpec {
    
    def setup() {
        to GooglePage
    }
    
    def "JGGUGで検索したとき、タイトルに検索文字列が表示されること"() {
        search("JGGUG")
        waitFor {
            title.contains "jggug"
        }

        expect:
        true
    }
}

