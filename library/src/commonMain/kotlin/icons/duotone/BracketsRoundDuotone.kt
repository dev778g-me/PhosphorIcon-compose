package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BracketsRoundDuotone: ImageVector
    get() {
        if (_BracketsRoundDuotone != null) {
            return _BracketsRoundDuotone!!
        }
        _BracketsRoundDuotone = ImageVector.Builder(
            name = "Duotone.BracketsRoundDuotone",
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
                moveTo(184f, 216f)
                reflectiveCurveToRelative(40f, -24f, 40f, -88f)
                reflectiveCurveToRelative(-40f, -88f, -40f, -88f)
                horizontalLineTo(72f)
                reflectiveCurveTo(32f, 64f, 32f, 128f)
                reflectiveCurveToRelative(40f, 88f, 40f, 88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                reflectiveCurveTo(32f, 64f, 32f, 128f)
                reflectiveCurveToRelative(40f, 88f, 40f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 40f)
                reflectiveCurveToRelative(40f, 24f, 40f, 88f)
                reflectiveCurveToRelative(-40f, 88f, -40f, 88f)
            }
        }.build()

        return _BracketsRoundDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsRoundDuotone: ImageVector? = null
