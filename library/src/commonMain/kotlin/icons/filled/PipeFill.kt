package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PipeFill: ImageVector
    get() {
        if (_PipeFill != null) {
            return _PipeFill!!
        }
        _PipeFill = ImageVector.Builder(
            name = "Filled.PipeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 104f)
                lineTo(208f, 104f)
                lineTo(208f, 56f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(205.83f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 32f)
                lineTo(176f, 32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.83f, 8f)
                lineTo(144f, 40f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 144f)
                verticalLineToRelative(18.16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 176f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13.84f)
                lineTo(40f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(56f, 208f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(120f, 205.84f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 192f)
                lineTo(128f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -13.84f)
                lineTo(120f, 144f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                horizontalLineToRelative(18.17f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 128f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.83f, -8f)
                lineTo(232f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(112f, 192f)
                lineTo(48f, 192f)
                lineTo(48f, 176f)
                horizontalLineToRelative(64f)
                close()
                moveTo(176f, 112f)
                lineTo(176f, 48f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(63.8f)
                curveToRelative(0f, 0.07f, 0f, 0.13f, 0f, 0.2f)
                close()
            }
        }.build()

        return _PipeFill!!
    }

@Suppress("ObjectPropertyName")
private var _PipeFill: ImageVector? = null
