package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DetectiveFill: ImageVector
    get() {
        if (_DetectiveFill != null) {
            return _DetectiveFill!!
        }
        _DetectiveFill = ImageVector.Builder(
            name = "Filled.DetectiveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(8f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(35.92f, 112f)
                lineToRelative(47.5f, -65.41f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.31f, -0.72f)
                lineToRelative(12.85f, 14.9f)
                lineToRelative(0.2f, 0.23f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.44f, 0f)
                lineToRelative(0.2f, -0.23f)
                lineToRelative(12.85f, -14.9f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.31f, 0.72f)
                lineTo(220.08f, 112f)
                lineTo(248f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 120f)
                close()
                moveTo(180f, 144f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.77f, 32f)
                lineTo(111.77f, 176f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.83f, 16f)
                horizontalLineToRelative(36.12f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 180f, 144f)
                close()
            }
        }.build()

        return _DetectiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _DetectiveFill: ImageVector? = null
