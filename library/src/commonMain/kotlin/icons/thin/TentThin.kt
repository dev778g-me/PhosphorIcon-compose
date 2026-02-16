package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.TentThin: ImageVector
    get() {
        if (_TentThin != null) {
            return _TentThin!!
        }
        _TentThin = ImageVector.Builder(
            name = "Thin.TentThin",
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
                moveTo(72f, 48f)
                lineToRelative(-64f, 144f)
                lineToRelative(128f, 0f)
                lineToRelative(-64f, -144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 192f)
                lineToRelative(112f, 0f)
                lineToRelative(-64f, -144f)
                lineToRelative(-112f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _TentThin!!
    }

@Suppress("ObjectPropertyName")
private var _TentThin: ImageVector? = null
