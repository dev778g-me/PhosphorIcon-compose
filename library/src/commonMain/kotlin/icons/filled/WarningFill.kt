package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WarningFill: ImageVector
    get() {
        if (_WarningFill != null) {
            return _WarningFill!!
        }
        _WarningFill = ImageVector.Builder(
            name = "Filled.WarningFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.8f, 188.09f)
                lineTo(149.35f, 36.22f)
                horizontalLineToRelative(0f)
                arcToRelative(24.76f, 24.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.7f, 0f)
                lineTo(19.2f, 188.09f)
                arcToRelative(23.51f, 23.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 23.72f)
                arcTo(24.35f, 24.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.55f, 224f)
                horizontalLineToRelative(174.9f)
                arcToRelative(24.35f, 24.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.33f, -12.19f)
                arcTo(23.51f, 23.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236.8f, 188.09f)
                close()
                moveTo(120f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 192f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 192f)
                close()
            }
        }.build()

        return _WarningFill!!
    }

@Suppress("ObjectPropertyName")
private var _WarningFill: ImageVector? = null
