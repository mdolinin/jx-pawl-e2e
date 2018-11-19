package mdolinin.github.io.demo;

import org.scalatest.FlatSpec
import pawl.WebSpec

class SimpleE2ESpec extends FlatSpec with WebSpec {
  "JX Demo App" should "show demo page with data from other services" in {
    Guest open "http://jx-react-demo-app.jx-production.35.228.124.40.nip.io"
    Then see "Welcome to Jenkins X with React" in ".App-title" by css
    And see "To get started, edit src/components/App.js and save to reload." in ".App-intro" by css
    And see "Hello World" in "sacala-service-data"
  }
}
