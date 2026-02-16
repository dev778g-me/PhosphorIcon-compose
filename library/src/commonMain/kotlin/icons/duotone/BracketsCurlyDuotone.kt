package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BracketsCurlyDuotone: ImageVector
    get() {
        if (_BracketsCurlyDuotone != null) {
            return _BracketsCurlyDuotone!!
        }
        _BracketsCurlyDuotone = ImageVector.Builder(
            name = "Duotone.BracketsCurlyDuotone",
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
                moveTo(176f, 216f)
                curveToRelative(64f, 0f, 0f, -88f, 64f, -88f)
                curveToRelative(-64f, 0f, 0f, -88f, -64f, -88f)
                horizontalLineTo(80f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 40f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
            }
        }.build()

        return _BracketsCurlyDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurlyDuotone: ImageVector? = null
