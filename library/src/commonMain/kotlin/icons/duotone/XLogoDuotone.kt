package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.XLogoDuotone: ImageVector
    get() {
        if (_XLogoDuotone != null) {
            return _XLogoDuotone!!
        }
        _XLogoDuotone = ImageVector.Builder(
            name = "Duotone.XLogoDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(48f, 40f)
                lineToRelative(48f, 0f)
                lineToRelative(112f, 176f)
                lineToRelative(-48f, 0f)
                lineToRelative(-112f, -176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineToRelative(48f, 0f)
                lineToRelative(112f, 176f)
                lineToRelative(-48f, 0f)
                lineToRelative(-112f, -176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(113.88f, 143.53f)
                lineTo(48f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 40f)
                lineTo(142.12f, 112.47f)
            }
        }.build()

        return _XLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _XLogoDuotone: ImageVector? = null
