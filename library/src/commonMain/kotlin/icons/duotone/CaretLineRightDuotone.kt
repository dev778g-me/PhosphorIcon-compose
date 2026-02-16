package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CaretLineRightDuotone: ImageVector
    get() {
        if (_CaretLineRightDuotone != null) {
            return _CaretLineRightDuotone!!
        }
        _CaretLineRightDuotone = ImageVector.Builder(
            name = "Duotone.CaretLineRightDuotone",
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
                moveTo(64f, 48f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                lineToRelative(0f, -160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 48f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                lineToRelative(0f, -160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 48f)
                lineTo(184f, 208f)
            }
        }.build()

        return _CaretLineRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineRightDuotone: ImageVector? = null
