package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.GreaterThan: ImageVector
    get() {
        if (_GreaterThan != null) {
            return _GreaterThan!!
        }
        _GreaterThan = ImageVector.Builder(
            name = "Regular.GreaterThan",
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
                moveTo(64f, 56f)
                lineToRelative(152f, 72f)
                lineToRelative(-152f, 72f)
            }
        }.build()

        return _GreaterThan!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThan: ImageVector? = null
