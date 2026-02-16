package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TireFill: ImageVector
    get() {
        if (_TireFill != null) {
            return _TireFill!!
        }
        _TireFill = ImageVector.Builder(
            name = "Filled.TireFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 128f)
                curveToRelative(0f, 22.09f, -7.16f, 40f, -16f, 40f)
                reflectiveCurveToRelative(-16f, -17.91f, -16f, -40f)
                reflectiveCurveToRelative(7.16f, -40f, 16f, -40f)
                reflectiveCurveTo(184f, 105.91f, 184f, 128f)
                close()
                moveTo(240f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(92f, 232f)
                curveToRelative(-33.64f, 0f, -60f, -45.68f, -60f, -104f)
                reflectiveCurveTo(58.36f, 24f, 92f, 24f)
                horizontalLineToRelative(72f)
                curveToRelative(33.64f, 0f, 60f, 45.68f, 60f, 104f)
                curveToRelative(0f, 37.47f, -10.88f, 69.73f, -27.59f, 88f)
                lineTo(232f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 224f)
                close()
                moveTo(57.87f, 111.81f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.64f, -1.49f)
                lineTo(80f, 97.83f)
                lineToRelative(13.28f, 9.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.3f, -13f)
                lineTo(84.65f, 81.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.3f, 0f)
                lineTo(53.21f, 97.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.66f, 14.51f)
                close()
                moveTo(104.54f, 159.7f)
                lineTo(84.65f, 145.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.3f, 0f)
                lineTo(56f, 159.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.3f, 13f)
                lineTo(80f, 161.83f)
                lineToRelative(15.24f, 10.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.3f, -13f)
                close()
                moveTo(193.74f, 192.07f)
                curveToRelative(9.19f, -17f, 14.26f, -39.74f, 14.26f, -64.07f)
                reflectiveCurveToRelative(-5.07f, -47.09f, -14.26f, -64.07f)
                curveTo(185.38f, 48.5f, 174.82f, 40f, 164f, 40f)
                reflectiveCurveToRelative(-21.38f, 8.5f, -29.74f, 23.93f)
                curveTo(125.07f, 80.91f, 120f, 103.67f, 120f, 128f)
                reflectiveCurveToRelative(5.07f, 47.09f, 14.26f, 64.07f)
                curveTo(142.62f, 207.5f, 153.18f, 216f, 164f, 216f)
                reflectiveCurveTo(185.38f, 207.5f, 193.74f, 192.07f)
                close()
            }
        }.build()

        return _TireFill!!
    }

@Suppress("ObjectPropertyName")
private var _TireFill: ImageVector? = null
