package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CrosshairSimpleFill: ImageVector
    get() {
        if (_CrosshairSimpleFill != null) {
            return _CrosshairSimpleFill!!
        }
        _CrosshairSimpleFill = ImageVector.Builder(
            name = "Filled.CrosshairSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 216f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, -88f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                close()
                moveTo(176f, 136f)
                horizontalLineToRelative(23.54f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 199.54f)
                lineTo(136f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(23.54f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.46f, 136f)
                lineTo(80f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(56.46f, 120f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 56.46f)
                lineTo(120f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 56.46f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199.54f, 120f)
                lineTo(176f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
            }
        }.build()

        return _CrosshairSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CrosshairSimpleFill: ImageVector? = null
