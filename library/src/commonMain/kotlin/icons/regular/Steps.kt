package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.Steps: ImageVector
    get() {
        if (_Steps != null) {
            return _Steps!!
        }
        _Steps = ImageVector.Builder(
            name = "Regular.Steps",
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
                moveTo(16f, 200f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, -48f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, -48f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, -48f)
                lineToRelative(56f, 0f)
            }
        }.build()

        return _Steps!!
    }

@Suppress("ObjectPropertyName")
private var _Steps: ImageVector? = null
