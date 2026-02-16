package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.EggDuotone: ImageVector
    get() {
        if (_EggDuotone != null) {
            return _EggDuotone!!
        }
        _EggDuotone = ImageVector.Builder(
            name = "Duotone.EggDuotone",
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
                moveTo(208f, 152f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                reflectiveCurveTo(208f, 88f, 208f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 152f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                reflectiveCurveTo(208f, 88f, 208f, 152f)
                close()
            }
        }.build()

        return _EggDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _EggDuotone: ImageVector? = null
