package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.AirplaneTakeoffBold: ImageVector
    get() {
        if (_AirplaneTakeoffBold != null) {
            return _AirplaneTakeoffBold!!
        }
        _AirplaneTakeoffBold = ImageVector.Builder(
            name = "Bold.AirplaneTakeoffBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 216f)
                lineTo(168f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 112.51f)
                lineTo(58.65f, 84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, -13.3f)
                lineTo(68f, 68f)
                lineToRelative(57.53f, 21.17f)
                lineToRelative(54.84f, -32.75f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41f, 7.32f)
                lineTo(240f, 87.64f)
                lineToRelative(-147.41f, 88f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38f, -4.32f)
                lineTo(18.53f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.32f, -13.19f)
                lineTo(24f, 121.27f)
                lineTo(55.79f, 132f)
                close()
            }
        }.build()

        return _AirplaneTakeoffBold!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTakeoffBold: ImageVector? = null
