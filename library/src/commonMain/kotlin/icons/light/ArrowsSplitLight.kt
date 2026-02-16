package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.ArrowsSplitLight: ImageVector
    get() {
        if (_ArrowsSplitLight != null) {
            return _ArrowsSplitLight!!
        }
        _ArrowsSplitLight = ImageVector.Builder(
            name = "Light.ArrowsSplitLight",
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
                moveTo(96f, 184f)
                lineToRelative(-32f, 32f)
                lineToRelative(-32f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 184f)
                lineToRelative(-32f, 32f)
                lineToRelative(-32f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 24f)
                lineToRelative(0f, 48f)
                lineToRelative(-64f, 64f)
                lineToRelative(0f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 72f)
                lineToRelative(64f, 64f)
                lineToRelative(0f, 80f)
            }
        }.build()

        return _ArrowsSplitLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsSplitLight: ImageVector? = null
