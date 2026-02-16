package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.MapPinAreaBold: ImageVector
    get() {
        if (_MapPinAreaBold != null) {
            return _MapPinAreaBold!!
        }
        _MapPinAreaBold = ImageVector.Builder(
            name = "Bold.MapPinAreaBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 80f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 80f)
                curveToRelative(0f, 56f, -56f, 88f, -56f, 88f)
                reflectiveCurveTo(72f, 136f, 72f, 80f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(204f, 156.69f)
                curveToRelative(17.37f, 7.15f, 28f, 16.75f, 28f, 27.31f)
                curveToRelative(0f, 22.09f, -46.56f, 40f, -104f, 40f)
                reflectiveCurveTo(24f, 206.09f, 24f, 184f)
                curveToRelative(0f, -10.56f, 10.63f, -20.16f, 28f, -27.31f)
            }
        }.build()

        return _MapPinAreaBold!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinAreaBold: ImageVector? = null
