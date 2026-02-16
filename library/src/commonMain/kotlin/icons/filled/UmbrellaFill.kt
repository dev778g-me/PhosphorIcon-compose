package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UmbrellaFill: ImageVector
    get() {
        if (_UmbrellaFill != null) {
            return _UmbrellaFill!!
        }
        _UmbrellaFill = ImageVector.Builder(
            name = "Filled.UmbrellaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 126.63f)
                arcTo(112.21f, 112.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                horizontalLineToRelative(0f)
                arcTo(112.21f, 112.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.05f, 126.63f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 144f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
                lineTo(136f, 144f)
                horizontalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -17.37f)
                close()
                moveTo(32f, 128f)
                arcToRelative(96.15f, 96.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.2f, -85.89f)
                curveTo(96.48f, 58f, 81.85f, 86.11f, 80.17f, 128f)
                lineTo(32f, 128f)
                close()
                moveTo(175.83f, 128f)
                curveToRelative(-1.68f, -41.89f, -16.31f, -70f, -28f, -85.94f)
                arcTo(96.07f, 96.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                close()
            }
        }.build()

        return _UmbrellaFill!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaFill: ImageVector? = null
