package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.CaretLineDown: ImageVector
    get() {
        if (_CaretLineDown != null) {
            return _CaretLineDown!!
        }
        _CaretLineDown = ImageVector.Builder(
            name = "Regular.CaretLineDown",
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
                moveTo(208f, 72f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 192f)
                lineTo(208f, 192f)
            }
        }.build()

        return _CaretLineDown!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineDown: ImageVector? = null
