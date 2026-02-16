package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.FramerLogoThin: ImageVector
    get() {
        if (_FramerLogoThin != null) {
            return _FramerLogoThin!!
        }
        _FramerLogoThin = ImageVector.Builder(
            name = "Thin.FramerLogoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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

        return _FramerLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _FramerLogoThin: ImageVector? = null
