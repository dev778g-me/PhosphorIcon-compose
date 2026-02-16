package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.FramerLogo: ImageVector
    get() {
        if (_FramerLogo != null) {
            return _FramerLogo!!
        }
        _FramerLogo = ImageVector.Builder(
            name = "Regular.FramerLogo",
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
                moveTo(56f, 104f)
                lineToRelative(0f, 64f)
                lineToRelative(72f, 72f)
                lineToRelative(0f, -72f)
                lineToRelative(72f, 0f)
                lineToRelative(-144f, -128f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-144f, 0f)
                close()
            }
        }.build()

        return _FramerLogo!!
    }

@Suppress("ObjectPropertyName")
private var _FramerLogo: ImageVector? = null
