package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ArrowUpRightLight: ImageVector
    get() {
        if (_ArrowUpRightLight != null) {
            return _ArrowUpRightLight!!
        }
        _ArrowUpRightLight = ImageVector.Builder(
            name = "Light.ArrowUpRightLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 192f)
                lineTo(192f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 64f)
                lineToRelative(104f, 0f)
                lineToRelative(0f, 104f)
            }
        }.build()

        return _ArrowUpRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightLight: ImageVector? = null
