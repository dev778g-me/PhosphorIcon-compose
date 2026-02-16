package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.TShirtBold: ImageVector
    get() {
        if (_TShirtBold != null) {
            return _TShirtBold!!
        }
        _TShirtBold = ImageVector.Builder(
            name = "Bold.TShirtBold",
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
                moveTo(192f, 120f)
                horizontalLineToRelative(26.32f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -4.42f)
                lineToRelative(17.9f, -36.81f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.1f, -10.52f)
                lineTo(192f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 120f)
                horizontalLineTo(37.68f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -4.42f)
                lineTo(12.82f, 78.77f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, -10.52f)
                lineTo(64f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 40f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                horizontalLineTo(64f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(40f)
                close()
            }
        }.build()

        return _TShirtBold!!
    }

@Suppress("ObjectPropertyName")
private var _TShirtBold: ImageVector? = null
