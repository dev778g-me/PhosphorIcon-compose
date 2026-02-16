package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ParallelogramBold: ImageVector
    get() {
        if (_ParallelogramBold != null) {
            return _ParallelogramBold!!
        }
        _ParallelogramBold = ImageVector.Builder(
            name = "Bold.ParallelogramBold",
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
                moveTo(24f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, -11.28f)
                lineToRelative(64.8f, -144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.81f, 48f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.3f, 11.28f)
                lineToRelative(-64.8f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, 4.72f)
                close()
            }
        }.build()

        return _ParallelogramBold!!
    }

@Suppress("ObjectPropertyName")
private var _ParallelogramBold: ImageVector? = null
