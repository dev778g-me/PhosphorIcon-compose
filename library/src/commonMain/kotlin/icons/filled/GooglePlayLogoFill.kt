package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GooglePlayLogoFill: ImageVector
    get() {
        if (_GooglePlayLogoFill != null) {
            return _GooglePlayLogoFill!!
        }
        _GooglePlayLogoFill = ImageVector.Builder(
            name = "Filled.GooglePlayLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.82f, 114.18f)
                lineTo(72f, 18.16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.12f, 0f)
                arcTo(15.68f, 15.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 31.87f)
                verticalLineTo(224.13f)
                arcToRelative(15.68f, 15.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.92f, 13.67f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.12f, 0f)
                lineToRelative(167.78f, -96f)
                arcToRelative(15.76f, 15.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -27.64f)
                close()
                moveTo(160f, 139.31f)
                lineToRelative(18.92f, 18.92f)
                lineToRelative(-88.5f, 50.66f)
                close()
                moveTo(90.4f, 47.1f)
                lineToRelative(88.53f, 50.67f)
                lineTo(160f, 116.69f)
                close()
                moveTo(193.31f, 150f)
                lineToRelative(-22f, -22f)
                lineToRelative(22f, -22f)
                lineToRelative(38.43f, 22f)
                close()
            }
        }.build()

        return _GooglePlayLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePlayLogoFill: ImageVector? = null
