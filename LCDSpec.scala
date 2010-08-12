import org.specs._

class LCDSpec extends Specification {
  "Single numbers" in {
     LCD.convert(1) must be equalTo("   \n  |\n   \n  |\n   ")
     LCD.convert(2) must be equalTo(" - \n  |\n - \n|  \n - ")
     LCD.convert(3) must be equalTo(" - \n  |\n - \n  |\n - ")
     LCD.convert(4) must be equalTo("   \n| |\n - \n  |\n   ")
     LCD.convert(5) must be equalTo(" - \n|  \n - \n  |\n - ")
     LCD.convert(6) must be equalTo("   \n|  \n - \n| |\n - ")
     LCD.convert(7) must be equalTo(" - \n  |\n   \n  |\n   ")
     LCD.convert(8) must be equalTo(" - \n| |\n - \n| |\n - ")
     LCD.convert(9) must be equalTo(" - \n| |\n - \n  |\n   ")
     LCD.convert(0) must be equalTo(" - \n| |\n   \n| |\n - ")
  }
  "Double numbers" in {
     LCD.convert(10) must be equalTo("     - \n  | | |\n       \n  | | |\n     - ")
     LCD.convert(99) must be equalTo(" -   - \n| | | |\n -   - \n  |   |\n       ")
  }
  "Any number" in {
     LCD.convert(103) must be equalTo("     -   - \n  | | |   |\n         - \n  | | |   |\n     -   - ")
  }
  "Negative number" in {
     LCD.convert(-1) must throwA[IllegalArgumentException]
  }

}