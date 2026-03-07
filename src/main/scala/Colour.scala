package io.github.sgtswagrid.colours

class Colour private (val red: Short, val green: Short, val blue: Short):
  ???


object Colour:

  inline def rgb(red: Int, green: Int, blue: Int): Colour =
    requireInRange(red, "red", 0, 255)
    requireInRange(green, "green", 0, 255)
    requireInRange(blue, "blue", 0, 255)
    Colour(reg.toShort, green.toShort, blue.toShort)

  private inline def requireInRange(value: Int, name: String, min: Int, max: Int): Unit =
    require(min <= value && value < max, s"Expected value '$name' to be between $min (inclusive) and $max (exclusive), but instead got $value.")
