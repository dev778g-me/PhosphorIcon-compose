package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BooksFill: ImageVector
    get() {
        if (_BooksFill != null) {
            return _BooksFill!!
        }
        _BooksFill = ImageVector.Builder(
            name = "Filled.BooksFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.65f, 194.55f)
                lineTo(198.46f, 36.75f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19f, -12.39f)
                lineTo(132.65f, 34.42f)
                arcToRelative(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.3f, 19f)
                lineToRelative(33.19f, 157.8f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 169.16f, 224f)
                arcToRelative(16.25f, 16.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.38f, -0.36f)
                lineToRelative(46.81f, -10.06f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.65f, 194.55f)
                close()
                moveTo(136f, 50.15f)
                curveToRelative(0f, -0.06f, 0f, -0.09f, 0f, -0.09f)
                lineToRelative(46.8f, -10f)
                lineToRelative(3.33f, 15.87f)
                lineTo(139.33f, 66f)
                close()
                moveTo(146f, 97.53f)
                lineTo(142.65f, 81.63f)
                lineTo(189.47f, 71.57f)
                lineTo(192.81f, 87.47f)
                close()
                moveTo(216f, 197.94f)
                lineTo(169.2f, 207.94f)
                lineTo(165.87f, 192.07f)
                lineTo(212.67f, 182f)
                lineTo(216f, 197.85f)
                curveTo(216f, 197.91f, 216f, 197.94f, 216f, 197.94f)
                close()
                moveTo(104f, 32f)
                lineTo(56f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                lineTo(40f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(120f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 32f)
                close()
                moveTo(56f, 48f)
                horizontalLineToRelative(48f)
                lineTo(104f, 64f)
                lineTo(56f, 64f)
                close()
                moveTo(104f, 208f)
                lineTo(56f, 208f)
                lineTo(56f, 192f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()

        return _BooksFill!!
    }

@Suppress("ObjectPropertyName")
private var _BooksFill: ImageVector? = null
