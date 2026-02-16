package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.CheckBold: ImageVector
    get() {
        if (_CheckBold != null) {
            return _CheckBold!!
        }
        _CheckBold = ImageVector.Builder(
            name = "Bold.CheckBold",
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
                moveTo(40f, 144f)
                lineToRelative(56f, 56f)
                lineToRelative(128f, -128f)
            }
        }.build()

        return _CheckBold!!
    }

@Suppress("ObjectPropertyName")
private var _CheckBold: ImageVector? = null
