package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SubtractSquareDuotone: ImageVector
    get() {
        if (_SubtractSquareDuotone != null) {
            return _SubtractSquareDuotone!!
        }
        _SubtractSquareDuotone = ImageVector.Builder(
            name = "Duotone.SubtractSquareDuotone",
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
                moveTo(160f, 96f)
                lineToRelative(0f, 64f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, 56f)
                lineToRelative(120f, 0f)
                lineToRelative(0f, -120f)
                lineToRelative(-56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 96f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, 120f)
                lineToRelative(-120f, 0f)
                lineToRelative(0f, -56f)
            }
        }.build()

        return _SubtractSquareDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SubtractSquareDuotone: ImageVector? = null
