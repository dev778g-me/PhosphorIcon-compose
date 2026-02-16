package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.AlienBold: ImageVector
    get() {
        if (_AlienBold != null) {
            return _AlienBold!!
        }
        _AlienBold = ImageVector.Builder(
            name = "Bold.AlienBold",
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
                moveTo(216f, 112f)
                curveToRelative(0f, 48.6f, -56f, 120f, -88f, 120f)
                reflectiveCurveTo(40f, 160.6f, 40f, 112f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(80f, 136f)
                arcToRelative(29.39f, 16.97f, 45f, isMoreThanHalf = true, isPositiveArc = false, 24f, -24f)
                arcToRelative(29.39f, 16.97f, 45f, isMoreThanHalf = true, isPositiveArc = false, -24f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(143.21f, 144.78f)
                arcToRelative(29.39f, 16.97f, 135f, isMoreThanHalf = true, isPositiveArc = false, 41.56f, -41.56f)
                arcToRelative(29.39f, 16.97f, 135f, isMoreThanHalf = true, isPositiveArc = false, -41.56f, 41.56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116f, 184f)
                lineTo(140f, 184f)
            }
        }.build()

        return _AlienBold!!
    }

@Suppress("ObjectPropertyName")
private var _AlienBold: ImageVector? = null
