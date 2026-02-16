package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.BehanceLogoBold: ImageVector
    get() {
        if (_BehanceLogoBold != null) {
            return _BehanceLogoBold!!
        }
        _BehanceLogoBold = ImageVector.Builder(
            name = "Bold.BehanceLogoBold",
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
                moveTo(32f, 124f)
                horizontalLineTo(90f)
                arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 68f)
                horizontalLineTo(32f)
                verticalLineTo(64f)
                horizontalLineTo(86f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 60f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 76f)
                lineTo(232f, 76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(217.45f, 188f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 240f, 152f)
                horizontalLineTo(160f)
            }
        }.build()

        return _BehanceLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _BehanceLogoBold: ImageVector? = null
