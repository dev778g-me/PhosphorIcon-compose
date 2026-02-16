package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChurchFill: ImageVector
    get() {
        if (_ChurchFill != null) {
            return _ChurchFill!!
        }
        _ChurchFill = ImageVector.Builder(
            name = "Filled.ChurchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.12f, 145.14f)
                lineTo(192f, 123.47f)
                lineTo(192f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -7f)
                lineTo(136f, 67.36f)
                lineTo(136f, 48f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(136f, 32f)
                lineTo(136f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 32f)
                lineTo(104f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                lineTo(120f, 67.36f)
                lineTo(68f, 97.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 7f)
                verticalLineToRelative(19.47f)
                lineTo(27.88f, 145.14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 152f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(112f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(232f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.12f, 145.14f)
                close()
                moveTo(64f, 208f)
                lineTo(40f, 208f)
                lineTo(40f, 156.53f)
                lineToRelative(24f, -14.4f)
                close()
                moveTo(216f, 208f)
                lineTo(192f, 208f)
                lineTo(192f, 142.13f)
                lineToRelative(24f, 14.4f)
                close()
            }
        }.build()

        return _ChurchFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChurchFill: ImageVector? = null
