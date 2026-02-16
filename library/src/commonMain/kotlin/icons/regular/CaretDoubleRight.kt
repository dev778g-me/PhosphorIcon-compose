package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.CaretDoubleRight: ImageVector
    get() {
        if (_CaretDoubleRight != null) {
            return _CaretDoubleRight!!
        }
        _CaretDoubleRight = ImageVector.Builder(
            name = "Regular.CaretDoubleRight",
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
                moveTo(56f, 48f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 48f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
            }
        }.build()

        return _CaretDoubleRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleRight: ImageVector? = null
