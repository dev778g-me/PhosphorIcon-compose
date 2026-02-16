package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MopedFill: ImageVector
    get() {
        if (_MopedFill != null) {
            return _MopedFill!!
        }
        _MopedFill = ImageVector.Builder(
            name = "Filled.MopedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 128f)
                arcToRelative(39.3f, 39.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.27f, 0.5f)
                lineTo(175.49f, 37.19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 32f)
                lineTo(136f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(26.46f)
                lineToRelative(32.3f, 86.13f)
                arcToRelative(40.13f, 40.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18f, 25.87f)
                lineTo(136.54f, 160f)
                lineToRelative(-25f, -66.81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 88f)
                lineTo(24f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(13.39f)
                arcTo(56.12f, 56.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(8.8f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.4f, 0f)
                horizontalLineToRelative(81.6f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 216f, 128f)
                close()
                moveTo(56f, 192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, -16f)
                lineTo(78.62f, 176f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 192f)
                close()
                moveTo(216f, 192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.43f, -42.36f)
                lineToRelative(7.94f, 21.17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, -5.62f)
                lineTo(215.55f, 144f)
                lineTo(216f, 144f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                close()
            }
        }.build()

        return _MopedFill!!
    }

@Suppress("ObjectPropertyName")
private var _MopedFill: ImageVector? = null
