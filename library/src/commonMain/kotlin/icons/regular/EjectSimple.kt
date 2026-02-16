package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.EjectSimple: ImageVector
    get() {
        if (_EjectSimple != null) {
            return _EjectSimple!!
        }
        _EjectSimple = ImageVector.Builder(
            name = "Regular.EjectSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 200f)
                lineTo(32f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(33.82f, 138.8f)
                lineTo(115.48f, 38f)
                arcToRelative(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25f, 0f)
                lineTo(222.18f, 138.8f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.26f, 13.2f)
                horizontalLineTo(40.08f)
                arcTo(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.82f, 138.8f)
                close()
            }
        }.build()

        return _EjectSimple!!
    }

@Suppress("ObjectPropertyName")
private var _EjectSimple: ImageVector? = null
