package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.ArrowFatLineRight: ImageVector
    get() {
        if (_ArrowFatLineRight != null) {
            return _ArrowFatLineRight!!
        }
        _ArrowFatLineRight = ImageVector.Builder(
            name = "Regular.ArrowFatLineRight",
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
                moveTo(136f, 32f)
                lineToRelative(96f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 176f)
                lineTo(40f, 80f)
            }
        }.build()

        return _ArrowFatLineRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineRight: ImageVector? = null
