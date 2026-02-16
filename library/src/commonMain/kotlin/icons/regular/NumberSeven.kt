package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.NumberSeven: ImageVector
    get() {
        if (_NumberSeven != null) {
            return _NumberSeven!!
        }
        _NumberSeven = ImageVector.Builder(
            name = "Regular.NumberSeven",
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
                moveTo(88f, 48f)
                lineToRelative(80f, 0f)
                lineToRelative(-48f, 160f)
            }
        }.build()

        return _NumberSeven!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSeven: ImageVector? = null
