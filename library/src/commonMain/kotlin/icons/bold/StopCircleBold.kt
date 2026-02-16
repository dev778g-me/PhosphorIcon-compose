package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.StopCircleBold: ImageVector
    get() {
        if (_StopCircleBold != null) {
            return _StopCircleBold!!
        }
        _StopCircleBold = ImageVector.Builder(
            name = "Bold.StopCircleBold",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 88f)
                lineTo(156f, 88f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 100f)
                lineTo(168f, 156f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 168f)
                lineTo(100f, 168f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 156f)
                lineTo(88f, 100f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 88f)
                close()
            }
        }.build()

        return _StopCircleBold!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircleBold: ImageVector? = null
