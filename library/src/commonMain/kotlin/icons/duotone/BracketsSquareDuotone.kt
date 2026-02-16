package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BracketsSquareDuotone: ImageVector
    get() {
        if (_BracketsSquareDuotone != null) {
            return _BracketsSquareDuotone!!
        }
        _BracketsSquareDuotone = ImageVector.Builder(
            name = "Duotone.BracketsSquareDuotone",
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
                moveTo(40f, 40f)
                horizontalLineToRelative(176f)
                verticalLineToRelative(176f)
                horizontalLineToRelative(-176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 40f)
                lineToRelative(-40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                lineToRelative(40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(-40f, 0f)
            }
        }.build()

        return _BracketsSquareDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsSquareDuotone: ImageVector? = null
