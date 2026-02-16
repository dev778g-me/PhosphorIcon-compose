package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.TextAUnderlineDuotone: ImageVector
    get() {
        if (_TextAUnderlineDuotone != null) {
            return _TextAUnderlineDuotone!!
        }
        _TextAUnderlineDuotone = ImageVector.Builder(
            name = "Duotone.TextAUnderlineDuotone",
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
                moveTo(82.82f, 128f)
                lineToRelative(90.36f, 0f)
                lineToRelative(-45.18f, -96f)
                lineToRelative(-45.18f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 168f)
                lineToRelative(-64f, -136f)
                lineToRelative(-64f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(173.18f, 128f)
                lineTo(82.82f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 216f)
                lineTo(216f, 216f)
            }
        }.build()

        return _TextAUnderlineDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TextAUnderlineDuotone: ImageVector? = null
