package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.PintGlass: ImageVector
    get() {
        if (_PintGlass != null) {
            return _PintGlass!!
        }
        _PintGlass = ImageVector.Builder(
            name = "Regular.PintGlass",
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
                moveTo(56f, 32f)
                horizontalLineTo(200f)
                lineTo(176.85f, 225f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168.9f, 232f)
                horizontalLineTo(87.1f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.15f, 225f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60.8f, 72f)
                lineTo(195.2f, 72f)
            }
        }.build()

        return _PintGlass!!
    }

@Suppress("ObjectPropertyName")
private var _PintGlass: ImageVector? = null
