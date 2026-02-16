package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PlayCircleBold: ImageVector
    get() {
        if (_PlayCircleBold != null) {
            return _PlayCircleBold!!
        }
        _PlayCircleBold = ImageVector.Builder(
            name = "Bold.PlayCircleBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(170.83f, 118.13f)
                lineToRelative(-52f, -36f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100f, 92f)
                verticalLineToRelative(72f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.83f, 9.87f)
                lineToRelative(52f, -36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -19.74f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
        }.build()

        return _PlayCircleBold!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircleBold: ImageVector? = null
