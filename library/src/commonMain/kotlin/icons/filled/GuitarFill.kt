package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GuitarFill: ImageVector
    get() {
        if (_GuitarFill != null) {
            return _GuitarFill!!
        }
        _GuitarFill = ImageVector.Builder(
            name = "Filled.GuitarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(249.66f, 46.34f)
                lineToRelative(-40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(200.69f, 20f)
                lineTo(140.52f, 80.16f)
                curveTo(117.73f, 68.3f, 92.21f, 69.29f, 76.75f, 84.74f)
                arcToRelative(42.27f, 42.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.39f, 14.37f)
                arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 59.81f, 104f)
                curveToRelative(-14.59f, 0.49f, -27.26f, 5.72f, -36.65f, 15.11f)
                curveTo(11.08f, 131.22f, 6f, 148.6f, 8.74f, 168.07f)
                curveTo(11.4f, 186.7f, 21.07f, 205.15f, 36f, 220f)
                reflectiveCurveToRelative(33.34f, 24.56f, 52f, 27.22f)
                arcTo(71.13f, 71.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 98.1f, 248f)
                curveToRelative(15.32f, 0f, 28.83f, -5.23f, 38.76f, -15.16f)
                curveToRelative(9.39f, -9.39f, 14.62f, -22.06f, 15.11f, -36.65f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.92f, -7.55f)
                arcToRelative(42.22f, 42.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.37f, -9.39f)
                curveToRelative(15.45f, -15.46f, 16.44f, -41f, 4.58f, -63.77f)
                lineTo(236f, 55.31f)
                lineToRelative(2.34f, 2.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(93.66f, 205.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.31f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93.66f, 205.65f)
                close()
                moveTo(135.8f, 159.79f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -39.59f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 135.8f, 159.79f)
                close()
                moveTo(166.86f, 101.79f)
                arcToRelative(86.94f, 86.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6.68f)
                arcToRelative(85.23f, 85.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.69f, -6f)
                lineTo(176f, 67.31f)
                lineTo(188.69f, 80f)
                close()
                moveTo(200f, 68.68f)
                lineTo(187.32f, 56f)
                lineTo(212f, 31.31f)
                lineTo(224.69f, 44f)
                close()
            }
        }.build()

        return _GuitarFill!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarFill: ImageVector? = null
