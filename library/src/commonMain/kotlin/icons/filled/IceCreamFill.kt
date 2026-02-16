package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.IceCreamFill: ImageVector
    get() {
        if (_IceCreamFill != null) {
            return _IceCreamFill!!
        }
        _IceCreamFill = ImageVector.Builder(
            name = "Filled.IceCreamFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 97.37f)
                lineTo(208f, 96f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 96f)
                verticalLineToRelative(1.37f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 144f)
                horizontalLineToRelative(3.29f)
                lineToRelative(54.82f, 95.94f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.78f, 0f)
                lineTo(196.71f, 144f)
                lineTo(200f, 144f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -46.63f)
                close()
                moveTo(146.89f, 198.94f)
                lineTo(115.5f, 144f)
                horizontalLineToRelative(19.29f)
                lineToRelative(21.75f, 38.06f)
                close()
                moveTo(77.71f, 144f)
                lineTo(97.07f, 144f)
                lineToRelative(40.61f, 71.06f)
                lineTo(128f, 232f)
                close()
                moveTo(165.71f, 165.94f)
                lineTo(153.21f, 144f)
                horizontalLineToRelative(25.08f)
                close()
            }
        }.build()

        return _IceCreamFill!!
    }

@Suppress("ObjectPropertyName")
private var _IceCreamFill: ImageVector? = null
