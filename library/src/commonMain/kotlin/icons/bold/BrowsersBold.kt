package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.BrowsersBold: ImageVector
    get() {
        if (_BrowsersBold != null) {
            return _BrowsersBold!!
        }
        _BrowsersBold = ImageVector.Builder(
            name = "Bold.BrowsersBold",
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
                moveTo(36f, 84f)
                lineTo(180f, 84f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 92f)
                lineTo(188f, 204f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 212f)
                lineTo(36f, 212f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 204f)
                lineTo(28f, 92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 84f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68f, 84f)
                verticalLineTo(52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(220f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(164f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(188f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(28f, 124f)
                lineTo(188f, 124f)
            }
        }.build()

        return _BrowsersBold!!
    }

@Suppress("ObjectPropertyName")
private var _BrowsersBold: ImageVector? = null
