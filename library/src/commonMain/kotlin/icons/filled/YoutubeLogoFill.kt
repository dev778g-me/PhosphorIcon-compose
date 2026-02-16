package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.YoutubeLogoFill: ImageVector
    get() {
        if (_YoutubeLogoFill != null) {
            return _YoutubeLogoFill!!
        }
        _YoutubeLogoFill = ImageVector.Builder(
            name = "Filled.YoutubeLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(234.33f, 69.52f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.49f, -16.4f)
                curveTo(185.56f, 39.88f, 131f, 40f, 128f, 40f)
                reflectiveCurveToRelative(-57.56f, -0.12f, -91.84f, 13.12f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.49f, 16.4f)
                curveTo(19.08f, 79.5f, 16f, 97.74f, 16f, 128f)
                reflectiveCurveToRelative(3.08f, 48.5f, 5.67f, 58.48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.49f, 16.41f)
                curveTo(69f, 215.56f, 120.4f, 216f, 127.34f, 216f)
                horizontalLineToRelative(1.32f)
                curveToRelative(6.94f, 0f, 58.37f, -0.44f, 91.18f, -13.11f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.49f, -16.41f)
                curveToRelative(2.59f, -10f, 5.67f, -28.22f, 5.67f, -58.48f)
                reflectiveCurveTo(236.92f, 79.5f, 234.33f, 69.52f)
                close()
                moveTo(160.59f, 134.52f)
                lineTo(120.59f, 162.52f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 156f)
                lineTo(108f, 100f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.59f, -6.55f)
                lineToRelative(40f, 28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.1f)
                close()
            }
        }.build()

        return _YoutubeLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _YoutubeLogoFill: ImageVector? = null
