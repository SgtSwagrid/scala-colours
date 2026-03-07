package io.github.sgtswagrid.colours

class Colour private (
  val red: Short,
  val green: Short,
  val blue: Short,
  val alpha: Short = 255,
):

  def hex: Int = (red.toInt << 16) | (green.toInt << 8) | blue.toInt

  def hexString: String = f"#$red%02X$green%02X$blue%02X"

object Colour:

  def rgb
    (
      red: Int,
      green: Int,
      blue: Int,
      alpha: Int = 255,
    )
    : Colour =
    val r = Math.clamp(red, 0, 255).toShort
    val g = Math.clamp(green, 0, 255).toShort
    val b = Math.clamp(blue, 0, 255).toShort
    val a = Math.clamp(alpha, 0, 255).toShort
    new Colour(r, g, b, a)

  def hex(hex: Int): Colour =
    val r = ((hex >> 16) & 0xFF).toShort
    val g = ((hex >> 8) & 0xFF).toShort
    val b = (hex & 0xFF).toShort
    new Colour(r, g, b)

  def hex(hex: String): Colour =
    Colour.hex(Int.fromString(hex, 16)).getOrElse(0).)
