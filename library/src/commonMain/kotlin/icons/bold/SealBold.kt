package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SealBold: ImageVector
    get() {
        if (_SealBold != null) {
            return _SealBold!!
        }
        _SealBold = ImageVector.Builder(
            name = "Bold.SealBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(54.46f, 201.54f)
                curveToRelative(-9.2f, -9.2f, -3.1f, -28.53f, -7.78f, -39.85f)
                curveTo(41.82f, 150f, 24f, 140.5f, 24f, 128f)
                reflectiveCurveToRelative(17.82f, -22f, 22.68f, -33.69f)
                curveTo(51.36f, 83f, 45.26f, 63.66f, 54.46f, 54.46f)
                reflectiveCurveTo(83f, 51.36f, 94.31f, 46.68f)
                curveTo(106.05f, 41.82f, 115.5f, 24f, 128f, 24f)
                reflectiveCurveTo(150f, 41.82f, 161.69f, 46.68f)
                curveToRelative(11.32f, 4.68f, 30.65f, -1.42f, 39.85f, 7.78f)
                reflectiveCurveToRelative(3.1f, 28.53f, 7.78f, 39.85f)
                curveTo(214.18f, 106.05f, 232f, 115.5f, 232f, 128f)
                reflectiveCurveTo(214.18f, 150f, 209.32f, 161.69f)
                curveToRelative(-4.68f, 11.32f, 1.42f, 30.65f, -7.78f, 39.85f)
                reflectiveCurveToRelative(-28.53f, 3.1f, -39.85f, 7.78f)
                curveTo(150f, 214.18f, 140.5f, 232f, 128f, 232f)
                reflectiveCurveToRelative(-22f, -17.82f, -33.69f, -22.68f)
                curveTo(83f, 204.64f, 63.66f, 210.74f, 54.46f, 201.54f)
                close()
            }
        }.build()

        return _SealBold!!
    }

@Suppress("ObjectPropertyName")
private var _SealBold: ImageVector? = null
