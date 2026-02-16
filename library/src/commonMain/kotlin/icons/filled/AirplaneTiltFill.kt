package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AirplaneTiltFill: ImageVector
    get() {
        if (_AirplaneTiltFill != null) {
            return _AirplaneTiltFill!!
        }
        _AirplaneTiltFill = ImageVector.Builder(
            name = "Filled.AirplaneTiltFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(215.52f, 197.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.86f, 8.39f)
                lineToRelative(-24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 232f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.87f, -3.52f)
                lineToRelative(-44.07f, -66.12f)
                lineTo(112f, 183.59f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, 5.65f)
                reflectiveCurveToRelative(-14f, 14.06f, -15.88f, 15.88f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91f, 231.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.41f, -4.35f)
                lineToRelative(-0.06f, -0.15f)
                lineToRelative(-14.7f, -36.76f)
                lineTo(29f, 175.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.69f, -13.08f)
                lineToRelative(16f, -16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 144f)
                horizontalLineTo(72.4f)
                lineToRelative(21.27f, -21.27f)
                lineTo(27.56f, 78.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.22f, -12.32f)
                lineToRelative(24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.39f, -1.86f)
                lineToRelative(85.94f, 31.25f)
                lineTo(176.2f, 40.19f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.6f, 39.6f)
                lineToRelative(-31.53f, 31.53f)
                close()
            }
        }.build()

        return _AirplaneTiltFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTiltFill: ImageVector? = null
