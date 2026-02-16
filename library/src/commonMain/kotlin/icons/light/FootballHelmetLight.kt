package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.FootballHelmetLight: ImageVector
    get() {
        if (_FootballHelmetLight != null) {
            return _FootballHelmetLight!!
        }
        _FootballHelmetLight = ImageVector.Builder(
            name = "Light.FootballHelmetLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(84f, 164f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.81f, -9.74f)
                lineToRelative(-15.62f, -52.52f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 128f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-4f)
                arcToRelative(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -93.31f, -92f)
                curveTo(72.65f, 32.71f, 32f, 73.92f, 32f, 124f)
                arcToRelative(91.91f, 91.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.14f, 76f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 128f)
                lineToRelative(24.31f, 82.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180f, 216f)
                horizontalLineToRelative(36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(121.19f)
            }
        }.build()

        return _FootballHelmetLight!!
    }

@Suppress("ObjectPropertyName")
private var _FootballHelmetLight: ImageVector? = null
