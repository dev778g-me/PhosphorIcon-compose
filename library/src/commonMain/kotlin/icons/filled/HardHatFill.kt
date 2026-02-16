package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HardHatFill: ImageVector
    get() {
        if (_HardHatFill != null) {
            return _HardHatFill!!
        }
        _HardHatFill = ImageVector.Builder(
            name = "Filled.HardHatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 152f)
                lineTo(104f, 152f)
                lineTo(104f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                close()
                moveTo(224f, 168f)
                lineTo(32f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-8f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 168f)
                close()
                moveTo(224f, 148f)
                lineTo(224f, 136f)
                arcToRelative(96.44f, 96.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -50.11f, -84.31f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 55.22f)
                lineTo(168f, 152f)
                horizontalLineToRelative(52f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 148f)
                close()
                moveTo(36f, 152f)
                lineTo(88f, 152f)
                lineTo(88f, 55.22f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.89f, -3.53f)
                arcTo(96.44f, 96.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 136f)
                verticalLineToRelative(12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 152f)
                close()
            }
        }.build()

        return _HardHatFill!!
    }

@Suppress("ObjectPropertyName")
private var _HardHatFill: ImageVector? = null
